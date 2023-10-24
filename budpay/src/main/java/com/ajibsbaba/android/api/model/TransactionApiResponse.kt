package com.ajibsbaba.android.api.model
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class TransactionApiResponse(
    @Json(name = "amount")
    val amount: String? = null,

    @Json(name = "currency")
    val currency: String? = null,

    @Json(name = "status")
    val status: String? = null,

    @Json(name = "transaction_date")
    val transactionDate: String? = null,

    @Json(name = "reference")
    val reference: String? = null,

    @Json(name = "domain")
    val domain: String? = null,

    @Json(name = "fees")
    val fees: String? = null
) {
    fun isReferenceValid(): Boolean {
        return reference != null
    }
}