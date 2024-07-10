package com.titanz.tech.mylibrary.feature

import java.text.SimpleDateFormat
import java.util.Locale

class StringFeature {
    /**
     * Função para formatar String de CPF*/
    fun formatCPF(string: String): String {
        val cpfRegex = "(\\d{3})(\\d{3})(\\d{3})(\\d{2})".toRegex()
        return string.replace(cpfRegex, "$1.$2.$3-$4")?: String()
    }

    /**
     * Função para formatar String de Data*/
    fun formatDate(string: String): String {
        val inputFormat = SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault())

        val outputFormat = SimpleDateFormat("dd/MM/yyyy", Locale("pt", "BR"))

        try {
            val date = inputFormat.parse(string)
            return outputFormat.format(date)
        } catch (e: Exception) {
            return String()
        }
    }
}