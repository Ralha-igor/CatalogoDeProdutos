package com.example.cpcapp.model

import androidx.annotation.StringRes

data class Peca(
    val id: Int,
    val nome: String,
    @StringRes val categoriaId: Int,
    val preco: Double,
    val imagemId: Int
)