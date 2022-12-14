package com.example.rickmortycliente.di

import com.example.rickmortycliente.data.api.ConstantesApi
import com.example.rickmortycliente.data.api.RickMortyApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)

object RickMortyapiModule {
    @Provides
    @Singleton
    fun providesApi(): RickMortyApi{
        return Retrofit.Builder()
            .baseUrl(ConstantesApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RickMortyApi::class.java)
    }
}