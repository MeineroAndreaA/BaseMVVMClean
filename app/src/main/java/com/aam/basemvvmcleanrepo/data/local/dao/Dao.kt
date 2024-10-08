package com.aam.basemvvmcleanrepo.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.aam.basemvvmcleanrepo.data.local.entity.Entity

@Dao
interface Dao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllEntries(listItem : List<Entity>)

    @Query("SELECT * FROM Entity")
    suspend fun getAllEntries() : List<Entity>
}