package com.hafidmust.simplecleanarch.domain

// TODO: 2
interface IMessageRepository {
    fun getWelcomeMessage(name : String) : MessageEntity
}