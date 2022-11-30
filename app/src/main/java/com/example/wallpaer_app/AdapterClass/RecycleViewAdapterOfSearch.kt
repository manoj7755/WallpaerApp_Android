package com.example.wallpaer_app.AdapterClass

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wallpaer_app.ModelClass.search_model
import com.example.wallpaer_app.R
import kotlinx.android.synthetic.main.horizantal_item.view.*

class RecycleViewAdapterOfSearch(val context: Context,val SearchData:ArrayList<search_model>) :RecyclerView.Adapter<RecycleViewAdapterOfSearch.ViewHolder>() {
    class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
     val searchImg = itemView.card_image
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      return ViewHolder(LayoutInflater.from(context).inflate(R.layout.horizantal_item,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
   holder.searchImg.setImageResource(SearchData[position].searchImg)
    }

    override fun getItemCount(): Int {
       return SearchData.size
    }
}