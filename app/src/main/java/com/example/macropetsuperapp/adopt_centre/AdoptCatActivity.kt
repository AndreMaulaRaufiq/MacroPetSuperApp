package com.example.macropetsuperapp.adopt_centre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.macropetsuperapp.R
import com.example.macropetsuperapp.recyclerview.PetsAdapter
import com.example.macropetsuperapp.recyclerview.PetsItems

class AdoptCatActivity : AppCompatActivity() {

    companion object {
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adopt_cat)

        /** Tambahin sendiri awkawk */
        val petList = listOf<PetsItems>(
            PetsItems(
                R.drawable.catkampung,
                "Pinoy dan Roro",
                "Male",
                "3 Tahun",
                "2 Kg",
                "Kucing Kampung",
                "Open adopt!" +
                        "\n" +
                        "\nKucing kampung, 2 bersaudara. Kalo dipisah yg satu jadi sirine ambulan." +
                        "\nOpen adopt, karena adik alergi kucing dan masuk RS...."
            ),

            PetsItems(
                R.drawable.catkampung2,
                "Pucis",
                "Female",
                "3 Tahun",
                "2 Kg",
                "Kucing Kampung",
                "Open adopt!" +
                        "\n" +
                        "\nKucing mungut di depan rumah, udah dirawat 2 tahun." +
                        "\n" +
                        "\nKelebihan:" +
                        "\n1. Potty trained" +
                        "\n2. Omnivora, kasih nasi lembek juga dimakan" +
                        "\n3. Manja, suka naik ke badan" +
                        "\n4. Kalo dipanggil langsung nyaut"
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_adopt_cat)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = PetsAdapter(this, petList) {
            val intent = Intent(this, AdoptDetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}