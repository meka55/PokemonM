package com.example.pokemon.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.pokemon.base.BaseDiffutilsCallBack
import com.example.pokemon.databinding.ItemPokemonBinding
import com.example.pokemon.models.PokemonModel

class PokemonAdapter :
    ListAdapter<PokemonModel,PokemonAdapter.ViewHolder>(BaseDiffutilsCallBack()) {

    class ViewHolder(private val binding: ItemPokemonBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(item: PokemonModel?) {
            binding.pokemonNameItem.text = item?.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemPokemonBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }
}