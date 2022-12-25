package com.hafidmust.simplecleanarch.data

import com.hafidmust.simplecleanarch.domain.IMessageRepository
import com.hafidmust.simplecleanarch.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity {
        return messageDataSource.getMessageFromSource(name)
    }
}