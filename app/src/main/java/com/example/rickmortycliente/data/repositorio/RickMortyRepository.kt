package com.example.rickmortycliente.data.repositorio

import com.example.rickmortycliente.data.api.RickMortyApi
import com.example.rickmortycliente.data.api.model.Characters
import javax.inject.Inject

class RickMortyRepository @Inject constructor(
    private val rickMortyApi: RickMortyApi
){
    suspend fun getCharacters(): Characters{
        return rickMortyApi.getCharacters()
    }

}