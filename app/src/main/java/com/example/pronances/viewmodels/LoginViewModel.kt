package com.example.tuapp.viewmodels

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State

class LoginViewModel : ViewModel() {

    private val _email = mutableStateOf("")
    val email: State<String> get() = _email

    private val _password = mutableStateOf("")
    val password: State<String> get() = _password

    // Funciones para actualizar los valores de email y password
    fun onEmailChange(newEmail: String) {
        _email.value = newEmail
    }

    fun onPasswordChange(newPassword: String) {
        _password.value = newPassword
    }

    // Lógica de autenticación (por ejemplo, comparar con valores duros, hacer una petición a un backend, etc.)
    fun authenticate(): Boolean {
        // Este es solo un ejemplo simple. Deberías usar una API o base de datos real.
        return email.value == "user@example.com" && password.value == "password"
    }
}
