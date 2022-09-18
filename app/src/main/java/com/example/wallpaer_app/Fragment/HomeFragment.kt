package com.example.wallpaer_app.Fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wallpaer_app.AdapterClass.CategoriesAdapter
import com.example.wallpaer_app.AdapterClass.ColorAdapter
import com.example.wallpaer_app.AdapterClass.HorizantalAdapter
import com.example.wallpaer_app.ModelClass.CategoriesModel
import com.example.wallpaer_app.ModelClass.Horizantal_Image
import com.example.wallpaer_app.ModelClass.colorModel
import com.example.wallpaer_app.R
import kotlinx.android.synthetic.main.fragment_home.view.*
import java.util.*


class HomeFragment : Fragment() {

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var arrdata  = ArrayList<Horizantal_Image>()
        arrdata.add(Horizantal_Image(R.drawable.image1))
        arrdata.add(Horizantal_Image(R.drawable.image2))
        arrdata.add(Horizantal_Image(R.drawable.image3))
        arrdata.add(Horizantal_Image(R.drawable.image4))
        arrdata.add(Horizantal_Image(R.drawable.image5))
        arrdata.add(Horizantal_Image(R.drawable.image6))
        arrdata.add(Horizantal_Image(R.drawable.image7))
        arrdata.add(Horizantal_Image(R.drawable.image8))
        arrdata.add(Horizantal_Image(R.drawable.image9))
        arrdata.add(Horizantal_Image(R.drawable.image10))


        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
//      HomeFragment(view.recyclerView)
        view.recyclerView.adapter = HorizantalAdapter(arrdata)
        view.recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)


   // for color  item
        var Color_arrdata = ArrayList<colorModel>()
        Color_arrdata.add(colorModel(android.R.color.holo_green_dark))
        Color_arrdata.add(colorModel(R.color.firsr_color))
        Color_arrdata.add(colorModel(R.color.second_color))
        Color_arrdata.add(colorModel(R.color.third_color))
        Color_arrdata.add(colorModel(R.color.fourth_color))
        Color_arrdata.add(colorModel(R.color.firsr_color))
        Color_arrdata.add(colorModel(R.color.sixth_color))
        Color_arrdata.add(colorModel(R.color.seventh_color))
        Color_arrdata.add(colorModel(R.color.eight_color))
        Color_arrdata.add(colorModel(R.color.ninth_color))
        Color_arrdata.add(colorModel(R.color.tenth_color))
       view.color_recyclerView.adapter = ColorAdapter(Color_arrdata)
       view.color_recyclerView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)



        // For Categories Item
        var categories_arrdata = ArrayList<CategoriesModel>()
        categories_arrdata.add(CategoriesModel("Abstract",R.drawable.male_vector))
//        categories_arrdata.add(CategoriesModel("Nature",R.drawable.nature))
//        categories_arrdata.add(CategoriesModel("Landscapes",R.drawable.landscape))
//        categories_arrdata.add(CategoriesModel("Flowers",R.drawable.flower))
//        categories_arrdata.add(CategoriesModel("Mountains",R.drawable.mautain))
//        categories_arrdata.add(CategoriesModel("Forest",R.drawable.forest))

        view.categories_recyclerView.adapter = CategoriesAdapter(categories_arrdata)
        view.categories_recyclerView.layoutManager = GridLayoutManager(context,2)



        return view
    }

}