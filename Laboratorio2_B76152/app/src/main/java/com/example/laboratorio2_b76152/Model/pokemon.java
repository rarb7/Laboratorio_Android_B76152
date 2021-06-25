package com.example.laboratorio2_b76152.Model;

import java.util.HashMap;
import java.util.Map;

public class pokemon {
    private  int   pokemon_id;
    private String name;

    private String url;


    public int getPokemon_id() {
        String[] urlSlices = url.split("/");
        return Integer.parseInt(urlSlices[urlSlices.length-1]);
    }

    public void setPokemon_id(int pokemon_id) {
        this.pokemon_id = pokemon_id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getUrl() {
        return url;
    }


    public void setUrl(String url) {
        this.url = url;
    }

}//clase pokemon
