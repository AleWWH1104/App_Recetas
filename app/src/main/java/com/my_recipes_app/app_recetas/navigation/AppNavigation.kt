package com.my_recipes_app.app_recetas.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.my_recipes_app.app_recetas.ui.account.view.*
import com.my_recipes_app.app_recetas.ui.recipes.view.Home_App_Screen

@Composable
fun AppNavigation(navController: NavHostController ){
    NavHost(navController=navController, startDestination = NavigationState.SignIn.route){
        //Inicio de Sesion
        composable(route= NavigationState.SignIn.route){
            Sign_In_Screen(navController = navController)
        }
        //Registro de Usuario
        composable(route= NavigationState.SignUp.route){
            Sign_Up_Screen(navController = navController)
        }
        //Home
        composable(route= NavigationState.Home.route){
            Home_App_Screen()
        }
    }
}