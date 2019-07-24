package br.com.bfo.gameslibrary.data.model

import com.google.gson.annotations.SerializedName

data class PlatformResponse (
    val id: Long,
    @SerializedName(value = "name")
    val name: String,
    @SerializedName(value = "api_detail_url")
    val apiDetailUrl: String,
    @SerializedName(value = "abbreviation")
    val abbreviation: String
)
