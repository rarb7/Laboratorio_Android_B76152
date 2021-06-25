package com.example.laboratorio2_b76152.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.laboratorio2_b76152.R;

public class ItemPokemonviewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    ImageView pokemon_icon;
    TextView  pokemon_name;
    private pokemonListAdapter.RecyclerViewClickListener listener;

    public ItemPokemonviewHolder(View itemView, pokemonListAdapter.RecyclerViewClickListener listener) {
        super(itemView);
        this.listener = listener;
        //se linke con el view holder
        pokemon_icon = itemView.findViewById(R.id.pokemon_icon);
        pokemon_name = itemView.findViewById(R.id.pokemon_name);
        itemView.setOnClickListener(this);
    }//constructor


    @Override
    public void onClick(View v) {
        listener.OnClick(v,getAdapterPosition());
    }
}//visualizacion de mi lista
