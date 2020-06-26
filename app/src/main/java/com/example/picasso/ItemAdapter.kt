package com.example.picass

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.picasso.R
import com.squareup.picasso.Picasso

class ItemAdapter(var List: ArrayList<ItemOfList>): RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter.ViewHolder {
        var view: View = LayoutInflater.from(parent.context).inflate(R.layout.list, parent, false)
        return ViewHolder(view)
    }
    override fun getItemCount() = List.size
    override fun onBindViewHolder(holder: ItemAdapter.ViewHolder, position: Int) {
        holder.bindItems(List[position])
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bindItems(version : ItemOfList){
            val imageView = itemView.findViewById<ImageView>(R.id.imageview)
            Picasso.get().load(version.imageURL).into(imageView)
        }
    }
}
