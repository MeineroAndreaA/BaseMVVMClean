package com.aam.basemvvmcleanrepo.data.local

import com.aam.basemvvmcleanrepo.domain.model.local.entity.Entity

interface LocalRepository {

    suspend fun insertAllEntries(entries : List<Entity>)
    suspend fun getAllEntries () : List<Entity>
}