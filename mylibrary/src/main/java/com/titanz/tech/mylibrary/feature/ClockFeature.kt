package com.titanz.tech.mylibrary.feature

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class ClockFeature {
    /**
     * Função para recuperar data atual como String*/
    fun getDate(): String {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())
        val currentDate = Date()
        return dateFormat.format(currentDate)
    }
}