package com.example.tuapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun EducationalMaterialScreen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Material educativo", style = MaterialTheme.typography.h6)

        // Aquí se muestran los elementos educativos
        LazyColumn {
            items(listOf("Título 1", "Título 2", "Título 3")) { material ->
                Text(material, modifier = Modifier.padding(8.dp))
            }
        }
    }
}
