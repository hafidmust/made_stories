package com.hafidmust.simplecleanarch.data

import com.hafidmust.simplecleanarch.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity {
        return MessageEntity("Hello $name")
    }
}