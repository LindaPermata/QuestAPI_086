package com.example.questapi_086.apiservice

import com.example.questapi_086.modeldata.DataSiswa
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ServiceApiSiswa {
    @GET("bacaTeman.php")
    suspend fun getSiswa(): List<DataSiswa>

    @POST("insertTM.php")
    suspend fun postSiswa(@Body dataSiswa: DataSiswa):retrofit2.Response<Void>

    @GET("baca1teman.php")
    suspend fun getSatuSiswa(@Query("id") id: Int): DataSiswa

    @POST("editteman.php") // Sesuaikan nama file PHP edit kamu
    suspend fun editSatuSiswa(@Query("id") id: Int, @Body dataSiswa: DataSiswa): retrofit2.Response<Void>

    @DELETE("hapusteman.php") // Sesuaikan nama file PHP hapus kamu
    suspend fun hapusSatuSiswa(@Query("id") id: Int): retrofit2.Response<Void>
}