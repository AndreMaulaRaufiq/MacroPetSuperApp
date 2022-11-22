package com.example.macropetsuperapp.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.macropetsuperapp.R
import com.example.macropetsuperapp.adopt_centre.AdoptCatActivity
import com.example.macropetsuperapp.adopt_centre.AdoptDogActivity
import de.hdodenhof.circleimageview.CircleImageView

class AdoptFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_adopt, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val circleImage_dogs: CircleImageView = view.findViewById(R.id.adopt_dogs)
        circleImage_dogs.setOnClickListener {
            val btnDogs = Intent(this@AdoptFragment.activity, AdoptDogActivity::class.java)
            startActivity(btnDogs)
        }

        val circleImage_cats: CircleImageView = view.findViewById(R.id.adopt_cats)
        circleImage_cats.setOnClickListener {
            val btnDogs = Intent(this@AdoptFragment.activity, AdoptCatActivity::class.java)
            startActivity(btnDogs)
        }
    }
}