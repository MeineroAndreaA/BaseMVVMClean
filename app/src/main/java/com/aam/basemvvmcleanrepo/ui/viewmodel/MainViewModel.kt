package com.aam.basemvvmcleanrepo.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aam.basemvvmcleanrepo.data.remote.network.ResultStatus
import com.aam.basemvvmcleanrepo.domain.model.Model
import com.aam.basemvvmcleanrepo.domain.remote.UseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(val useCase: UseCase) : ViewModel() {

    private val _loadingState = MutableStateFlow(false)
    val loading : StateFlow<Boolean> = _loadingState

    private val _errorState = MutableStateFlow(String.toString())
    val error : StateFlow<String> = _errorState

    private val _businessDataState = MutableStateFlow(Model(""))
    val businessData : StateFlow<Model> = _businessDataState

    fun getBusinessModel() {
        _loadingState.value = true
        viewModelScope.launch {
            val bM = useCase()
            bM.code.let { 
                when(it)
                {
                    ResultStatus.SUCCESS -> {
                        _loadingState.value = false
                        _businessDataState.value = bM.model!!
                    }
                    ResultStatus.THROWABLE -> {
                        _loadingState.value = false
                        _errorState.value = bM.errorCode.toString()
                    }
                    ResultStatus.ERROR -> {
                        _loadingState.value = false
                        _errorState.value = bM.errorCode.toString()
                    }
                }
            }
            
        }
    }

}