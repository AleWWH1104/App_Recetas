package com.my_recipes_app.app_recetas.ui.recipes.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.my_recipes_app.app_recetas.R
import com.my_recipes_app.app_recetas.ui.elements.Add_Ingredient_Camp
import com.my_recipes_app.app_recetas.ui.elements.Nav_Bar

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Add_Recipe_Screen(){
    var checked by remember { mutableStateOf(false) }
    Scaffold (
        bottomBar = { Nav_Bar() }
    ){  paddingValues ->
        Column (
            modifier = Modifier
                .background(Color(0xFFe3ddd4))
                .fillMaxSize().padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Image(painter = painterResource(R.drawable.logo), contentDescription = "logo",
                modifier = Modifier.fillMaxWidth(0.5f))
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text(text= stringResource( id =  R.string.name_recipe)) },
                singleLine = true,
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color.White, focusedBorderColor = Color(0xFF5e503f)
                )
            )
            Column (modifier = Modifier.fillMaxWidth(0.7f).padding(top = 20.dp),
                verticalArrangement = Arrangement.SpaceEvenly) {
                Row (modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween){
                    Text(text = stringResource(R.string.preparation_time), style = MaterialTheme.typography.bodySmall)
                    TextField(
                        value = "", onValueChange = {},
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color.White,
                            focusedIndicatorColor = Color(0xFF5E503F)),
                        modifier = Modifier.width(40.dp).height(30.dp)
                    )
                }
                Row (modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween){
                    Text(text = stringResource(R.string.add_favorites), style = MaterialTheme.typography.bodySmall)
                    IconToggleButton(checked = checked, onCheckedChange = { checked = it}) {
                        Icon(
                            imageVector = if (checked) Icons.Filled.Favorite else Icons.Filled.FavoriteBorder,
                            contentDescription = "fav icon",
                            tint = if (checked) Color(0xFF956934) else Color(0xFF956934)
                        )
                    }
                }
                Row (modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween){
                    Text(text = stringResource(R.string.upload_photo), style = MaterialTheme.typography.bodySmall)
                    IconButton(onClick = {}) {
                        Icon(painter = painterResource(R.drawable.icon_galery), contentDescription = "icon galery",
                            modifier = Modifier.size(30.dp))
                    }
                }
            }
            Spacer(modifier = Modifier.background(Color(0xFF956934)).fillMaxWidth().height(5.dp))
            Spacer(modifier = Modifier.size(16.dp))
            Text(text = stringResource(R.string.add_ingredients), style = MaterialTheme.typography.bodyLarge)
            LazyColumn (
                modifier = Modifier.fillMaxWidth(0.7f)
            ) {
                items(3){
                    Add_Ingredient_Camp()
                }
            }
            Spacer(modifier = Modifier.size(16.dp))
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text(text= stringResource( id =  R.string.preparation_recipe)) },
                placeholder = { Text(text= stringResource(id = R.string.description_recipe), style = MaterialTheme.typography.bodySmall) },
                maxLines = 4,
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color.White, focusedBorderColor = Color(0xFF5e503f)
                ),
                modifier = Modifier.height(100.dp)
            )
            TextButton(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth(0.3f).padding(top = 16.dp)
                    .background(Color(0xFF956934), shape = RoundedCornerShape(10.dp))
            ) {
                Text(
                    text = stringResource(id= R.string.save_recipe),
                    style = MaterialTheme.typography.labelMedium
                )
            }
        }
    }

}