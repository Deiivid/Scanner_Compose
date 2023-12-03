package com.example.scanner_compose.navigation.routes

sealed class Routes(val route: String) {

    data object QrScreen : Routes("qr_scren")

    data object DetailScreen : Routes("detail_screen/{qr}") {
        fun createRoute(character: String) = "detail_screen/$character"
    }


    data object Splash : Routes("splash_screen")
}
