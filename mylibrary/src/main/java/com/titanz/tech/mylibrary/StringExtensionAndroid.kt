package com.titanz.tech.mylibrary

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

/**
 * Função para formatar String de CPF*/
fun String?.formatCPF(): String {
    val cpfRegex = "(\\d{3})(\\d{3})(\\d{3})(\\d{2})".toRegex()
    return this?.replace(cpfRegex, "$1.$2.$3-$4")?: String()
}

/**
 * Função para recuperar data atual como String*/
fun getDate(): String {
    val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())
    val currentDate = Date()
    return dateFormat.format(currentDate)
}

/**
 * Função para formatar String de Data*/
fun String.formatDate(): String {
    val inputFormat = SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault())

    val outputFormat = SimpleDateFormat("dd/MM/yyyy", Locale("pt", "BR"))

    try {
        val date = inputFormat.parse(this)
        return outputFormat.format(date)
    } catch (e: Exception) {
        return String()
    }
}