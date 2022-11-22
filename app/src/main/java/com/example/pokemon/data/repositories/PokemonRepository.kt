package com.example.pokemon.data.repositories

import androidx.lifecycle.liveData
import com.example.pokemon.common.Resource
import com.example.pokemon.data.remote.apisevices.PokemonApiService
import javax.inject.Inject

class PokemonRepository @Inject constructor(
    private val pokemonApiService: PokemonApiService){

    fun fetchPokemon() = liveData {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(pokemonApiService.fetchPokemon()))
        } catch (exception: Exception) {
            emit(Resource.Error(message = exception.localizedMessage ?: "Error"))
        }
    }
}