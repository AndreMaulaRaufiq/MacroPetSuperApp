package com.example.macropetsuperapp.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.macropetsuperapp.R

class PetsAdapter(
    private val context: Context,
    val pets: List<PetsItems>,
    val listener: (PetsItems) -> Unit
) : RecyclerView.Adapter<PetsAdapter.PetsViewHolder>() {
    class PetsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val petsImg = view.findViewById<ImageView>(R.id.pet_img)
        val petsName = view.findViewById<TextView>(R.id.pet_name)
        val petsAge = view.findViewById<TextView>(R.id.pet_age)
        val petsGender = view.findViewById<TextView>(R.id.pet_gender)

        fun bindView(petsItems: PetsItems, listener: (PetsItems) -> Unit) {
            petsImg.setImageResource(petsItems.petImg)
            petsName.text = petsItems.petName
            petsAge.text = petsItems.petAge
            petsGender.text = petsItems.petSex
            itemView.setOnClickListener {
                listener(petsItems)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetsViewHolder {
        return PetsViewHolder(
            LayoutInflater.from(context).inflate(R.layout.rv_pets_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PetsViewHolder, position: Int) {
        holder.bindView(pets[position], listener)
    }

    override fun getItemCount(): Int = pets.size
}