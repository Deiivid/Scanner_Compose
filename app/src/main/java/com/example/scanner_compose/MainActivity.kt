package com.example.scanner_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.scanner_compose.navigation.navigationgraph.SetupNavGraph
import com.example.scanner_compose.ui.theme.Scanner_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // A surface container using the 'background' color from the theme
            /*  Surface(
                  modifier = Modifier.fillMaxSize(),
                  color = MaterialTheme.colorScheme.background
              ) {
                     val navigationController = rememberNavController()
                     NavHost(
                         navController = navigationController,
                         startDestination = Routes.CharacterList.route
                     ) {
                         composable(Routes.CharacterList.route) { CharactersListScreen(navigationController) }
                     }
                 */

            val navController = rememberNavController()
            SetupNavGraph(navController)
        }
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Scanner_ComposeTheme {

    }
}