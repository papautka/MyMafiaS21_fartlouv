package com.uteev.mymafias21_fartlouv.presentation.registration

import androidx.lifecycle.ViewModel
import com.uteev.mymafias21_fartlouv.data.dbUsers.MainDb
import com.uteev.mymafias21_fartlouv.domain.AddNewPlayerUseCase
import com.uteev.mymafias21_fartlouv.domain.PlayersListRepository
import com.uteev.mymafias21_fartlouv.data.dbUsers.PlayersListRepositoryImpl
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import org.koin.java.KoinJavaComponent.inject


class RegistrationViewModel : ViewModel() {

    private val addNewPlayerUseCase: AddNewPlayerUseCase by inject(AddNewPlayerUseCase::class.java)

    fun addNewPlayer(login: String, name: String) {
        addNewPlayerUseCase.addNewPlayer(login, name)
    }
}

