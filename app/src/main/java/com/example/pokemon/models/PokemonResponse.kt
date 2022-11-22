package com.example.pokemon.models

import com.google.gson.annotations.SerializedName

class PokemonResponse<T>(
    @SerializedName("count")
    val count:Int,
    @SerializedName("next")
    val next : String?,
    @SerializedName("info")
    val info: Info,
    @SerializedName("results")
    val results: List<T>
)