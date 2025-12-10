package com.terabyte.websocketexample.domain.usecase

import com.terabyte.websocketexample.domain.repository.MessageRepository

class DisconnectUseCase(
    private val messageRepository: MessageRepository
) {

    fun execute() {
        messageRepository.disconnect()
    }

}