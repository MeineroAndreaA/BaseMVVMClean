package com.aam.basemvvmcleanrepo.data.core

import com.aam.basemvvmcleanrepo.data.model.response.ResponseMock
import retrofit2.Response
import retrofit2.http.GET

interface Api {

    @GET("/")
    suspend fun getApiRequest() : Response<ResponseMock>
}