package com.example.pokemon.data.remote.apisevices

import com.example.pokemon.models.PokemonResponse
import com.example.pokemon.models.PokemonModel
import retrofit2.http.GET

interface PokemonApiService {

    @GET("api/v2/pokemon")
    suspend fun fetchPokemon(): PokemonResponse<PokemonModel>
}