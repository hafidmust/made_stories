package com.hafidmust.simplecleanarch.domain

// TODO: 4
class MessageInteractor(private val messageRepository: IMessageRepository) : MessageUsecase {
    override fun getMessage(name: String): MessageEntity {
        return messageRepository.getWelcomeMessage(name)
    }

}
