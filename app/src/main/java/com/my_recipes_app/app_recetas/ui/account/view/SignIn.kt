package com.my_recipes_app.app_recetas.ui.account.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.my_recipes_app.app_recetas.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Sign_In(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFe3ddd4))
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(top = 50.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "logo",
                modifier = Modifier.fillMaxWidth()
            )
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1f).padding(top = 50.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.sign_in),
                    style = MaterialTheme.typography.titleMedium
                )
                TextField(
                    value = "",
                    onValueChange = {},
                    label = { Text(text= stringResource( id =  R.string.email))},
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.White
                    )
                )
                TextField(
                    value = "",
                    onValueChange = {},
                    label = { Text(text= stringResource( id =  R.string.password))},
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.White
                    )
                )
                TextButton(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth(0.4f) // Hace que el botón sea cuadrado
                        .background(Color(0xFF5e503f), shape = RoundedCornerShape(10.dp))
                ) {
                    Text(
                        text = stringResource(id= R.string.sign_in),
                        style = MaterialTheme.typography.labelMedium
                    )
                }
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(bottom = 50.dp)
                ){
                Text(
                    text = stringResource(id = R.string.no_member),
                    style = MaterialTheme.typography.bodySmall
                )
                TextButton(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth(0.4f) // Hace que el botón sea cuadrado
                        .background(Color(0xFF5e503f), shape = RoundedCornerShape(10.dp))
                ) {
                    Text(
                        text = stringResource(id= R.string.create_account),
                        style = MaterialTheme.typography.labelMedium
                    )
                }
            }


        }
    }
}