package com.aam.basemvvmcleanrepo.data.remote.network

import com.aam.basemvvmcleanrepo.data.remote.response.ResponseMock
import javax.inject.Inject

class RemoteRepository @Inject constructor(private val api: Api) : ApiServiceHandler {

    suspend fun getSomethingFromApi(): ApiCallResult<ResponseMock> {
        return handleApi { api.getApiRequest() }
    }
}