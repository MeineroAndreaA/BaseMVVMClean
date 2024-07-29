package com.aam.basemvvmcleanrepo.domain.model.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Entity")
data class Entity(@PrimaryKey var id :Int)
