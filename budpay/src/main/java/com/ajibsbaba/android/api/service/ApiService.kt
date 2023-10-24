package com.ajibsbaba.android.api.service

import com.ajibsbaba.android.api.model.TransactionApiResponse
import retrofit2.Call
import retrofit2.http.FieldMap
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

public interface ApiService {

    @GET("/transaction/verify/{reference}")
    fun verifyTransaction(@Path("reference") reference: String) : Call<TransactionApiResponse>

    @GET("/transaction/{id}")
    fun fetchTransaction(@Path("transaction/{id}") id: String) : Call<TransactionApiResponse>

    @FormUrlEncoded
    @POST("/banktransfer/initialize")
    fun bankTransfer(@FieldMap fields: HashMap<String, String>) : Call<TransactionApiResponse>

}