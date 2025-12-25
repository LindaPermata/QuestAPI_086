package com.example.questapi_086.viewmodel

import com.example.questapi_086.modeldata.DataSiswa

sealed interface StatusUIDetail {
    data class Success(val satusiswa: DataSiswa) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}