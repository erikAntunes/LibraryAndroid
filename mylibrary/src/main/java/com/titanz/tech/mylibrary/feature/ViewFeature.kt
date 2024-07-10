package com.titanz.tech.mylibrary.feature

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager

class ViewFeature {
    /**
     * Função para implementar Clicks em Views*/
    fun setOnClick(view: View,click: () -> Unit = {}) {
        view.setOnClickListener {
            click()
        }
    }

    /**
     * Função para esconder o teclado em Views*/
    fun hideKeyboard(view: View, context: Context) {
        view.clearFocus()
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

    /**
     * Função para exibir Views*/
    fun makeVisible(view: View) {
        view.visibility = View.VISIBLE
    }

    /**
     * Função para esconder existencia das Views*/
    fun makeGone(view: View) {
        view.visibility = View.GONE
    }

    /**
     * Função para deixar Views invisiveis*/
    fun makeInvisible(view: View) {
        view.visibility = View.INVISIBLE
    }

    /**
     * Função para habilitar Views*/
    fun enableTrue(view: View) {
        view.isEnabled = true
    }

    /**
     * Função para desabilitar Views*/
    fun enableFalse(view:View) {
        view.isEnabled = false
    }

}