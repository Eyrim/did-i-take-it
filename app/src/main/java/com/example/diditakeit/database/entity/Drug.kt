package com.example.diditakeit.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate

@Entity(tableName = "drugs")
data class Drug (
    @PrimaryKey
    @ColumnInfo(name = "drug_id")
    val uid: Int,
    @ColumnInfo(name = "drug_name")
    val drugName: String,
    @ColumnInfo(name = "drug_max_frequency_hours")
    val drugMaxFrequencyHours: Int?,
    @ColumnInfo(name = "drug_max_units_day")
    val drugMaxUnitsDay: Int?
)