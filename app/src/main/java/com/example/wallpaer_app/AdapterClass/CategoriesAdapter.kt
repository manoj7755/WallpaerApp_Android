package com.example.wallpaer_app.AdapterClass

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wallpaer_app.ModelClass.CategoriesModel
import com.example.wallpaer_app.R
import kotlinx.android.synthetic.main.categories_item.view.*
import java.util.*

class CategoriesAdapter(val categories_arrdata:ArrayList<CategoriesModel>):RecyclerView.Adapter<CategoriesAdapter.ViewHolder>() {
    class ViewHolder(Ivew: View) : RecyclerView.ViewHolder(Ivew) {
        // val image = Ivew.card_image
        val title = Ivew.categories_title
        val category_img = Ivew.category_image
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.categories_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
     holder.category_img.setImageResource(categories_arrdata[position].image)
//        holder.category_img.setImageResource(R.drawable.nature)
//        Log.d(" restag", value.toString())
        holder.title.text = categories_arrdata[position].name

    }
        override fun getItemCount(): Int {
            return categories_arrdata.size
        }

}