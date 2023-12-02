package com.example.scanner_compose.navigation.navigationgraph

//import es.clean.architecture.ui.views.characters.CharactersListScreen

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import coil.annotation.ExperimentalCoilApi
import com.example.scanner_compose.DetailScreen
import com.example.scanner_compose.navigation.routes.Routes


@OptIn(ExperimentalCoilApi::class)
@Composable
fun MainNavGraph(navController: NavHostController) {
        NavHost(navController = navController, startDestination = Routes.MainScreen.route) {
         /*   composable(route = Routes.Splash.route) {
                AnimatedSplashScreen(navController = navController)
            }
*/
            composable(Routes.DetailScreen.route) { backStackEntry ->
                val character = backStackEntry.arguments?.getString("character")
                character?.let {
                    DetailScreen(navController = navController)//, character = it)
                }
            }
        }
    }