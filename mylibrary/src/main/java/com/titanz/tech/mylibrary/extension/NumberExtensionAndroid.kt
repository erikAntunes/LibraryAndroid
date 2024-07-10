package com.titanz.tech.mylibrary.extension

import java.text.NumberFormat
import java.util.Locale

/**
 * Função para formatar Double para moeda local*/
fun Double.formatToLocalMoney(language: String, country: String): String {
    return try {
        val currencyFormat = NumberFormat.getCurrencyInstance(Locale("language", "country"))
        currencyFormat.format(this)
    } catch (_: Exception) {
        "Error on format To Local Money"
    }
}