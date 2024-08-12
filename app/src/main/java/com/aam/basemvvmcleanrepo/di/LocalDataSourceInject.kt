package com.aam.basemvvmcleanrepo.di

import android.content.Context
import androidx.room.Room
import com.aam.basemvvmcleanrepo.data.local.RoomDB
import com.aam.basemvvmcleanrepo.data.local.dao.Dao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalDataSourceInject {

    @Provides
    @Singleton
    fun provideDatabaseCreationInstance(@ApplicationContext context: Context): RoomDB {
        return Room.databaseBuilder(context, RoomDB::class.java, "room_db_name")
            .fallbackToDestructiveMigration().build()
    }

    @Provides
    @Singleton
    fun provideDAO(database: RoomDB): Dao {
        return database.dao()
    }

}