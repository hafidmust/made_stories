package com.hafidmust.simplecleanarch.domain

// TODO: 3
interface MessageUsecase {
    fun getMessage(name : String) : MessageEntity
}