package com.example.scanner_compose.navigation.navigationgraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.scanner_compose.AnimatedSplashScreen
import com.example.scanner_compose.DetailScreen
import com.example.scanner_compose.ScannerScreen
import com.example.scanner_compose.navigation.routes.Routes

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Routes.Splash.route) {
        composable(route = Routes.Splash.route) {
            AnimatedSplashScreen(navController = navController)
        }
        composable(route = Routes.QrScreen.route) {
            ScannerScreen(navController = navController)
        }
        //pasar datos parcelables

        composable(Routes.DetailScreen.route) { backStackEntry ->
            val character = backStackEntry.arguments?.getString("qr")
            character?.let {
                DetailScreen(navController = navController,qr = it)
            }
        }
    }
}