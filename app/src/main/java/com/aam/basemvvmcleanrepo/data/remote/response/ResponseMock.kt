package com.aam.basemvvmcleanrepo.data.remote.response

import com.aam.basemvvmcleanrepo.data.remote.network.ResultStatus
import com.aam.basemvvmcleanrepo.domain.model.BusinessModel
import com.aam.basemvvmcleanrepo.domain.model.Model
import com.google.gson.annotations.SerializedName

data class ResponseMock(
   @SerializedName("_name") val name : String
)

fun ResponseMock.toBusinessModel() : Model
{
   return Model(name)
}