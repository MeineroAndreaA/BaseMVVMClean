package com.aam.basemvvmcleanrepo.data.remote.network

import com.aam.basemvvmcleanrepo.data.remote.response.ResponseMock
import retrofit2.Response
import retrofit2.http.GET

interface Api {

    @GET("/")
    suspend fun getApiRequest() : Response<ResponseMock>
}