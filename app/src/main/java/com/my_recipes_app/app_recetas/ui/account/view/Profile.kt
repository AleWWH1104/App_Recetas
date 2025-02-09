package com.my_recipes_app.app_recetas.ui.account.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.my_recipes_app.app_recetas.ui.elements.Back_Bar
import com.my_recipes_app.app_recetas.ui.elements.Nav_Bar
import com.my_recipes_app.app_recetas.R

@Preview
@Composable
fun Profile(){
    Scaffold(
        topBar = { Back_Bar()},
        bottomBar = { Nav_Bar() }
    ){ paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFe3ddd4))
                .padding(paddingValues)
        ){
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF5e503f))
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ){
                Text(
                    text = stringResource(id= R.string.my_account),
                    style = MaterialTheme.typography.labelLarge
                )
                Image(imageVector = Icons.Filled.AccountCircle,
                    contentDescription = "account_photo",
                    modifier = Modifier.size(100.dp))
                Text(
                    text = stringResource(id= R.string.username),
                    style = MaterialTheme.typography.labelLarge
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                TextButton(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth(0.5f) // Hace que el botón sea cuadrado
                        .background(Color(0xFF5e503f), shape = RoundedCornerShape(10.dp))
                ) {
                    Text(
                        text = stringResource(id= R.string.log_out),
                        style = MaterialTheme.typography.labelMedium
                    )
                }
                Spacer(modifier = Modifier.size(20.dp))
                TextButton(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth(0.5f) // Hace que el botón sea cuadrado
                        .background(Color(0xFF5e503f), shape = RoundedCornerShape(10.dp))
                ) {
                    Text(
                        text = stringResource(id= R.string.delete_account),
                        style = MaterialTheme.typography.labelMedium
                    )
                }
            }
        }
    }

}