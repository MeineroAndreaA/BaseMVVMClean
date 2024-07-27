package com.aam.basemvvmcleanrepo.data.core

import androidx.room.Database
import androidx.room.RoomDatabase
import com.aam.basemvvmcleanrepo.data.model.dao.Dao
import com.aam.basemvvmcleanrepo.data.model.entity.Entity

@Database(entities = [Entity::class], version = 1, exportSchema = false)
abstract class RoomDB : RoomDatabase() {
    abstract fun dao(): Dao
}