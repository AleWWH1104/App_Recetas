package com.my_recipes_app.app_recetas.database.users

import androidx.room.*

@Entity(tableName = "usersDB")
data class UserEntity(
    @PrimaryKey(autoGenerate = true) val id_user: Int = 0,
    @ColumnInfo(name = "usernaname") val username: String,
    @ColumnInfo(name = "email") val email: String,
    @ColumnInfo(name = "password") val password: String
)