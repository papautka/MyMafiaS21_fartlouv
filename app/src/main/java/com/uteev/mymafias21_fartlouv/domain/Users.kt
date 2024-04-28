package com.uteev.mymafias21_fartlouv.domain

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class Users(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = 0,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "login")
    val login: String,

    @ColumnInfo(name = "numberOfGames")
    val numberOfGames: Int = 0,

    @ColumnInfo(name = "numberOfWins")
    val numberOfWins: Int = 0,

    @ColumnInfo(name = "numberOfFights")
    val numberOfFights: Int = 0,

    @ColumnInfo(name = "numberOfGamesForBlack")
    val numberOfGamesForBlack: Int = 0,

    @ColumnInfo(name = "numberOfGamesForRed")
    val numberOfGamesForRed: Int = 0,

    @ColumnInfo(name = "numberOfWinsForBlack")
    val numberOfWinsForBlack: Int = 0,

    @ColumnInfo(name = "numberOfWinsForRed")
    val numberOfWinsForRed: Int = 0
)