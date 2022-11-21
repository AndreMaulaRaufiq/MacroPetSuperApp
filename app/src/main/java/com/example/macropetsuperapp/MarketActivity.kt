package com.example.macropetsuperapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.macropetsuperapp.databinding.ActivityMainBinding
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
    }
}