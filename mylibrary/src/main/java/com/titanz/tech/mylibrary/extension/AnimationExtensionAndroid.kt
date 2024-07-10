package com.titanz.tech.mylibrary.extension

import android.view.View

/**
 * Função para animação de Click em Views*/
fun View.animateClick(onFinished: () -> Unit) {
    this.animate().scaleX(0.85f).scaleY(0.85f)
        .setDuration(100).withEndAction {
            this.animate().scaleX(1.0f).scaleY(1.0f).duration = 100
            onFinished()
        }
}