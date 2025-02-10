package com.my_recipes_app.app_recetas.ui.recipes.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.my_recipes_app.app_recetas.ui.elements.Nav_Bar
import com.my_recipes_app.app_recetas.R

@Preview
@Composable
fun Home_App_Screen(){
    Scaffold(
        bottomBar = { Nav_Bar() }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFe3ddd4))
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Row(
                modifier = Modifier
                    .background(Color(0xFF5e503f))
                    .height(250.dp).padding(top = 50.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = stringResource(id = R.string.banner_phrase),
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.weight(0.5f).padding(start = 20.dp)
                )
                Image(painter = painterResource(id= R.drawable.chef),
                    contentDescription = "chef",
                    modifier = Modifier.weight(0.5f).fillMaxHeight())
            }
            Spacer(modifier = Modifier.size(20.dp))
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ){
                Icon(imageVector = Icons.Filled.List, contentDescription = "total", tint = Color(0xFF5e503f))
                Column {
                    Text(text = stringResource(id = R.string.saved_recipes), style = MaterialTheme.typography.bodySmall)
                    Text(text = "10 recetas", style = MaterialTheme.typography.bodySmall)
                }
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF956934)
                )
                ) {
                    Icon(
                        imageVector = Icons.Filled.Favorite,
                        contentDescription = null,
                        tint = Color(0xFFe3ddd4)
                    )
                    Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                    Text(text = stringResource(R.string.favorites), style = MaterialTheme.typography.labelSmall)
                }
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF956934)
                    )
                ) {
                    Icon(
                        imageVector = Icons.Filled.DateRange,
                        contentDescription = null,
                        tint = Color(0xFFe3ddd4)
                    )
                    Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                    Text(text = stringResource(R.string.time), style = MaterialTheme.typography.labelSmall)
                }
            }
            LazyColumn(
                contentPadding = PaddingValues(16.dp),
                modifier = Modifier.padding(20.dp)
            ) {
                items(4) { recipe ->
                    Recipe_Card()
                }
            }
        }
    }
}