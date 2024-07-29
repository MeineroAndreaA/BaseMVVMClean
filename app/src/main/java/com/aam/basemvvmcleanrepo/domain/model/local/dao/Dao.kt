package com.aam.basemvvmcleanrepo.domain.model.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.aam.basemvvmcleanrepo.domain.model.local.entity.Entity

@Dao
interface Dao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllEntries(listItem : List<Entity>)

    @Query("SELECT * FROM Entity")
    suspend fun getAllEntries() : List<Entity>
}