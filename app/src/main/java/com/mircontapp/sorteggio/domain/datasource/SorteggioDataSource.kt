package com.mircontapp.sorteggio.domain.datasource

import com.example.bupialbum.models.TeamModel

interface SorteggioDataSource {
    suspend fun fetchTeams(): List<TeamModel>
    suspend fun insertTeam(teamModel: TeamModel)
    suspend fun editTeam(teamModel: TeamModel)
}