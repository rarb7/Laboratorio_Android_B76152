package com.example.laboratorio2_b76152;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.laboratorio2_b76152.Model.rootInfoPokemon;
import com.example.laboratorio2_b76152.pokedexAPI.pokedexService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Pokemon_characteristic_Activity extends AppCompatActivity {
//   static final TAG = "POKEDEX";

    private Retrofit retrofit;
    private ImageView img_pokemon;
    private TextView height;
    private TextView id;
    private TextView weight;
    private TextView nombre;
    private TextView base_experience;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acativity_characteristic_pokemon);

        retrofit= new Retrofit.Builder()
                .baseUrl("https://pokeapi.co/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        initInformacion();
    }

    private void initInformacion(){
        weight = findViewById(R.id.pokemon_Weight);
        id = findViewById(R.id.pokemon_id);
        height = findViewById(R.id.pokemon_height);
        img_pokemon = findViewById(R.id.imageView);
        nombre = findViewById(R.id.name_pokemon);
        base_experience = findViewById(R.id.pokemon_Abilities);
        int pokemonNumber = getIntent().getIntExtra("pokemon_id",1);
        String pokemonName = getIntent().getStringExtra("pokemon_name");

        String pokemonImageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/" + pokemonNumber + ".png";
        Glide.with(this)
                .load(pokemonImageUrl)
                .into(img_pokemon);
        id.setText("ID Pokemon: "+pokemonNumber);
        nombre.setText("Name: "+pokemonName);
        pokedexService service = retrofit.create(pokedexService.class);

        Call<rootInfoPokemon> pokedexRequestCall = service.obtainInfoPokemon(pokemonNumber);
        pokedexRequestCall.enqueue(new Callback<rootInfoPokemon>() {
            @Override
            public void onResponse(Call<rootInfoPokemon> call, Response<rootInfoPokemon> response) {
                if(response.isSuccessful()){
                    rootInfoPokemon rp = response.body();

                    weight.setText("WEIGHT: "+rp.getWeight()+"kg");
                    height.setText("HEIGHT: "+rp.getHeight()+"m");
                    base_experience.setText("BASE EXPERIENCE: "+rp.getBase_experience()+"EXP");
//                    PokemonInfoRequest pir = response.body();
//                    pokemonInfo pokeINfo = pir.getResultsInfoPokemon();
//                    if (pokeINfo.getId() != 1)
//                        Log.e(null, " esta vacio el pokeInfo" );

                }else{

                    Log.e(null, " no fue exitoso");

                }
            }

            @Override
            public void onFailure(Call<rootInfoPokemon> call, Throwable t) {

            }

        });


//        if (pokedexRequestCall==null){Log.e(null, " no esta vacio" );}else{  Log.e(null, " no esta vacio el pokedexRequestCall"+pokedexRequestCall.toString() );}
//        pokedexRequestCall.enqueue(new Callback<PokemonInfoRequest>() {
//            @Override
//            public void onResponse(Call<PokemonInfoRequest> call, Response<PokemonInfoRequest> response) {
//                if(response.isSuccessful()) {//si la respuesta es existosa
//
//                    PokemonInfoRequest pokemonRequest = response.body();
//                    ArrayList<rootInfoPokemon> pokemon_list = pokemonRequest.getResultsInfoPokemon();
//                    if(response.body() == null){
//                        Log.e(null,"esta vacio");
//                    }else{
////                        for (int i=0; i< pokemon_list.size();i++){
////                            rootInfoPokemon po = pokemon_list.get(i);
//                        Log.e(null, " no esta vacio body" + response.body().getResultsInfoPokemon().toString());//}
//                    }
                   // Log.e(null,"holaaaaaaaaaa"+service.obtainInfoPokemon(pokemonNumber).toString());

//                  weight.setText("Weight: "+ String.valueOf( pokemon_list.getWeight()));

//                }//fin if

//            }
//
//            @Override
//            public void onFailure(Call<PokemonInfoRequest> call, Throwable t) {
//
//            }
//        });
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
}//activity que muestra la Iformacion general de cada pokemon
