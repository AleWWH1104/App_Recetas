package com.my_recipes_app.app_recetas.ui.recipes.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.my_recipes_app.app_recetas.R

@Preview
@Composable
fun Recipe_Card(){
    Card (
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(bottom = 16.dp)
            .clickable {  },
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ){
        Row (
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.img_default),
                contentDescription = "img_default",
                modifier = Modifier.fillMaxHeight().width(130.dp).padding(end=10.dp)
            )
            Column {
                Text(text = "Titulo Receta", style = MaterialTheme.typography.bodyLarge)
                Row(modifier = Modifier.padding(end= 10.dp)){
                    Text(text = "10 min", style = MaterialTheme.typography.bodySmall, modifier = Modifier.weight(1f))
                    IconButton(onClick = {}) {
                        Icon(imageVector = Icons.Filled.Favorite, contentDescription = "fav", tint = Color(0xFF5e503f))
                    }
                    IconButton(onClick = {}) {
                        Icon(imageVector = Icons.Filled.Delete, contentDescription = "trash", tint = Color(0xFF5e503f))
                    }

                    }
                }
            }
        }
    }