package com.aam.basemvvmcleanrepo.data.remote

import com.aam.basemvvmcleanrepo.data.core.Api
import com.aam.basemvvmcleanrepo.domain.model.remote.response.ResponseMock
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val api: Api) : RemoteRepository {

    suspend fun getSomethingFromApi(): ApiCallResult<ResponseMock> {
        return handleApi { api.getApiRequest() }
    }
}