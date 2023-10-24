package com.ajibsbaba.android.api.model

import androidx.annotation.Keep
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@Keep
@JsonClass(generateAdapter = true)
data class CheckoutResponse (
    @Json(name = "message")
    val message: String? = null,

    @Json(name = "reference")
    val reference: String? = null,

    @Json(name = "status")
    val status: Boolean? = null,




)