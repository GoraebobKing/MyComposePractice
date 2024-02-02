package kr.co.kwon.practice.ui.navigation

/**
 * Create by kwonhyeok on 2024/02/02
 * **/
sealed class Screens(val route : String) {
    object SplashScreen : Screens("splash_screen")
    object HomeScreen : Screens("home_screen")
}