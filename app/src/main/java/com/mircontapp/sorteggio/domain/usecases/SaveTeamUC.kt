package com.mircontapp.sorteggio.domain.usecases

import com.example.bupialbum.models.TeamModel
import com.mircontapp.sorteggio.domain.repository.SorteggioRepository

class SaveTeamUC(val sorteggioRepository: SorteggioRepository) {
    suspend operator fun invoke(teamModel: TeamModel) {
        return sorteggioRepository.addTeam(teamModel)
    }
}