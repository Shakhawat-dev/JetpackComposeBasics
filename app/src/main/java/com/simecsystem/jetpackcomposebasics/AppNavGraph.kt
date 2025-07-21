package com.simecsystem.jetpackcomposebasics

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.simecsystem.jetpackcomposebasics.ui.DetailsScreen

import com.simecsystem.jetpackcomposebasics.ui.HomeScreen
import kotlinx.serialization.Serializable

@Composable
fun AppNavGraph(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {

    NavHost(navController = navController, startDestination = Screen.HomeScreen) {
        composable<Screen.HomeScreen> {
            HomeScreen(
                onNavigateToDetails = { navController.navigate(Screen.Details) }
            )
        }

        composable<Screen.Details> {
            DetailsScreen(
                onNavigateBack = { navController.popBackStack() }
            )
        }
    }
}
@Serializable
sealed class Screen {
    @Serializable
    data object HomeScreen : Screen()
    @Serializable
    data object Details : Screen()

}