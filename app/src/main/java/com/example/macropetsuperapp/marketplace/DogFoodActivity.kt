package com.example.macropetsuperapp.marketplace

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.macropetsuperapp.R
import com.example.macropetsuperapp.recyclerview.ProductAdapter
import com.example.macropetsuperapp.recyclerview.ProductItems

class DogFoodActivity : AppCompatActivity() {

    companion object {
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dog_food)

        /** Tambahin sendiri gih produkya awkwakkaw */
        val productList = listOf<ProductItems>(
            ProductItems(
                R.drawable.boltdog,
                "Bolt Dog 1kg",
                "Rp. 180.000",
                "Bolt Dog merupakan pakan anjing untuk usia di atas 1 tahun, yang diformulasikan untuk memenuhi nutrisi standar Profil Nutrisi Makanan Anjing yang disahkan oleh AAFCO (Association of American Feed Control Officials)." +
                        "\nPakan ini diperkaya dengan antioksidan, vitamin, dan mineral." +
                        "\nBermanfaat untuk meningkatkan sistem imunitas, membuat kulit lebih sehat dan bulu berkilau serta meningkatkan kesehatan sendi dan tulang.",
                "Happy Petshop"
            ),

            ProductItems(
                R.drawable.pedigree,
                "Pedigree 3kg",
                "Rp. 132.000",
                "Pedigree Baik untuk kesehatan kulit & membuat bulu bersinar." +
                        "\nMenjaga kesehatan & kekuatan tulang" +
                        "\nMenjaga kesehatan pencernaan anjing" +
                        "\nMembuat otot lebih kuat" +
                        "\nMengandung Nutrisi tepat untuk membangun sistem kekebalan tubuh yang baik",
                "Happy Petshop"
            ),

            ProductItems(
                R.drawable.alpogrowth,
                "Alpo Growth 1300gr",
                "Rp. 65.000",
                "Mengandung nutrisi penting untuk mendukung perkembangan sistem tubuh dan jaringan otak, Alpo Puppy Growth merupakan makanan yang ideal untuk anjing usia 1-24 bulan." +
                        "\nTerbuat dari bahan pilihan berkualitas, makanan ini mengandung nutrisi penting untuk mendukung perkembangan jaringan otak dan sistem tubuh hewan." +
                        "\nTekstur yang mudah dicerna dan aroma lezat menjadikan produk ini sebagai salah satu favorit untuk makanan anjing peliharaan.",
                "Happy Petshop"
            ),

            ProductItems(
                R.drawable.royalcanindog,
                "Royal Canin Exigent 1kg",
                "Rp. 136.000",
                "- Puaskan nafsu makan hewan yang rewel!" +
                        "\nMenampilkan bahan dan protein berkualitas tinggi yang dipilih khusus untuk anjing kecil, Mini Exigent memiliki aroma yang tak tertahankan bagi pemakan yang paling fussiest. Ukuran, bentuk, dan kepadatan kibble MINI EXIGENT telah dirancang khusus untuk miniatur rahang. Dengan kibble berbentuk bantal yang memiliki bagian luar yang renyah dan bagian dalam yang lembut, setiap bagian memiliki tekstur yang menggugah selera yang akan disukai anjing Anda.",
                "Happy Petshop"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_dogfood)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ProductAdapter(this, productList) {
            val intent = Intent(this, ProductDetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}