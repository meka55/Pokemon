package com.example.pokemon.models

import com.google.gson.annotations.SerializedName

class Info(
    @SerializedName("next")
    val next:String?
//    @SerializedName("info")
//    val count:Int,
//    @SerializedName("pages")
//    val pages:Int,
//    @SerializedName("prev")
//    val prev:String?
)