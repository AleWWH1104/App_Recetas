package com.my_recipes_app.app_recetas.database.ingredients

import androidx.room.*
import androidx.room.ForeignKey.Companion.CASCADE
import com.my_recipes_app.app_recetas.database.recipes.RecipeEntity


@Entity(tableName = "ingredientDB", foreignKeys = [ForeignKey(
    entity = RecipeEntity::class,
    parentColumns = ["id_recipe"],
    childColumns = ["id_recipe"],
    onDelete = CASCADE
)]
)
data class IngredientEntity(
    @PrimaryKey(autoGenerate = true) val id_ingredient: Int = 0,
    @ColumnInfo(name = "name_ingredient") val name_ingredient: String,
    @ColumnInfo(name = "recipe_owner") val id_recipe: Int, //Aqui la relacion entre entidades
    @ColumnInfo(name = "cant") val cant: Int
)