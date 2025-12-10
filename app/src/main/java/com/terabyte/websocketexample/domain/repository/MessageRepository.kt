package com.terabyte.websocketexample.domain.repository

interface MessageRepository {

    fun connect()

    fun disconnect()

    fun sendMessage(text: String)

}