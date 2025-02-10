package com.my_recipes_app.app_recetas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.my_recipes_app.app_recetas.ui.recipes.view.Add_Recipe_Screen
import com.my_recipes_app.app_recetas.ui.theme.App_RecetasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App_RecetasTheme {
                Add_Recipe_Screen()
            }
        }
    }
}

