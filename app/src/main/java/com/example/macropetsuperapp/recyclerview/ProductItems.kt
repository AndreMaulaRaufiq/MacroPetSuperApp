package com.example.macropetsuperapp.recyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProductItems(

    val productImg: Int,
    val productName: String,
    val productPrice: String,
    val productDesc: String,
    val productSeller: String

) : Parcelable
