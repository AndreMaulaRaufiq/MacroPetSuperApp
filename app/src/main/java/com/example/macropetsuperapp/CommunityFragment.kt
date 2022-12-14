package com.example.macropetsuperapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.macropetsuperapp.adopt_centre.AdoptCatActivity
import com.example.macropetsuperapp.adopt_centre.AdoptDogActivity
import de.hdodenhof.circleimageview.CircleImageView

class CommunityFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_community, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val circleImage_profile: CircleImageView = view.findViewById(R.id.img_profile)
        circleImage_profile.setOnClickListener {
            val btnprofile = Intent(this@CommunityFragment.activity, AdoptDogActivity::class.java)
            startActivity(btnprofile)
        }

        val Maps: TextView = view.findViewById(R.id.text_location)
        Maps.setOnClickListener {
            val btnMaps = Intent(this@CommunityFragment.activity, AdoptCatActivity::class.java)
            startActivity(btnMaps)
        }

        val recent_cardview1: CardView = view.findViewById(R.id.cardView_recent)
        recent_cardview1.setOnClickListener {
            val btnrecent1 = Intent(this@CommunityFragment.activity, CommunityDetailActivity::class.java)
            startActivity(btnrecent1)
        }

        val recent_cardview2: CardView = view.findViewById(R.id.cardView_recent2)
        recent_cardview2.setOnClickListener {
            val btnrecent2 = Intent(this@CommunityFragment.activity, CommunityDetailActivity::class.java)
            startActivity(btnrecent2)
        }

        val recent_cardview3: CardView = view.findViewById(R.id.cardView_recent3)
        recent_cardview3.setOnClickListener {
            val btnrecent3 = Intent(this@CommunityFragment.activity, CommunityDetailActivity::class.java)
            startActivity(btnrecent3)
        }
    }

}