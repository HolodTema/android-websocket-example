package com.terabyte.websocketexample.domain.usecase

import com.terabyte.websocketexample.domain.model.Message
import com.terabyte.websocketexample.domain.repository.MessageRepository

class SendMessageUseCase(
    private val messageRepository: MessageRepository

) {

    fun execute(text: String) {
        val message = Message(
            text = text,
            isSentByUser = true,
        )
        messageRepository.sendMessage(text)
    }

}