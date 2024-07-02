package com.example.bupialbum.models

import com.mircontapp.sportalbum.data.database.Team

data class TeamModel(
    val name: String,
    val type: String?,
    val favourite: Boolean
)

fun TeamModel.toEntity(): Team {
    return Team(this.name, this.type, this.favourite)
}