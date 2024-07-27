package com.aam.basemvvmcleanrepo.data.core

import com.aam.basemvvmcleanrepo.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitModule {

    private const val BASE_URL = BuildConfig.BASE_URL

    private val retrofitConfig by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: Api by lazy {
        retrofitConfig.create(Api::class.java)
    }

}