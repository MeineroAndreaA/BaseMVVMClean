package com.aam.basemvvmcleanrepo.domain.remote

import com.aam.basemvvmcleanrepo.data.core.Api
import com.aam.basemvvmcleanrepo.data.model.response.ResponseMock
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val api: Api) : RemoteRepository {

    suspend fun getSomethingFromApi(): ApiCallResult<ResponseMock> {
        return handleApi { api.getApiRequest() }
    }
}