package com.uteev.mymafias21_fartlouv.domain

class AddNewPlayerUseCase(private val playersListRepository: PlayersListRepository) {

    fun addNewPlayer(login: String, name : String) {
        playersListRepository.addNewPlayer(login, name)
    }
}