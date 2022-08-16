package com.example.rickmortycliente.data.api

import com.example.rickmortycliente.data.api.model.Characters
import retrofit2.http.GET

interface RickMortyApi {
    @GET("character")
    suspend fun getCharacters(): Characters

}