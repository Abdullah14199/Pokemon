package com.example.pokemon.network;


import com.example.pokemon.model.pokemonResponse;


import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;

public interface pokemonApiService {

    @GET("pokemon")
    Observable<pokemonResponse> getPokemons();

}
