package com.example.pokemon.ui.fragments

import androidx.lifecycle.ViewModel
import com.example.pokemon.data.repositories.PokemonRepository
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class PokemonViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    fun fetchPokemon() = repository.fetchPokemon()
}