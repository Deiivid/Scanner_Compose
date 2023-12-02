package com.example.scanner_compose.navigation.routes

sealed class Routes(val route: String) {

    data object MainScreen : Routes("main_screen")
    data object DetailScreen : Routes("detail_screen/{character}") {
        fun createRoute(character: String) = "detail_screen/$character"
    }

}
