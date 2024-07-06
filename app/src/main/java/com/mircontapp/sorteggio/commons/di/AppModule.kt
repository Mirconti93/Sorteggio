package com.mircontapp.sportalbum.commons.di

import com.mircontapp.sorteggio.data.datasource.SorteggioDataSourceImpl
import com.mircontapp.sorteggio.data.respository.SorteggioRepositoryImpl
import com.mircontapp.sorteggio.domain.datasource.SorteggioDataSource
import com.mircontapp.sorteggio.domain.repository.SorteggioRepository
import com.mircontapp.sorteggio.domain.usecases.GetTeamsUC
import com.mircontapp.sorteggio.domain.usecases.SaveTeamUC
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    fun provideAlbumDataSource(): SorteggioDataSource {
        return SorteggioDataSourceImpl()
    }

    @Provides
    fun provideSorteggioRepository(): SorteggioRepository {
        return SorteggioRepositoryImpl(provideAlbumDataSource())
    }

    @Provides
    fun provideGetTeamsUC(): GetTeamsUC {
        return GetTeamsUC(provideSorteggioRepository())
    }
    @Provides
    fun provideSaveTeamUC(): SaveTeamUC {
        return SaveTeamUC(provideSorteggioRepository())
    }
}