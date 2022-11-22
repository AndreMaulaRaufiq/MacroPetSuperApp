package com.example.macropetsuperapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.macropetsuperapp.databinding.ActivityHomeBinding
import com.example.macropetsuperapp.databinding.ActivityMarketBinding
import com.example.macropetsuperapp.marketplace.*
import de.hdodenhof.circleimageview.CircleImageView

class MarketFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_market, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val CircleImage_catFood: CircleImageView = view.findViewById(R.id.btn_catFood)
        CircleImage_catFood.setOnClickListener{
            val btn_catFood = Intent(this@MarketFragment.activity, CatFoodActivity::class.java)
            startActivity(btn_catFood)
        }
        val CircleImage_dogFood: CircleImageView = view.findViewById(R.id.btn_dogFood)
        CircleImage_dogFood.setOnClickListener{
            val btn_dogFood = Intent(this@MarketFragment.activity, DogFoodActivity::class.java)
            startActivity(btn_dogFood)
        }
        val CircleImage_toys: CircleImageView = view.findViewById(R.id.btn_toys)
        CircleImage_toys.setOnClickListener{
            val btn_toys = Intent(this@MarketFragment.activity, ToysActivity::class.java)
            startActivity(btn_toys)
        }
        val CircleImage_health: CircleImageView = view.findViewById(R.id.btn_health)
        CircleImage_health.setOnClickListener{
            val btn_health = Intent(this@MarketFragment.activity, HealthActivity::class.java)
            startActivity(btn_health)
        }

    }

}
