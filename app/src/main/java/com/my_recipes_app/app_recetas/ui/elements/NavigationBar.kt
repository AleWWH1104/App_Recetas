package com.my_recipes_app.app_recetas.ui.elements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun Nav_Bar(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){
        IconButton(onClick = {}
        ) { Icon(imageVector = Icons.Filled.Home, contentDescription = "home", tint = Color(0xFF5e503f), modifier = Modifier.size(50.dp)) }
        IconButton(onClick = {}
        ) { Icon(imageVector = Icons.Filled.AddCircle, contentDescription = "add", tint = Color(0xFF956934), modifier = Modifier.size(50.dp)) }
        IconButton(onClick = {}
        ) { Icon(imageVector = Icons.Filled.AccountCircle, contentDescription = "account", tint = Color(0xFF5e503f), modifier = Modifier.size(50.dp)) }
    }
}