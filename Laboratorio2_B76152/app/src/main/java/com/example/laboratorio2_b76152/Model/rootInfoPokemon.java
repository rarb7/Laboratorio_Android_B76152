package com.example.laboratorio2_b76152.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */
 class Ability2{
    public String name;
    public String url;
}

class Ability{
    public Ability ability;
    public boolean is_hidden;
    public int slot;
}

class Form{
    public String name;
    public String url;
}

 class Version{
    public String name;
    public String url;
}

 class GameIndice{
    public int game_index;
    public Version version;
}

 class Move2{
    public String name;
    public String url;
}

class MoveLearnMethod{
    public String name;
    public String url;
}

class VersionGroup{
    public String name;
    public String url;
}

 class VersionGroupDetail{
    public int level_learned_at;
    public MoveLearnMethod move_learn_method;
    public VersionGroup version_group;
}

 class Move{
    public Move move;
    public List<VersionGroupDetail> version_group_details;
}

class Species{
    public String name;
    public String url;
}

 class DreamWorld{
    public String front_default;
    public Object front_female;
}

 class OfficialArtwork{
    public String front_default;
}

 class Other{
    public DreamWorld dream_world;
    @SerializedName("official-artwork")
    public OfficialArtwork officialArtwork;
}

 class RedBlue{
    public String back_default;
    public String back_gray;
    public String front_default;
    public String front_gray;
}

 class Yellow{
    public String back_default;
    public String back_gray;
    public String front_default;
    public String front_gray;
}

 class GenerationI{
     @SerializedName("red-blue")
     public RedBlue redBlue;
    public Yellow yellow;
}

 class Crystal{
    public String back_default;
    public String back_shiny;
    public String front_default;
    public String front_shiny;
}

 class Gold{
    public String back_default;
    public String back_shiny;
    public String front_default;
    public String front_shiny;
}

 class Silver{
    public String back_default;
    public String back_shiny;
    public String front_default;
    public String front_shiny;
}

 class GenerationIi{
    public Crystal crystal;
    public Gold gold;
    public Silver silver;
}

 class Emerald{
    public String front_default;
    public String front_shiny;
}

 class FireredLeafgreen{
    public String back_default;
    public String back_shiny;
    public String front_default;
    public String front_shiny;
}

 class RubySapphire{
    public String back_default;
    public String back_shiny;
    public String front_default;
    public String front_shiny;
}

 class GenerationIii{
    public Emerald emerald;
     @SerializedName("firered-leafgreen")
     public FireredLeafgreen fireredLeafgreen;
     @SerializedName("ruby-sapphire")
     public RubySapphire rubySapphire;
}

 class DiamondPearl{
    public String back_default;
    public Object back_female;
    public String back_shiny;
    public Object back_shiny_female;
    public String front_default;
    public Object front_female;
    public String front_shiny;
    public Object front_shiny_female;
}

 class HeartgoldSoulsilver{
    public String back_default;
    public Object back_female;
    public String back_shiny;
    public Object back_shiny_female;
    public String front_default;
    public Object front_female;
    public String front_shiny;
    public Object front_shiny_female;
}

 class Platinum{
    public String back_default;
    public Object back_female;
    public String back_shiny;
    public Object back_shiny_female;
    public String front_default;
    public Object front_female;
    public String front_shiny;
    public Object front_shiny_female;
}

 class GenerationIv{
     @SerializedName("ruby-sapphire")
     public DiamondPearl diamondPearl;
     @SerializedName("ruby-sapphire")
     public HeartgoldSoulsilver heartgoldSoulsilver;
    public Platinum platinum;
}

 class Animated{
    public String back_default;
    public Object back_female;
    public String back_shiny;
    public Object back_shiny_female;
    public String front_default;
    public Object front_female;
    public String front_shiny;
    public Object front_shiny_female;
}

 class BlackWhite{
    public Animated animated;
    public String back_default;
    public Object back_female;
    public String back_shiny;
    public Object back_shiny_female;
    public String front_default;
    public Object front_female;
    public String front_shiny;
    public Object front_shiny_female;
}

 class GenerationV{
     @SerializedName("black-white")
     public BlackWhite blackWhite;
}

 class OmegarubyAlphasapphire{
    public String front_default;
    public Object front_female;
    public String front_shiny;
    public Object front_shiny_female;
}

 class XY{
    public String front_default;
    public Object front_female;
    public String front_shiny;
    public Object front_shiny_female;
}

 class GenerationVi{
     @SerializedName("omegaruby-alphasapphire")
     public OmegarubyAlphasapphire omegarubyAlphasapphire;
     @SerializedName("x-y")
     public XY xY;
}

 class Icons{
    public String front_default;
    public Object front_female;
}

 class UltraSunUltraMoon{
    public String front_default;
    public Object front_female;
    public String front_shiny;
    public Object front_shiny_female;
}

 class GenerationVii{
    public Icons icons;
     @SerializedName("ultra-sun-ultra-moon")
     public UltraSunUltraMoon ultraSunUltraMoon;
}
class GenerationViii{
    public Icons icons;
}

 class Versions{
     @SerializedName("generation-i")
     public GenerationI generationI;
     @SerializedName("generation-ii")
     public GenerationIi generationIi;
     @SerializedName("generation-iii")
    public GenerationIii generationIii;
     @SerializedName("generation-iv")
     public GenerationIv generationIv;
     @SerializedName("generation-v")
     public GenerationV generationV;
     @SerializedName("generation-vi")
     public GenerationVi generationVi;
     @SerializedName("generation-vii")
     public GenerationVii generationVii;
     @SerializedName("generation-viii")
     public GenerationViii generationViii;
}

 class Sprites{
    public String back_default;
    public Object back_female;
    public String back_shiny;
    public Object back_shiny_female;
    public String front_default;
    public Object front_female;
    public String front_shiny;
    public Object front_shiny_female;
    public Other other;
    public Versions versions;
}

