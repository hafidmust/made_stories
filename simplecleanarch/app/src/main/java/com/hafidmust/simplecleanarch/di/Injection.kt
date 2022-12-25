package com.hafidmust.simplecleanarch.di

import com.hafidmust.simplecleanarch.data.IMessageDataSource
import com.hafidmust.simplecleanarch.data.MessageDataSource
import com.hafidmust.simplecleanarch.data.MessageRepository
import com.hafidmust.simplecleanarch.domain.IMessageRepository
import com.hafidmust.simplecleanarch.domain.MessageInteractor
import com.hafidmust.simplecleanarch.domain.MessageUsecase

object Injection {
    fun provideUseCase() : MessageUsecase{
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}