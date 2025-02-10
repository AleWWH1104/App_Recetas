package com.my_recipes_app.app_recetas.navigation

sealed class NavigationState(val route: String) {
    data object Home:NavigationState("home")
    data object SignIn:NavigationState("signIn")
    data object SignUp:NavigationState("signUp")
    data object AddRecipe:NavigationState("addRecipe")
    data object Profile:NavigationState("profile")
}