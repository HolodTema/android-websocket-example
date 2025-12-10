package com.terabyte.websocketexample.data.websocket

interface WebsocketStorage {

    fun connect()

    fun disconnect()

    fun sendMessage(message: MessageWebsocketEntity)
}