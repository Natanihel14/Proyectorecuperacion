package com.example.fitflowapp.states

import com.example.fitflowapp.models.Usuarios

data class UsuariosState(
    val listaUsuarios: List<Usuarios> = emptyList()
)
