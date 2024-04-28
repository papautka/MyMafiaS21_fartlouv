package com.uteev.mymafias21_fartlouv

// AppModule.kt
import com.uteev.mymafias21_fartlouv.data.dbUsers.MainDb
import com.uteev.mymafias21_fartlouv.data.dbUsers.PlayersListRepositoryImpl
import com.uteev.mymafias21_fartlouv.domain.PlayersListRepository
import com.uteev.mymafias21_fartlouv.domain.AddNewPlayerUseCase
import com.uteev.mymafias21_fartlouv.presentation.registration.RegistrationViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val appModule = module {
    single { MainDb.getDatabase(androidContext()).daoOfUsers() }
    single { PlayersListRepositoryImpl(get()) as PlayersListRepository }
    single { AddNewPlayerUseCase(get()) }
    single { RegistrationViewModel() }
}
