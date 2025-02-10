package com.my_recipes_app.app_recetas.ui.elements

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.my_recipes_app.app_recetas.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Add_Ingredient_Camp(){
    var cant by remember { mutableStateOf(1) }

    Row(
        modifier = Modifier.padding(bottom = 5.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ){
        IconButton(
            onClick = { if (cant > 1) cant-- },
            modifier = Modifier.size(30.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.KeyboardArrowDown,
                contentDescription = "remove"
            )
        }
        Text(text = cant.toString(), style = MaterialTheme.typography.bodySmall)
        IconButton(
            onClick = { cant++},
            modifier = Modifier.size(30.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.KeyboardArrowUp,
                contentDescription = "add"
            )
        }
        OutlinedTextField(
            value = "",
            onValueChange = {},
            singleLine = true,
            modifier = Modifier.width(150.dp).height(30.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                containerColor = Color.White, focusedBorderColor = Color(0xFF5e503f)
            )
        )
        IconButton(
            onClick = {},
            modifier = Modifier.size(50.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.AddCircle,
                contentDescription = "add",
                tint = Color(0xFF5e503f)
            )
        }


    }
}