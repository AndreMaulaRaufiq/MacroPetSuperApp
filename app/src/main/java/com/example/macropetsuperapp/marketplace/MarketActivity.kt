package com.example.macropetsuperapp.marketplace

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.macropetsuperapp.databinding.ActivityMarketBinding

class MarketActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMarketBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMarketBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCatFood.setOnClickListener {
            startActivity(Intent(this, CatFoodActivity::class.java))
        }

        binding.btnDogFood.setOnClickListener {
            startActivity(Intent(this, DogFoodActivity::class.java))
        }

        binding.btnToys.setOnClickListener {
            startActivity(Intent(this, ToysActivity::class.java))
        }

        binding.btnHealth.setOnClickListener {
            startActivity(Intent(this, HealthActivity::class.java))
        }
    }
}