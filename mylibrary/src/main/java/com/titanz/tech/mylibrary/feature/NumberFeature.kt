package com.titanz.tech.mylibrary.feature

import java.text.NumberFormat
import java.util.Locale

class NumberFeature {
    /**
     * Função para formatar Double para moeda local*/
    fun formatToLocalMoney(moneyDouble: Double, language: String, country: String): String {
        return try {
            val currencyFormat = NumberFormat.getCurrencyInstance(Locale("language", "country"))
            currencyFormat.format(this)
        } catch (_: Exception) {
            "Error on format to local money"
        }
    }
}