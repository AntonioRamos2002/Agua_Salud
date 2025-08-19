plugins {
    alias(libs.plugins.android.application)  // Usando alias para el plugin de Android
    alias(libs.plugins.kotlin.android)       // Usando alias para el plugin de Kotlin Android
    alias(libs.plugins.kotlin.compose)       // Usando alias para el plugin de Kotlin Compose
    id("kotlin-kapt")                       // Usamos 'id' para Kotlin KAPT
    alias(libs.plugins.navigation_safeargs)  // Usamos alias para Safe Args
}

android {
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.pronances"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.0"  // Versión de Compose
        kotlinCompilerVersion = "1.8.0"  // Versión de Kotlin
    }

    dependencies {
        implementation("androidx.compose.ui:ui:1.4.0")   // Dependencia de Compose
        implementation("androidx.compose.material3:material3:1.0.0")   // Para Material3
        implementation("androidx.navigation:navigation-compose:2.5.3")  // Navegación con Compose
        implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.0")   // Kotlin estándar
        implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.5.1")  // Para ViewModel en Compose
    }
}
