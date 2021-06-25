package com.example.laboratorio2_b76152;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.laboratorio2_b76152.Model.PokemonRequest;
import com.example.laboratorio2_b76152.Model.pokemon;
import com.example.laboratorio2_b76152.adapters.pokemonListAdapter;
import com.example.laboratorio2_b76152.pokedexAPI.pokedexService;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private RecyclerView pokemonsListRecycler;//apunta al elemento con el que quiero trabajar en el view
    private Retrofit retrofit;
    private pokemonListAdapter pokemonListA;
    private ArrayList<pokemon> pokemonList;
    private pokemonListAdapter.RecyclerViewClickListener listener;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setOnClickListener();
        this.pokemonsListRecycler = findViewById(R.id.pokemonsListRecycler);
        pokemonListA = new pokemonListAdapter(this,listener);

        pokemonsListRecycler.setAdapter(pokemonListA);
        pokemonsListRecycler.setLayoutManager(new LinearLayoutManager(this));

        retrofit= new Retrofit.Builder()
                        .baseUrl("https://pokeapi.co/api/v2/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
        //se enlazan nuestras variables
        obtain_list_pokemons();
//        this.select = findViewById(R.id.button);
//
//        //si selecciona que visualice la siguiente pagina
//        select.setOnClickListener(v ->{
//            Intent  pokemonCaracteristics = new Intent(getApplicationContext(),Pokemon_characteristic_Activity.class);
//            startActivity(pokemonCaracteristics);
//
//        });

    }//apunta el view que quiero

    //set on cllick listener
    private void setOnClickListener() {
        listener = new pokemonListAdapter.RecyclerViewClickListener() {
            @Override
            public void OnClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), Pokemon_characteristic_Activity.class);
                intent.putExtra("pokemon_name",pokemonList.get(position).getName() );
                intent.putExtra("pokemon_id",pokemonList.get(position).getPokemon_id() );
                startActivity(intent);
            }//se envia el nuevo activity al darle click a nuestro objeto
        };
    }


    private void obtain_list_pokemons(){
        pokedexService service = retrofit.create(pokedexService.class);
        Call<PokemonRequest>    pokedexRequestCall = service.obtainListPokemon();
        pokedexRequestCall.enqueue(new Callback<PokemonRequest>() {
            @Override
            public void onResponse(Call<PokemonRequest> call, Response<PokemonRequest> response) {
                if(response.isSuccessful()){//si la respuesta es existosa

                    PokemonRequest pokemonRequest = response.body();
                    ArrayList<pokemon>  pokemon_list = pokemonRequest.getResults();
                    pokemonList = pokemon_list;
                    pokemonListA.addPokemons(pokemon_list);

                }
            }

            @Override
            public void onFailure(Call<PokemonRequest> call, Throwable t) {

            }
        });
    }

    //metodos on


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}//fin clase