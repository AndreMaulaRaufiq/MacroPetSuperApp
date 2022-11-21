package com.example.macropetsuperapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.macropetsuperapp.recyclerview.ProductAdapter
import com.example.macropetsuperapp.recyclerview.ProductItems

class CatFoodActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat_food)

        val productList = listOf<ProductItems>(
            ProductItems(
                R.drawable.royalcanin,
                "Royal Canin 1kg",
                "Rp. 80.000",
                "Dijual Royal Canin 1kg, masih segel belum dibuka sama sekali" +
                        "\nDijual karena udah ngga kepake...",
                "Kirana"
            ),

            ProductItems(
                R.drawable.meokitten,
                "Meo Kitten 1.5kg",
                "Rp. 80.000",
                "Hallo guys, aku mau jual makanan kitten nih!" +
                        "\nMempersembahkan! Meo Kitten!" +
                        "\nMe-O Kitten Ocean Fish Cat Food merupakan pakan kucing dengan kandungan yang bergizi dan seimbang dan diformulasikan untuk semua jenis kucing dengan usia dibawah 1 tahun.",
                "Hana"
            ),

            ProductItems(
                R.drawable.whiskas,
                "Whiskas 250gr",
                "Rp. 7000",
                "WHISKAS makanan kucing lengkap dan seimbang, dirancang khusus untuk memenuhi kebutuhan kucing Anda pada tahap kehidupan mereka",
                "Christie"
            ),

            ProductItems(
                R.drawable.catchoize,
                "Cat Choize 30gr",
                "Rp. 30.000",
                "Cat Choize mengandung nutrisi lengkap, vitamin dan mineral yang membuat kucing Anda sehat. Dikembangkan dengan pola diet yang seimbang untuk memastikan pertumbuhan kucing yang optimal. Cat Choize cocok untuk semua jenis kucing dalam setiap tahap perkembangannya.",
                "Joshua"
            ),

            ProductItems(
                R.drawable.aristocats,
                "Aristo-cats Premium Plus Tuna With Chicken Canned Cat Food",
                "Rp. 25.000",
                "Nutritious, fresh tuna meat with delicious chicken flake, enriched with DHA and vitamin E for a complete, nutritional diet and an enjoyable mealtime." +
                        "\n" +
                        "\nAristo-Cats Premium Plus Wet Cat Food is manufactured using the freshest raw ingredients direct from the ocean and Japan's best-selling formula.",
                "Lily Petshop"
            ),

            ProductItems(
                R.drawable.aristocatssalmon,
                "Aristo-cats Premium Plus Tuna With Salmon Canned Cat Food",
                "Rp. 25.000",
                "Nutritious, fresh tuna meat with delicious salmon, enriched with DHA and vitamin E for a complete, nutritional diet and an enjoyable mealtime." +
                        "\n" +
                        "\nAristo-Cats Premium Plus Wet Cat Food is manufactured using the freshest raw ingredients direct from the ocean and Japan's best-selling formula.",
                "Lily Petshop"
            ),

            ProductItems(
                R.drawable.aristocatsshrimp,
                "Aristo-cats Premium Plus Tuna With Shrimp Canned Cat Food",
                "Rp. 25.000",
                "Nutritious, fresh tuna meat with delicious shrimp, enriched with DHA and vitamin E for a complete, nutritional diet and an enjoyable mealtime." +
                        "\n" +
                        "\nAristo-Cats Premium Plus Wet Cat Food is manufactured using the freshest raw ingredients direct from the ocean and Japan's best-selling formula.",
                "Lily Petshop"
            ),

            ProductItems(
                R.drawable.aristocatswhitefish,
                "Aristo-cats Premium Plus Tuna With Small White Fish Canned Cat Food",
                "Rp. 25.000",
                "Nutritious, fresh tuna meat with delicious white fish, enriched with DHA and vitamin E for a complete, nutritional diet and an enjoyable mealtime." +
                        "\n" +
                        "\nAristo-Cats Premium Plus Wet Cat Food is manufactured using the freshest raw ingredients direct from the ocean and Japan's best-selling formula.",
                "Lily Petshop"
            ),

            ProductItems(
                R.drawable.aristocatssmokedfish,
                "Aristo-cats Premium Plus Tuna With Smoked Fish Canned Cat Food",
                "Rp. 25.000",
                "Nutritious, fresh tuna meat with delicious smoked fish, enriched with DHA and vitamin E for a complete, nutritional diet and an enjoyable mealtime." +
                        "\n" +
                        "\nAristo-Cats Premium Plus Wet Cat Food is manufactured using the freshest raw ingredients direct from the ocean and Japan's best-selling formula.",
                "Lily Petshop"
            ),

            ProductItems(
                R.drawable.shebatuna,
                "Sheba Tuna & Snapper In Gravy Canned Cat Food",
                "Rp. 25.000",
                "SHEBA TUNA & SNAPPER IN GRAVY CANNED WET CAT FOOD" +
                        "\nSheba knows that cat owners love cats for their independent spirits, personalities and discerning palates. That's why each and every Sheba recipe has real beef, poultry or seafood for an irresistible taste." +
                        "\n" +
                        "\nIndulging in tempting irresistible flavors. Sheba Tuna & Snapper in Gravy is made from quality ingredients with recipes that are formulated without corn, wheat, soy, or artificial flavours. Your cats will definitely love it!",
                "Lily Petshop"
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_catfood)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ProductAdapter(this, productList) {
            val intent = Intent(this, ProductDetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }

    }
}