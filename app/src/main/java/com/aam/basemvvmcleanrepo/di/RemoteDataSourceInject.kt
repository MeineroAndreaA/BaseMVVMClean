package com.aam.basemvvmcleanrepo.di

import com.aam.basemvvmcleanrepo.data.remote.network.Api
import com.aam.basemvvmcleanrepo.data.core.RetrofitModule
import com.aam.basemvvmcleanrepo.data.remote.network.RemoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RemoteDataSourceInject {

    @Provides
    @Singleton
    fun provideApiService(): Api {
        return RetrofitModule.api
    }

    @Provides
    @Singleton
    fun provideRemoteDataSourceInstance(api: Api): RemoteRepository {
        return RemoteRepository(api)
    }

}