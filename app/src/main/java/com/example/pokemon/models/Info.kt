package com.example.pokemon.models

import com.google.gson.annotations.SerializedName

class Info(
    @SerializedName("info")
    val count:Int,
    @SerializedName("pages")
    val pages:Int,
    @SerializedName("next")
    val next:String?,
    @SerializedName("prev")
    val prev:String?
)