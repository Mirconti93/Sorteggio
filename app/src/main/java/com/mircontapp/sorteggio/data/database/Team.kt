package com.mircontapp.sportalbum.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.bupialbum.models.TeamModel

@Entity(tableName = "team")
class Team (
    @PrimaryKey val name: String,
    val type: String?,
    val favourite: Boolean
)

fun Team.teamModelFromEntity() : TeamModel {
    return TeamModel(
        name = this.name,
        type = this.type,
        favourite = this.favourite
    )
}


