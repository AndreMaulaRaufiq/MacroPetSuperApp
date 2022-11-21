package com.example.macropetsuperapp.marketplace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.macropetsuperapp.R
import com.example.macropetsuperapp.recyclerview.ProductAdapter
import com.example.macropetsuperapp.recyclerview.ProductItems

class ToysActivity : AppCompatActivity() {

    companion object {
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toys)

        /** Tambahin sendiri produknya awkakwkaw */
        val productList = listOf<ProductItems>(
            ProductItems(
                R.drawable.playpen,
                "Pet Playpen",
                "Rp. 250.000",
                "- Roomy 8-Panel design with protected seams and reinforced corners. Made from durable water-resistant materials. " +
                        "\n" +
                        "\n- Removable zippered top can be removed easily removed for indoor use & closed for outdoor use to provide shade." +
                        "\n" +
                        "\n- Zippered door provides easy in/out access for your pet. Close the door to keep your pet safely inside.",
                "Abaddon"
            ),

            ProductItems(
                R.drawable.bandana,
                "Pet Bandana",
                "Rp. 30.000",
                "A bandana for your best buddy!" +
                        "\n" +
                        "\nWant to see your pet became much more cuter/cooler? Look no further!" +
                        "\n" +
                        "\nFeatures: " +
                        "\n- Reactive environmental printing and dyeing" +
                        "\n- Skin-friendly material, no harm to pets' skin" +
                        "\n- 100% Cotton material, high quality, soft, and comfortable hand feeling" +
                        "\n- Spring summer plaid dog bandana pet, make pets more adorable",
                "Kirana"
            ),

            ProductItems(
                R.drawable.dogcarseat,
                "Pet Car Seat Cover",
                "Rp. 120.000",
                "Tired of your pet constantly making mess inside your car?" +
                        "\nWe proudly present, our newest product!" +
                        "\n" +
                        "\n- This Dog Car Seat Cover is waterproof; it will protect your car from fur, mud, and dirt" +
                        "\n" +
                        "\n- This cover is anti-slip and breathable; it is comfortable for your pet" +
                        "\n" +
                        "\n- This is compatible with most cars; it has adjustable straps and seat anchors",
                "Heni"
            ),

            ProductItems(
                R.drawable.dogcarbelt,
                "Dog Car Seatbelt",
                "Rp. 35.000",
                "- Made of high quality nylon fabric to ensure safety, features the solid zinc alloy swivel snap and metal buckles guarantee extra durability" +
                        "\n" +
                        "\n- Keep your pet safely restrained and secure in vehicle while driving, and allows your dog to sit, stand or lie down comfortably in a car without distracting the driver" +
                        "\n" +
                        "\n- Hassle-free seatbelt clip designed to latch into your car",
                "Joshua"
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_toys)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ProductAdapter(this, productList) {
            val intent = Intent(this, ProductDetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}