package com.mircontapp.sorteggio.domain.repository

interface SorteggioRepository {
    suspend fun getTeams(): List<TeamModel>;
}