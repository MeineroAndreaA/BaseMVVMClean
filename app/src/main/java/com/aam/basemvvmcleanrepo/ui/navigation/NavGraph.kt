package com.aam.basemvvmcleanrepo.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aam.basemvvmcleanrepo.ui.navigation.routes.ScreenRoutes
import com.aam.basemvvmcleanrepo.ui.theme.MyApplicationTheme

@Composable
fun NavGraph() {
    val navController = rememberNavController()

    MyApplicationTheme {
        NavHost(navController = navController, startDestination = ScreenRoutes.Home.route)
        {
            composable(route = ScreenRoutes.Home.route)
            {

            }
        }
    }
}