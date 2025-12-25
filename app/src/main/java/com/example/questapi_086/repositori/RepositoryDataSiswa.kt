package com.example.questapi_086.repositori

import com.example.questapi_086.apiservice.ServiceApiSiswa
import com.example.questapi_086.modeldata.DataSiswa

interface RepositoryDataSiswa{
    suspend fun getDataSiswa(): List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa) :retrofit2.Response<Void>
    suspend fun getSatuSiswa(id: Int) : DataSiswa
}

class JaringanRepositoryDataSiswa(
    private val serviceApiSiswa: ServiceApiSiswa
):RepositoryDataSiswa{
    override suspend fun getDataSiswa(): List<DataSiswa> = serviceApiSiswa.getSiswa()
    override suspend fun postDataSiswa(dataSiswa: DataSiswa): retrofit2.Response<Void> = serviceApiSiswa.postSiswa(dataSiswa)
    override suspend fun getSatuSiswa(id: Int) : DataSiswa = serviceApiSiswa.getSatuSiswa(id)

}