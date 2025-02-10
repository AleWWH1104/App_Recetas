package com.my_recipes_app.app_recetas.ui.account.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.my_recipes_app.app_recetas.R
import com.my_recipes_app.app_recetas.navigation.NavigationState

@OptIn(ExperimentalMaterial3Api::class)
//@Preview
@Composable
fun Sign_In_Screen(navController: NavController){
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
                        containerColor = Color.White, focusedIndicatorColor = Color(0xFF5e503f)
                    )
                )
                TextField(
                    value = "",
                    onValueChange = {},
                    label = { Text(text= stringResource( id =  R.string.password))},
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.White, focusedIndicatorColor = Color(0xFF5e503f)
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
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(50.dp)
            ){
                Text(
                    text = stringResource(id = R.string.no_member),
                    style = MaterialTheme.typography.bodySmall
                )
                TextButton(
                    onClick = {navController.navigate(NavigationState.SignUp.route)}
                ) {
                    Text(
                        text = stringResource(id= R.string.sign_up),
                        style = MaterialTheme.typography.labelMedium.copy(textDecoration = TextDecoration.Underline, color = Color(0xFF5e503f))
                    )
                }
            }


        }
    }
}