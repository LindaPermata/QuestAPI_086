package com.example.questapi_086.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.questapi_086.modeldata.DetailSiswa
import com.example.questapi_086.modeldata.UIStateSiswa
import com.example.questapi_086.modeldata.toDataSiswa
import com.example.questapi_086.modeldata.toUiStateSiswa
import com.example.questapi_086.repositori.RepositoryDataSiswa
import kotlinx.coroutines.launch
import retrofit2.Response


class EditViewModel(
    savedStateHandle: SavedStateHandle,
    private val repositoryDataSiswa: RepositoryDataSiswa
) : ViewModel() {

    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set

    private val idSiswa: Int =
        checkNotNull(savedStateHandle[DestinasiDetail.itemIdArg])

    init {
        viewModelScope.launch {
            uiStateSiswa = repositoryDataSiswa.getSatuSiswa(idSiswa)
                .toUiStateSiswa(true)
        }
    }

