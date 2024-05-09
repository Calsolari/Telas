package br.senai.sp.jandira.triproom.modelo

import androidx.compose.ui.graphics.painter.Painter

data class Categorias(

    var id: Int = 0,
    var descricao: String = "",
    var iconImage: Painter? = null
)