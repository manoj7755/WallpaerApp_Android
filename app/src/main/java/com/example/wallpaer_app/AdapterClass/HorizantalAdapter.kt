package com.example.wallpaer_app.AdapterClass

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wallpaer_app.ModelClass.Horizantal_Image
import com.example.wallpaer_app.R
import kotlinx.android.synthetic.main.horizantal_item.view.*
import java.util.*
class HorizantalAdapter(val context: Activity,val arrdata:ArrayList<Horizantal_Image>):RecyclerView.Adapter<HorizantalAdapter.ViewHolder>() {
    class ViewHolder(itemview:View):RecyclerView.ViewHolder(itemview) {
      val imagePath = itemview.card_image
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.horizantal_item,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
holder.imagePath.setImageResource(arrdata[position].ImageUrl)
//        Glide.with(context).load(arrdata[position].ImageUrl).into(holder.imagePath)

    }

    override fun getItemCount(): Int {
return arrdata.size
    }
}