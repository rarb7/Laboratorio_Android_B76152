package com.example.laboratorio2_b76152.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class PokemonInfoRequest {

    //resultados de la informacion de los pokemones


         public ArrayList<rootInfoPokemon> getResultsInfoPokemon() {
        return resultsInfoPokemon;
        }
    @SerializedName("data")
    @Expose
         private ArrayList<rootInfoPokemon> resultsInfoPokemon = new ArrayList<>();
}
