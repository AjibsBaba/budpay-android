package com.ajibsbaba.android.model
import java.io.Serializable

public class Card() : BudpayModel(), Serializable {
    init {
        val name: String?
        val number: String
        val cvc: String?
        val expiryMonth: Int?
        val isValid: Boolean?
        val expiryYear: Int?
        val country: String?
        val type: String
        val last4digits: String?
    }

}