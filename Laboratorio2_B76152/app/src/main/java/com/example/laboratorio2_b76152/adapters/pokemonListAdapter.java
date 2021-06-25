package com.example.laboratorio2_b76152.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.example.laboratorio2_b76152.Model.pokemon;
import com.example.laboratorio2_b76152.R;

import java.util.ArrayList;
import java.util.List;

public class pokemonListAdapter extends RecyclerView.Adapter<ItemPokemonviewHolder> {
    //se adaptan los datos para subirlos a la lista
    private List<pokemon> dataset;
    private pokemonListAdapter.RecyclerViewClickListener listener;

    private Context context;//esto es para usar glis y poder obtener la imagen del pokemon



    //constructor
    public pokemonListAdapter(List<pokemon> dataset) {
        this.dataset = dataset;
    }
    //default
    public pokemonListAdapter(Context context, RecyclerViewClickListener listener) {
        this.dataset = new ArrayList<>();
        this.context = context;
        this.listener = listener;
    }

    @Override
    public ItemPokemonviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       //llenamos el layout que hicimos
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        //se le indica cual es el layout
        View list_view = inflater.inflate(R.layout.item_pokemon,parent, false);//se pone false porque no es lo unico que va a estar en la pantalla
        ItemPokemonviewHolder itemPokemonviewHolder = new ItemPokemonviewHolder(list_view,listener);
        return itemPokemonviewHolder;
    }

    @Override
    public void onBindViewHolder(ItemPokemonviewHolder holder, int position) {
        final pokemon p = dataset.get(position);
        holder.pokemon_name.setText(p.getName());
        Glide.with(context).load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/" + p.getPokemon_id() + ".png")
                .centerCrop()
                .transition(new DrawableTransitionOptions().crossFade())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.pokemon_icon);

    }

    @Override
    public int getItemCount() {//cuantos elementos vamos a tener
        return dataset.size();
    }


    public void addPokemons(ArrayList<pokemon> pokemon_list) {
        this.dataset.addAll(pokemon_list);//le setea la info de lalista
        notifyDataSetChanged();//se actualizara el recycler view en pantalla
    }

    //interface
    public interface RecyclerViewClickListener{

        void OnClick(View v, int adapterPosition);
    }
}//adapter de la lista de los pokemons
