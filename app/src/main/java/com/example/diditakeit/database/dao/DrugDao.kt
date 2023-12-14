package com.example.diditakeit.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.diditakeit.database.entity.Drug

@Dao
interface DrugDao {
    @Query("SELECT * FROM drugs")
    fun getAll(): List<Drug>

    @Query("SELECT * FROM drugs WHERE drug_id = :drugId")
    fun getDrugByUid(drugId: Int): Drug

    @Query("SELECT * FROM drugs WHERE drug_name = :name")
    fun getAllByName(name: String): List<Drug>
}