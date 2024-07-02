package com.mircontapp.sorteggio.data.datasource

import com.example.bupialbum.models.TeamModel
import com.example.bupialbum.models.toEntity
import com.mircontapp.sorteggio.SorteggioApplication
import com.mircontapp.sorteggio.data.database.AppDatabase
import com.mircontapp.sorteggio.domain.datasource.SorteggioDataSource
import com.mircontapp.sportalbum.data.database.teamModelFromEntity

class SorteggioDataSourceImpl : SorteggioDataSource {
    val database: AppDatabase?

    init {
        database = AppDatabase.getInstance(SorteggioApplication.instance.applicationContext)
    }

    override suspend fun editTeam(teamModel: TeamModel) {
        database?.teamDao()?.update(teamModel.toEntity())
    }

    override suspend fun fetchTeams(): List<TeamModel> {
        return database?.teamDao()?.getAll()?.map { it.teamModelFromEntity() } ?: emptyList()
    }

    override suspend fun insertTeam(teamModel: TeamModel) {
        database?.teamDao()?.insert(teamModel.toEntity())
    }
}