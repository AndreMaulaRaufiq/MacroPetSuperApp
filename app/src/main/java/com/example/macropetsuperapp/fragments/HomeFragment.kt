package com.example.macropetsuperapp.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.FragmentTransaction
import com.example.macropetsuperapp.CommunityFragment
import com.example.macropetsuperapp.MapsActivity
import com.example.macropetsuperapp.R
import com.example.macropetsuperapp.adopt_centre.AdoptCatActivity
import com.example.macropetsuperapp.adopt_centre.AdoptDetailActivity
import com.example.macropetsuperapp.adopt_centre.AdoptDogActivity
import de.hdodenhof.circleimageview.CircleImageView

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val circleImage_profile: CircleImageView = view.findViewById(R.id.img_profile)
        circleImage_profile.setOnClickListener {
            val btnprofile = Intent(this@HomeFragment.activity, AdoptDogActivity::class.java)
            startActivity(btnprofile)
        }

        val Maps: TextView = view.findViewById(R.id.text_location)
        Maps.setOnClickListener {
            val btnMaps = Intent(this@HomeFragment.activity, MapsActivity::class.java)
            startActivity(btnMaps)
        }

        val recent_cardview1: CardView = view.findViewById(R.id.cardView_recent)
        recent_cardview1.setOnClickListener {
            val btnrecent1 = Intent(this@HomeFragment.activity, AdoptCatActivity::class.java)
            startActivity(btnrecent1)
        }
    }
}