package com.uteev.mymafias21_fartlouv.data.dbUsers

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.uteev.mymafias21_fartlouv.domain.Users

@Dao
interface DaoOfUsers {
    @Insert
    fun addUser(user: Users)

    @Query("SELECT * FROM users")
    fun getAllUsers(): List<Users>

    @Query("SELECT * FROM users WHERE login = :login")
    fun getUserByLogin(login: String): Users

    @Query("DELETE FROM users WHERE login = :login")
    fun deleteUserByLogin(login: String)

    @Query("UPDATE users SET numberOfGames = numberOfGames + 1 WHERE login = :login")
    fun incrementNumberOfGamesByLogin(login: String)

    @Query("UPDATE users SET numberOfGames = numberOfGames - 1 WHERE login = :login")
    fun decrementNumberOfGamesByLogin(login: String)

}