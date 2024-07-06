package com.mircontapp.sorteggio.data.respository

import com.example.bupialbum.models.TeamModel
import com.mircontapp.sorteggio.domain.datasource.SorteggioDataSource
import com.mircontapp.sorteggio.domain.repository.SorteggioRepository

class SorteggioRepositoryImpl(val sorteggioDataSource: SorteggioDataSource): SorteggioRepository {
    override suspend fun getTeams(): List<TeamModel> {
        return sorteggioDataSource.fetchTeams()
    }

    override suspend fun addTeam(teamModel: TeamModel) {
        sorteggioDataSource.insertTeam(teamModel)
    }

}