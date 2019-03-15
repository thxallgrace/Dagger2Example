package com.eunhye.dagger2example.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.eunhye.dagger2example.model.Post
import com.eunhye.dagger2example.model.PostDao

/**
 *  Add an AppDatabase class to a package named database in the model package
 */

@Database(entities = [Post::class], version = 1, exportSchema=false)
public abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
}
