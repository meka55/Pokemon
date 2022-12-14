package com.example.pokemon.di

import com.example.pokemon.data.remote.RetrofitClient
import com.example.pokemon.data.remote.apisevices.PokemonApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    private val retrofitClient = RetrofitClient()

    @Singleton
    @Provides
    fun providePokemonApiService(): PokemonApiService{
        return retrofitClient.providePokemonApiService()
    }
}