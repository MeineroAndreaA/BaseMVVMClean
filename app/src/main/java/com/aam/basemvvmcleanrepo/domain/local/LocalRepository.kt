package com.aam.basemvvmcleanrepo.domain.local

import com.aam.basemvvmcleanrepo.data.model.entity.Entity

interface LocalRepository {

    suspend fun insertAllEntries(entries : List<Entity>)
    suspend fun getAllEntries () : List<Entity>
}