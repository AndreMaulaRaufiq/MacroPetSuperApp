package com.example.macropetsuperapp.marketplace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.macropetsuperapp.R
import com.example.macropetsuperapp.recyclerview.ProductAdapter
import com.example.macropetsuperapp.recyclerview.ProductItems

class HealthActivity : AppCompatActivity() {

    companion object {
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_health)

        /** Tambahin sendiri awkwakwka */
        val productList = listOf<ProductItems>(
            ProductItems(
                R.drawable.nexgardtablets,
                "NexGard Tablets",
                "Rp. 175.000",
                "\n" +
                        "Menambah nafsu makan, pertumbuhan, menjaga metabolisme tubuh, memberikan nutrisi pada kulit dan bulu, meningkatkan sistem imun, hingga menghindarkan anjing dari parasit",
                "Love Vet"
            ),

            ProductItems(
                R.drawable.stopfeverdog,
                "Obat Stop Fever",
                "Rp. 19.000",
                "STOP FEVER adalah obat untuk Menurunkan panas pada anjing yang di karenakan demam bersin-bersin, pilek (pyrexia), peradangan dan elergi",
                "Love Vet"
            ),

            ProductItems(
                R.drawable.frontlinespray,
                "Frontline Flea & Tick Spray",
                "Rp. 35.000",
                "Untuk pengobatan dan pencegahan infestasi kutu, pengendalian dermatitis alergi kutu, pengendalian kutu dan kutu yang mengigit pada anjing dan kucing.",
                "Love Vet"
            ),

            ProductItems(
                R.drawable.miconazole,
                "Miconazole Salep Jamur",
                "Rp. 36.000",
                "Sesuai dengan namanya, Miconazole adalah obat salep untuk penanganan jamur dan kutu pada hewan peliharaan, khususnya anjing.",
                "Love Vet"
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_health)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ProductAdapter(this, productList) {
            val intent = Intent(this, ProductDetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}