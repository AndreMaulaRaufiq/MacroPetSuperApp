package com.example.macropetsuperapp.recyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PetsItems(

    val petImg: Int,
    val petName: String,
    val petSex: String,
    val petAge: String,
    val petWeight: String,
    val petBreed: String,
    val petDesc: String

) : Parcelable
