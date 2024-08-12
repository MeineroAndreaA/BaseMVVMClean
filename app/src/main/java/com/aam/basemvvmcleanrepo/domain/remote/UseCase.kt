package com.aam.basemvvmcleanrepo.domain.remote

import com.aam.basemvvmcleanrepo.data.remote.network.ApiCallResult
import com.aam.basemvvmcleanrepo.data.remote.network.RemoteRepository
import com.aam.basemvvmcleanrepo.data.remote.response.toBusinessModel
import com.aam.basemvvmcleanrepo.domain.model.BusinessModel
import javax.inject.Inject

class UseCase @Inject constructor(private val remoteRepository: RemoteRepository) {

    suspend operator fun invoke(): BusinessModel {
        return when (val result = remoteRepository.getSomethingFromApi())
        {
            is ApiCallResult.Error -> {
                BusinessModel(code = result.code, errorCode = result.errorMessage)
            }
            is ApiCallResult.Exception -> {
                BusinessModel(code = result.code, errorCode = result.e.stackTraceToString())
            }
            is ApiCallResult.Success -> {
                BusinessModel(code = result.code, model = result.data.toBusinessModel())
            }
        }
    }
}