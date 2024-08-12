package com.aam.basemvvmcleanrepo.domain.model

import com.aam.basemvvmcleanrepo.data.remote.network.ResultStatus


data class BusinessModel(
    val code : ResultStatus,
    val errorCode : String? = null,
    val model : Model? = null
)