package com.aam.basemvvmcleanrepo.data.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Entity")
data class Entity(@PrimaryKey var id :Int)
