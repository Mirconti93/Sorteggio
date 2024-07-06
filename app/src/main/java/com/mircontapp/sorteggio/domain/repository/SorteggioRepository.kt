package com.mircontapp.sorteggio.domain.repository

import com.example.bupialbum.models.TeamModel

interface SorteggioRepository {
    suspend fun getTeams(): List<TeamModel>
}