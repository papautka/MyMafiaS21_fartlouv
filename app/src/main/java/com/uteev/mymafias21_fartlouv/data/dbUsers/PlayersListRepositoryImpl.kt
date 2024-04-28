package com.uteev.mymafias21_fartlouv.data.dbUsers

import com.uteev.mymafias21_fartlouv.domain.PlayersListRepository
import com.uteev.mymafias21_fartlouv.domain.Users

class PlayersListRepositoryImpl(private val daoOfUsers: DaoOfUsers) : PlayersListRepository {

    private fun getSize() = daoOfUsers.getAllUsers().size
    override fun addNewPlayer(login: String, name: String) {
        daoOfUsers.addUser(Users(getSize(), login, name, 0, 0, 0, 0, 0, 0, 0))
    }
}