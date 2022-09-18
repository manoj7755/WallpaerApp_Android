package com.example.wallpaer_app.AdapterClass

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wallpaer_app.ModelClass.colorModel
import com.example.wallpaer_app.R
import kotlinx.android.synthetic.main.color_item.view.*
import java.util.*

class ColorAdapter(val color_arrdata:ArrayList<colorModel>) :RecyclerView.Adapter<ColorAdapter.ViewHolder>(){
    class ViewHolder(itemview: View):RecyclerView.ViewHolder(itemview) {
val coloritem = itemview.color
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.color_item,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.coloritem.setBackgroundResource(color_arrdata[position].color)
    }

    override fun getItemCount(): Int {
return color_arrdata.size
    }
}