package br.com.bfo.gameslibrary.data.model

import com.google.gson.annotations.SerializedName

data class GameResponse (
    val id: Long,
    @SerializedName("name")
    val name: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("deck")
    val deck: String,
    @SerializedName("api_detail_url")
    val apiDetailUrl: String,
    @SerializedName(value = "original_release_date")
    val originalReleaseDate: String
)

