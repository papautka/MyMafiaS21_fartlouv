package com.uteev.mymafias21_fartlouv.data.dbUsers

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.uteev.mymafias21_fartlouv.domain.Users

@Database(entities = [Users::class], version = MainDb.DB_VERSION)
abstract class MainDb : RoomDatabase() {

    abstract fun daoOfUsers(): DaoOfUsers

    companion object {
        const val DB_NAME = "users.db"
        const val DB_VERSION = 1
        const val TABLE_USERS = "users"

        fun getDatabase(context : Context) : MainDb {
            return Room.databaseBuilder(
                context.applicationContext,
                MainDb::class.java,
                DB_NAME
            ).build()
        }
    }
}