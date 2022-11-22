package com.example.pokemon.ui.fragments

import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.pokemon.R
import com.example.pokemon.base.BaseFragment
import com.example.pokemon.common.Resource
import com.example.pokemon.databinding.FragmentPokemonBinding
import com.example.pokemon.ui.adapters.PokemonAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PokemonFragment :
    BaseFragment<PokemonViewModel, FragmentPokemonBinding>(R.layout.fragment_pokemon) {

    override val binding by viewBinding(FragmentPokemonBinding::bind)
    override val viewModel: PokemonViewModel by viewModels()
    private val pokemonAdapter = PokemonAdapter()

    override fun initialize() {
        binding.recyclerPokemons.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = pokemonAdapter
        }
    }

    override fun setupObserve() {
        viewModel.fetchPokemon().observe(viewLifecycleOwner) {
            when (it) {
                is Resource.Error -> {
                    Toast.makeText(requireContext(), "An error has occurred", Toast.LENGTH_SHORT)
                        .show()
                }
                is Resource.Loading ->{}
                is Resource.Success ->{pokemonAdapter.submitList(it.data?.results)}
            }
        }
    }
}