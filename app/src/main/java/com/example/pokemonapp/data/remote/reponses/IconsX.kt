package com.example.pokemonapp.data.remote.reponses


import com.google.gson.annotations.SerializedName

data class IconsX(
    @SerializedName("front_default")
    val frontDefault: String,
    @SerializedName("front_female")
    val frontFemale: Any
)