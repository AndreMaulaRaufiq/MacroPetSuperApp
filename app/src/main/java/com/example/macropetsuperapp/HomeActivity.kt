package com.example.macropetsuperapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.macropetsuperapp.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.adoptBtn.setOnClickListener {
            startActivity(Intent(this, AdoptActivity::class.java))
        }

        binding.marketBtn.setOnClickListener {
            startActivity(Intent(this, MarketActivity::class.java))
        }
    }
}