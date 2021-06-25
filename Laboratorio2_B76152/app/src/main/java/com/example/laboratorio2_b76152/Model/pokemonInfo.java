package com.example.laboratorio2_b76152.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class pokemonInfo {
    @SerializedName("base_experience")
    @Expose
    public int base_experience;
    //    @SerializedName("forms")
//    public List<Form> forms;
//    @SerializedName("game_indices")
//    public List<GameIndice> game_indices;
    @SerializedName("height")
    @Expose
    public int height;
    //    @SerializedName("held_items")
//    public List<Object> held_items;
    @SerializedName("id")
    @Expose
    public int id;
    @SerializedName("is_default")
    @Expose
    public boolean is_default;
    @SerializedName("location_area_encounters")
    @Expose
    public String location_area_encounters;
    //    @SerializedName("moves")
//    public List<Move> moves;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("order")
    @Expose
    public int order;
        @SerializedName("past_types")
        @Expose
    public List<Object> past_types;
    @SerializedName("species")
    @Expose
    public Species species;
    @SerializedName("sprites")
    @Expose
    public Sprites sprites;
    @SerializedName("stats")
    @Expose
    public List<Stat> stats;
    @SerializedName("types")
    @Expose
    public List<Type> types;
    @SerializedName("weight")
    @Expose
    public int weight;

    public int getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(int base_experience) {
        this.base_experience = base_experience;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIs_default() {
        return is_default;
    }

    public void setIs_default(boolean is_default) {
        this.is_default = is_default;
    }

    public String getLocation_area_encounters() {
        return location_area_encounters;
    }

    public void setLocation_area_encounters(String location_area_encounters) {
        this.location_area_encounters = location_area_encounters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
