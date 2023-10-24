package com.ajibsbaba.android.api

import com.ajibsbaba.android.api.service.BudpayApiService
import okhttp3.OkHttpClient

internal fun apiComponent(): ApiComponent = ApiModule
internal interface ApiComponent {
    val okHttpClient: OkHttpClient
    val budpayRepository: BudpayRepository
    val budpayApiService: BudpayApiService
}

internal object ApiModule: ApiComponent {
    private const val BUDPAY_API_URL = ""
    override val okHttpClient: OkHttpClient
        get() = TODO("Not yet implemented")
    override val budpayRepository: BudpayRepository
        get() = TODO("Not yet implemented")
    override val budpayApiService: BudpayApiService
        get() = TODO("Not yet implemented")
}