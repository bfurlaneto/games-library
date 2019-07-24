package br.com.bfo.gameslibrary.data.api

import br.com.bfo.gameslibrary.data.model.GameResponse
import br.com.bfo.gameslibrary.data.model.PlatformResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.QueryMap

interface GamesLibraryService {
    @GET("/api/games/")
    fun getGames(@QueryMap queryParams: Map<String, String>): Response<List<GameResponse>>

    @GET(value = "/api/platforms/")
    fun getPlatforms(@QueryMap queryParams: Map<String, String>): Response<List<PlatformResponse>>
}