package com.kotlin.demo

data class Contact(
    private val id: String,
    private val name: String = "",
    private val email: String = "",
    private val phone: String = "",
)
