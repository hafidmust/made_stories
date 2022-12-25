package com.hafidmust.simplecleanarch.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.hafidmust.simplecleanarch.di.Injection
import com.hafidmust.simplecleanarch.domain.MessageUsecase

class MainViewModelFactory(private var messageUseCase : MessageUsecase) : ViewModelProvider.NewInstanceFactory() {
    companion object{
        @Volatile
        private var instance: MainViewModelFactory? = null

        fun getInstance() : MainViewModelFactory =
            instance ?: synchronized(this){
                instance ?: MainViewModelFactory(Injection.provideUseCase())
            }
    }

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when{
            modelClass.isAssignableFrom(MainViewModel::class.java) -> MainViewModel(messageUseCase) as T
            else -> throw IllegalArgumentException("unknown viewmodel class : "+ modelClass.name)
        }
    }
}