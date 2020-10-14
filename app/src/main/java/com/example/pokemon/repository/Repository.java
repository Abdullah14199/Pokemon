package com.example.pokemon.repository;

import com.example.pokemon.model.pokemonResponse;
import com.example.pokemon.network.pokemonApiService;

import javax.inject.Inject;

import io.reactivex.rxjava3.core.Observable;


public class Repository
{
    private pokemonApiService pokemonApiService;

    @Inject
    public Repository(com.example.pokemon.network.pokemonApiService pokemonApiService) {
        this.pokemonApiService = pokemonApiService;
    }

    public Observable<pokemonResponse> getPokemons()
    {
        return pokemonApiService.getPokemons();
    }
}
