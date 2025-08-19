package com.example.pronances.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.pronances.screens.*

@Composable
fun AppNavigation(navController: NavController) {
    NavHost(navController = navController, startDestination = "login") {
        composable("login") { LoginScreen(navController) }
        composable("registerWaterQuality") { WaterQualityRegistrationScreen(navController) }
        composable("reportHistory") { ReportHistoryScreen(navController) }
        composable("educationalMaterial") { EducationalMaterialScreen(navController) }
    }
}
