package com.mircontapp.sportalbum.commons.di

import com.mircontapp.sorteggio.data.datasource.SorteggioDataSourceImpl
import com.mircontapp.sorteggio.data.respository.SorteggioRepositoryImpl
import com.mircontapp.sorteggio.domain.datasource.SorteggioDataSource
import com.mircontapp.sorteggio.domain.repository.SorteggioRepository
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    fun provideAlbumDataSource(): SorteggioDataSource {
        //return AssetsDataSource(SportAlbumApplication.instance.applicationContext.assets)
        return SorteggioDataSourceImpl()
    }

    @Provides
    fun provideSorteggioRepository(): SorteggioRepository {
        //return AssetsDataSource(SportAlbumApplication.instance.applicationContext.assets)
        return SorteggioRepositoryImpl(provideAlbumDataSource())
    }
}