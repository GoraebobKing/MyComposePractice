package kr.co.kwon.practice.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

/**
 * Create by kwonhyeok on 2024/02/02
 * **/

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.SplashScreen.route
    ) {
        composable(Screens.SplashScreen.route) {
//            SplashScreen(navController = navController)
        }

        composable(Screens.HomeScreen.route) {
//            TabHome()
        }
    }
}