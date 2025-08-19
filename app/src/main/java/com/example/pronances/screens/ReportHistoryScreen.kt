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
fun ReportHistoryScreen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Historial de Reportes", style = MaterialTheme.typography.h6)

        // Listado de reportes
        LazyColumn {
            items(listOf("6 mayo 2024 - Fiebre y dolor", "25 abril 2024 - Salpullido")) { report ->
                Text(report, modifier = Modifier.padding(8.dp))
            }
        }
    }
}
