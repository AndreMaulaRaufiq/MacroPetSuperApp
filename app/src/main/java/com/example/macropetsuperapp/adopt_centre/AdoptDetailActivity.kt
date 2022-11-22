package com.example.macropetsuperapp.adopt_centre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.macropetsuperapp.R
import com.example.macropetsuperapp.recyclerview.PetsItems
import com.google.android.material.button.MaterialButton

class AdoptDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adopt_detail)

        val button = findViewById<MaterialButton>(R.id.btn_adopt)
        button.setOnClickListener {
            Toast.makeText(this, "Adopted! Thank you!", Toast.LENGTH_SHORT).show()
        }

        val petsDetails =
            intent.getParcelableExtra<PetsItems>(AdoptDogActivity.INTENT_PARCELABLE)

        val petImg = findViewById<ImageView>(R.id.pet_detail_img)
        val petName = findViewById<TextView>(R.id.pet_detail_name)
        val petAge = findViewById<TextView>(R.id.pet_detail_age)
        val petSex = findViewById<TextView>(R.id.pet_detail_gender)
        val petBreed = findViewById<TextView>(R.id.pet_detail_breed)
        val petWeight = findViewById<TextView>(R.id.pet_detail_weight)
        val petDesc = findViewById<TextView>(R.id.pet_detail_desc)

        petImg.setImageResource(petsDetails?.petImg!!)
        petName.text = petsDetails.petName
        petAge.text = petsDetails.petAge
        petSex.text = petsDetails.petSex
        petBreed.text = petsDetails.petBreed
        petWeight.text = petsDetails.petWeight
        petDesc.text = petsDetails.petDesc
    }
}