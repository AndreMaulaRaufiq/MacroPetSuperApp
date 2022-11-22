package com.example.macropetsuperapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.macropetsuperapp.databinding.ActivityHomeBinding
import com.example.macropetsuperapp.marketplace.CatFoodActivity
import com.example.macropetsuperapp.marketplace.MarketActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){

                R.id.ic_home -> loadFragment(HomeFragment())
                R.id.ic_adopt -> loadFragment(AdoptFragment())
                R.id.ic_community -> loadFragment(CommunityFragment())
                R.id.ic_market -> loadFragment(MarketFragment())

                else ->{


                }
            }
            true
        }
    }

    private fun loadFragment(fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment,fragment)
        fragmentTransaction.commit()
    }
}
