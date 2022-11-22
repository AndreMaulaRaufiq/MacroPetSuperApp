package com.example.macropetsuperapp.adopt_centre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.macropetsuperapp.R
import com.example.macropetsuperapp.recyclerview.PetsAdapter
import com.example.macropetsuperapp.recyclerview.PetsItems

class AdoptDogActivity : AppCompatActivity() {

    companion object {
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adopt_dog)

        /** Tambahin sendiri dah awkkwa */
        val petList = listOf<PetsItems>(
            PetsItems(
                R.drawable.dogcorgi,
                "Hailey",
                "Female",
                "6 Bulan",
                "2 Kg",
                "Corgi",
                "Anjing Corgi, lucu, dan penurut."
            ),

            PetsItems(
                R.drawable.dogeskimo,
                "Han Solo",
                "Male",
                "2 Tahun",
                "5 Kg",
                "American Eskimo",
                "Anjing Eskimo, lucu, dan penurut."
            ),

            PetsItems(
                R.drawable.dogbernese,
                "Lotus",
                "Female",
                "2 Tahun",
                "6 Kg",
                "Bernese",
                "Anjing Bernese, lucu, dan penurut."
            ),

            PetsItems(
                R.drawable.dogmixed,
                "Roger",
                "Male",
                "11 Bulan",
                "2 Kg",
                "Mixed",
                "Anjing mixed, lucu, dan penurut."
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_adopt_dog)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = PetsAdapter(this, petList) {
            val intent = Intent(this, AdoptDetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}