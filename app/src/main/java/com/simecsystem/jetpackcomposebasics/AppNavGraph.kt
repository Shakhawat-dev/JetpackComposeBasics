package com.simecsystem.jetpackcomposebasics

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.simecsystem.jetpackcomposebasics.ui.HomeScreen

@Composable
fun AppNavGraph(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {

    NavHost(navController = navController, startDestination = Screen.Home) {
        composable<Screen.Home> {
            HomeScreen(

            )
        }
        composable<Screen.Details> {

        }
    }
}

sealed class Screen {
    object Home : Screen()
    object Details : Screen()

}