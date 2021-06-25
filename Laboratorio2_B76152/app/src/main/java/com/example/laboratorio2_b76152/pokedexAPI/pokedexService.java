package com.example.laboratorio2_b76152.pokedexAPI;

import com.example.laboratorio2_b76152.Model.PokemonRequest;
import com.example.laboratorio2_b76152.Model.rootInfoPokemon;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface pokedexService {
    @GET("pokemon/?limit=50")
    Call<PokemonRequest> obtainListPokemon();

    //metodo get que obtiene la informacion del pokemon especifico

    @GET("pokemon/{id}")
    Call<rootInfoPokemon> obtainInfoPokemon(@Path("id") int id);


}
