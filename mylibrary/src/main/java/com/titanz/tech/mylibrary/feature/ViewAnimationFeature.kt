package com.titanz.tech.mylibrary.feature

import android.view.View

class ViewAnimationFeature {
    /**
     * Função para animação de Click em Views*/
    fun animateClick(view: View, onFinished: () -> Unit) {
        view.animate().scaleX(0.85f).scaleY(0.85f)
            .setDuration(100).withEndAction {
                view.animate().scaleX(1.0f).scaleY(1.0f).duration = 100
                onFinished()
            }
    }
}