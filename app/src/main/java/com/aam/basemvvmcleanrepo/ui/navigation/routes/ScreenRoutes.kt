package com.aam.basemvvmcleanrepo.ui.navigation.routes

sealed class ScreenRoutes (val route : String){
    data object Home : ScreenRoutes("_home")
}