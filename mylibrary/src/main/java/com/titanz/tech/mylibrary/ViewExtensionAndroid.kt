package com.titanz.tech.mylibrary

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager

/**
 * Função para implementar Clicks em Views*/
fun View.setOnClick(click: () -> Unit = {}) {
    setOnClickListener {
        click()
    }
}

/**
 * Função para esconder o teclado em Views*/
fun View.hideKeyboard() {
    this.clearFocus()
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(windowToken, 0)
}

/**
 * Função para exibir Views*/
fun View.makeVisible() {
    this.visibility = View.VISIBLE
}

/**
 * Função para esconder existencia das Views*/
fun View.makeGone() {
    this.visibility = View.GONE
}

/**
 * Função para deixar Views invisiveis*/
fun View.makeInvisible() {
    this.visibility = View.INVISIBLE
}

/**
 * Função para habilitar Views*/
fun View.enableTrue() {
    this.isEnabled = true
}

/**
 * Função para desabilitar Views*/
fun View.enableFalse() {
    this.isEnabled = false
}
