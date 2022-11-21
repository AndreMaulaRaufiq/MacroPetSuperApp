package com.example.macropetsuperapp.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.macropetsuperapp.R

class ProductAdapter(
    private val context: Context,
    val product: List<ProductItems>,
    val listener: (ProductItems) -> Unit
) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {
    class ProductViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val productImage = view.findViewById<ImageView>(R.id.rv_catfood_image)
        val productName = view.findViewById<TextView>(R.id.rv_catfood_title)
        val productPrice = view.findViewById<TextView>(R.id.rv_catfood_price)
        val productSeller = view.findViewById<TextView>(R.id.rv_catfood_seller)

        fun bindView(productItems: ProductItems, listener: (ProductItems) -> Unit) {
            productImage.setImageResource(productItems.productImg)
            productName.text = productItems.productName
            productPrice.text = productItems.productPrice
            productSeller.text = productItems.productSeller
            itemView.setOnClickListener {
                listener(productItems)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(
            LayoutInflater.from(context).inflate(R.layout.rv_product_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bindView(product[position], listener)
    }

    override fun getItemCount(): Int = product.size
}