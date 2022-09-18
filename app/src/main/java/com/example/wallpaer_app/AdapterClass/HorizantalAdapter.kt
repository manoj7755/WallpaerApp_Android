package com.example.wallpaer_app.AdapterClass

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wallpaer_app.Fragment.HomeFragment
import com.example.wallpaer_app.ModelClass.Horizantal_Image
import com.example.wallpaer_app.R
import kotlinx.android.synthetic.main.horizantal_item.view.*
import java.util.*
import java.util.zip.Inflater

class HorizantalAdapter(val arrdata:ArrayList<Horizantal_Image>):RecyclerView.Adapter<HorizantalAdapter.ViewHolder>() {
    class ViewHolder(itemview:View):RecyclerView.ViewHolder(itemview) {
      val imagePath = itemview.card_image
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.horizantal_item,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
holder.imagePath.setImageResource(arrdata[position].Image)
    }

    override fun getItemCount(): Int {
return arrdata.size
    }
}