package com.hafidmust.simplecleanarch.data

import com.hafidmust.simplecleanarch.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name : String) : MessageEntity
}