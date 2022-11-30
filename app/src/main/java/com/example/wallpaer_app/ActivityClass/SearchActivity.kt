package com.example.wallpaer_app.ActivityClass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.wallpaer_app.AdapterClass.RecycleViewAdapterOfSearch
import com.example.wallpaer_app.ModelClass.search_model
import com.example.wallpaer_app.R
import kotlinx.android.synthetic.main.activity_search.*

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
val searchData = ArrayList<search_model>().apply {
    add(search_model(R.drawable.image1))
    add(search_model(R.drawable.image2))
    add(search_model(R.drawable.image3))
    add(search_model(R.drawable.image4))
}
        recycleViewOfSearch.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        recycleViewOfSearch.adapter = RecycleViewAdapterOfSearch(this,searchData)
    }
}