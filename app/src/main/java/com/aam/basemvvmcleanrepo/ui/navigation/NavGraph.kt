package com.aam.basemvvmcleanrepo.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aam.basemvvmcleanrepo.ui.navigation.routes.ScreenRoutes
import com.aam.basemvvmcleanrepo.ui.screen.ErrorScreen
import com.aam.basemvvmcleanrepo.ui.screen.HomeScreen
import com.aam.basemvvmcleanrepo.ui.screen.LoadingScreen
import com.aam.basemvvmcleanrepo.ui.theme.MyApplicationTheme
import com.aam.basemvvmcleanrepo.ui.viewmodel.MainViewModel

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    val mainVM: MainViewModel = viewModel()


    mainVM.getBusinessModel()
    val loading = mainVM.loading.collectAsState()
    val error = mainVM.error.collectAsState()
    MyApplicationTheme {
        NavHost(navController = navController, startDestination = ScreenRoutes.Home.route)
        {
            composable(route = ScreenRoutes.Home.route)
            {
                if (loading.value) {
                    LoadingScreen()
                } else if (error.value.isNotBlank()) {
                    ErrorScreen()
                } else {
                    HomeScreen(mainVM.businessData.value)
                }
            }
        }
    }
}