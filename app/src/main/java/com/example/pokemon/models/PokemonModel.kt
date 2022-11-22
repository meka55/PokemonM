package com.example.pokemon.models

import com.example.pokemon.base.IBaseDiffUtil
import com.google.gson.annotations.SerializedName

class PokemonModel(
    @SerializedName ("name")
    override val name:String,
    @SerializedName("url")
    val url: String
):IBaseDiffUtil