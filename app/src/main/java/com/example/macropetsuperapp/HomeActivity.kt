package com.example.macropetsuperapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.macropetsuperapp.adopt_centre.AdoptDetailActivity
import com.example.macropetsuperapp.databinding.ActivityHomeBinding
import com.example.macropetsuperapp.fragments.AdoptFragment
import com.example.macropetsuperapp.fragments.HomeFragment
import com.example.macropetsuperapp.fragments.MarketFragment

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
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}
