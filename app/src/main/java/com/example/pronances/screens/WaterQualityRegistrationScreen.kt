package com.example.tuapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.slider.Slider
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun WaterQualityRegistrationScreen(navController: NavController) {
    var waterColor by remember { mutableStateOf("") }
    var turbidity by remember { mutableStateOf(0f) }
    var symptoms by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Registrar calidad del agua", style = MaterialTheme.typography.h6)

        // Selección de color del agua
        Text("Color de agua")
        Row {
            RadioButton(selected = waterColor == "Amarilla", onClick = { waterColor = "Amarilla" })
            Text("Amarilla")
            RadioButton(selected = waterColor == "Transparente", onClick = { waterColor = "Transparente" })
            Text("Transparente")
        }

        // Registro de síntomas
        Text("Síntomas de salud")
        BasicTextField(
            value = symptoms,
            onValueChange = { symptoms = it },
            modifier = Modifier.fillMaxWidth(),
            decorationBox = { innerTextField ->
                Row(Modifier.padding(8.dp)) {
                    if (symptoms.isEmpty()) Text("Ingresa los síntomas")
                    innerTextField()
                }
            }
        )

        // Turbidez
        Text("Turbidez")
        Slider(value = turbidity, onValueChange = { turbidity = it }, valueRange = 0f..10f)

        Button(onClick = {
            // Guardar reporte y navegar
            navController.navigate("reportHistory")
        }) {
            Text("Guardar reporte")
        }
    }
}
