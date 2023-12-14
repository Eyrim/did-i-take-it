package com.example.diditakeit.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.diditakeit.database.dao.DrugDao
import com.example.diditakeit.database.entity.Drug

@Database(entities = [Drug::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun drugDao(): DrugDao;
}