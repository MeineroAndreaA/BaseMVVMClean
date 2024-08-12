package com.aam.basemvvmcleanrepo.data.local

import com.aam.basemvvmcleanrepo.data.local.dao.Dao
import com.aam.basemvvmcleanrepo.data.local.entity.Entity
import javax.inject.Inject

class LocalDataSource @Inject constructor(private val dao: Dao) : LocalRepository {
    override suspend fun insertAllEntries(entries: List<Entity>) {
        dao.insertAllEntries(entries)
    }

    override suspend fun getAllEntries(): List<Entity> {
        return dao.getAllEntries()
    }
}