class Stat2{
    public String name;
    public String url;
}

class Stat{
    public int base_stat;
    public int effort;
    public Stat stat;
}

class Type2{
    public String name;
    public String url;
}

class Type{
    public int slot;
    public Type type;
}

public class rootInfoPokemon{
//     @SerializedName("abilities")
//    public List<Ability> abilities;
    @SerializedName("base_experience")
    public int base_experience;
//    @SerializedName("forms")
//    public List<Form> forms;
//    @SerializedName("game_indices")
//    public List<GameIndice> game_indices;
    @SerializedName("height")
    public int height;
//    @SerializedName("held_items")
//    public List<Object> held_items;
    @SerializedName("id")
    public int id;
    @SerializedName("is_default")
    public boolean is_default;
    @SerializedName("location_area_encounters")
    public String location_area_encounters;
//    @SerializedName("moves")
//    public List<Move> moves;
    @SerializedName("name")
    public String name;
    @SerializedName("order")
    public int order;
//    @SerializedName("past_types")
//    public List<Object> past_types;
//    @SerializedName("species")
//    public Species species;
//    @SerializedName("sprites")
//    public Sprites sprites;
//    @SerializedName("stats")
//    public List<Stat> stats;
//    @SerializedName("types")
//    public List<Type> types;
    @SerializedName("weight")
    public int weight;

//    public List<Ability> getAbilities() {
//        return abilities;
//    }
//
//    public void setAbilities(List<Ability> abilities) {
//        this.abilities = abilities;
//    }

    public int getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(int base_experience) {
        this.base_experience = base_experience;
    }

//    public List<Form> getForms() {
//        return forms;
//    }
//
//    public void setForms(List<Form> forms) {
//        this.forms = forms;
//    }
//
//    public List<GameIndice> getGame_indices() {
//        return game_indices;
//    }
//
//    public void setGame_indices(List<GameIndice> game_indices) {
//        this.game_indices = game_indices;
//    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

//    public List<Object> getHeld_items() {
//        return held_items;
//    }

//    public void setHeld_items(List<Object> held_items) {
//        this.held_items = held_items;
//    }

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

//    public List<Move> getMoves() {
//        return moves;
//    }
//
//    public void setMoves(List<Move> moves) {
//        this.moves = moves;
//    }

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

//    public List<Object> getPast_types() {
//        return past_types;
//    }
//
//    public void setPast_types(List<Object> past_types) {
//        this.past_types = past_types;
//    }

//    public Species getSpecies() {
//        return species;
//    }
//
//    public void setSpecies(Species species) {
//        this.species = species;
//    }

//    public Sprites getSprites() {
//        return sprites;
//    }
//
//    public void setSprites(Sprites sprites) {
//        this.sprites = sprites;
//    }
//
//    public List<Stat> getStats() {
//        return stats;
//    }
//
//    public void setStats(List<Stat> stats) {
//        this.stats = stats;
//    }
//
//    public List<Type> getTypes() {
//        return types;
//    }
//
//    public void setTypes(List<Type> types) {
//        this.types = types;
//    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


}


