package com.mircontapp.sorteggio.domain.usecases

import com.example.bupialbum.models.TeamModel
import com.mircontapp.sorteggio.domain.repository.SorteggioRepository

class GetTeamsUC(val sorteggioRepository: SorteggioRepository) {
    suspend operator fun invoke(): List<TeamModel> {
        return sorteggioRepository.getTeams()
    }
}