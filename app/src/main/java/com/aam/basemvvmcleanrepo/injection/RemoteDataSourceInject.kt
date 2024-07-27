package com.aam.basemvvmcleanrepo.injection

import com.aam.basemvvmcleanrepo.data.core.Api
import com.aam.basemvvmcleanrepo.data.core.RetrofitModule
import com.aam.basemvvmcleanrepo.domain.remote.RemoteDataSource
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
    fun provideRemoteDataSourceInstance(api: Api): RemoteDataSource {
        return RemoteDataSource(api)
    }

}