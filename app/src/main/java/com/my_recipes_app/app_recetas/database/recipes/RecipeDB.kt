package com.my_recipes_app.app_recetas.database.recipes

import androidx.room.*
import androidx.room.ForeignKey.Companion.CASCADE
import com.my_recipes_app.app_recetas.database.users.UserEntity

@Entity(tableName = "recipeDB", foreignKeys = [ForeignKey(
    entity = UserEntity::class,
    parentColumns = ["id_user"],
    childColumns = ["id_user"],
    onDelete = CASCADE
    )]
)
data class RecipeEntity(
    @PrimaryKey(autoGenerate = true) val id_recipe: Int = 0,
    @ColumnInfo(name = "name_recipe") val name_recipe: String,
    @ColumnInfo(name = "user_owner") val id_user: Int, //Aqui la relacion entre entidades
    @ColumnInfo(name = "time") val time: Int,
    @ColumnInfo(name = "favorite") val favorite: Boolean,
    @ColumnInfo(name = "image") val image: String? = null,
    @ColumnInfo(name = "description") val description: String
)