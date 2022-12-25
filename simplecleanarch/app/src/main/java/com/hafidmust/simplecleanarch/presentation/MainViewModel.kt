package com.hafidmust.simplecleanarch.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hafidmust.simplecleanarch.domain.MessageEntity
import com.hafidmust.simplecleanarch.domain.MessageUsecase

class MainViewModel(private val messageUsecase: MessageUsecase) : ViewModel() {
    private val _message = MutableLiveData<MessageEntity>()
    val message: LiveData<MessageEntity>
    get() = _message

    fun setName(name : String){
        _message.value = messageUsecase.getMessage(name)
    }
}