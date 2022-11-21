package com.example.macropetsuperapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.macropetsuperapp.recyclerview.ProductItems

class ProductDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        /** Ini buat tombol back */
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val productDetail =
            intent.getParcelableExtra<ProductItems>(CatFoodActivity.INTENT_PARCELABLE)

        val productImg = findViewById<ImageView>(R.id.img_item_photo)
        val productName = findViewById<TextView>(R.id.tv_item_name)
        val productPrice = findViewById<TextView>(R.id.tv_item_price)
        val productDesc = findViewById<TextView>(R.id.tv_item_description)
        val productSeller = findViewById<TextView>(R.id.tv_item_seller)

        productImg.setImageResource(productDetail?.productImg!!)
        productName.text = productDetail.productName
        productPrice.text = productDetail.productPrice
        productDesc.text = productDetail.productDesc
        productSeller.text = productDetail.productSeller
    }

 /** Tombolnya kaga muncul T_T */
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}