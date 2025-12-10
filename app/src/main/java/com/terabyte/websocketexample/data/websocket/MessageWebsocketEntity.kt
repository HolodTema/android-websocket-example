package com.terabyte.websocketexample.data.websocket

data class MessageWebsocketEntity(
    val text: String,
    val isSentByUser: Boolean,
    val timestamp: Long = System.currentTimeMillis()
)
