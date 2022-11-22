package com.example.macropetsuperapp.adopt_centre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.macropetsuperapp.R
import com.example.macropetsuperapp.databinding.ActivityAdoptBinding

class AdoptActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAdoptBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adopt)

    }
}