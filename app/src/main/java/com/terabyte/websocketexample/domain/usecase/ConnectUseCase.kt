package com.terabyte.websocketexample.domain.usecase

import com.terabyte.websocketexample.domain.repository.MessageRepository

class ConnectUseCase(
    private val messageRepository: MessageRepository

) {

    fun execute() {
        messageRepository.connect()
    }

}