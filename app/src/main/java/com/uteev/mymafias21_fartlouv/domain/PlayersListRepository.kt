package com.uteev.mymafias21_fartlouv.domain

interface PlayersListRepository {
    fun addNewPlayer(login : String, name : String)
}