pluginManagement {
    repositories {
        google()  // Repositorio de Google
        mavenCentral()
    }

    // Aquí agregamos el catalogo de versiones de Gradle
    versionCatalogs {
        create("libs") {
            from(files("gradle/libs.versions.toml"))  // Asegúrate de que este archivo esté correctamente referenciado
        }
    }
}

rootProject.name = "pronances"
include(":app")  // Solo incluye el módulo de la app
