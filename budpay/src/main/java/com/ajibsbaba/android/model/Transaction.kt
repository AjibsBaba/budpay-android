package com.ajibsbaba.android.model

import com.google.gson.annotations.SerializedName


class Transaction {
    val amount: String? = null
    val currency: String? = null
    val status: String? = null
    val transactionDate: String? = null
    val reference: String? = null
    val domain: String? = null
    val fees: String? = null
}

data class TransactionResponse (
    @SerializedName("status") val status: Boolean,
    @SerializedName("message") val message: String,
    @SerializedName("data") val data: TransactionMetadata,
    @SerializedName("fees") val fees: String?,
    @SerializedName("customer") val customer: Customer,
    @SerializedName("plan") val plan: String?,
    @SerializedName("requested_amount") val requestedAmount: String
)

data class TransactionMetadata (
    @SerializedName("amount") val amount: String,
    @SerializedName("currency") val currency: String,
    @SerializedName("status") val transactionStatus: String,
    @SerializedName("reference") val reference: String,
    @SerializedName("domain") val domain: String,
    @SerializedName("gateway_response") val gatewayResponse: String?,
    @SerializedName("channel") val channel: String?,
    @SerializedName("ip_address") val ipAddress: String?,
    @SerializedName("log") val log: TransactionLog
)

data class TransactionLog(
    @SerializedName("time_spent") val timeSpent: Int,
    @SerializedName("attempts") val attempts: Int,
    @SerializedName("authentication") val authentication: String?,
    @SerializedName("errors") val errors: Int,
    @SerializedName("success") val success: Boolean,
    @SerializedName("channel") val channel: String?,
    @SerializedName("history") val history: List<TransactionHistory>
)

data class TransactionHistory(
    @SerializedName("type") val type: String,
    @SerializedName("message") val message: String,
    @SerializedName("time") val time: Int
)

data class Customer(
    @SerializedName("id") val id: Int,
    @SerializedName("customer_code") val customerCode: String,
    @SerializedName("first_name") val firstName: String?,
    @SerializedName("last_name") val lastName: String?,
    @SerializedName("email") val email: String
)
