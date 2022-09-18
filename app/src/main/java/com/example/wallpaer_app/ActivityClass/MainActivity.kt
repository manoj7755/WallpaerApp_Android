package com.example.wallpaer_app.ActivityClass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

import com.example.wallpaer_app.Fragment.DownloadFragment
import com.example.wallpaer_app.Fragment.HomeFragment
import com.example.wallpaer_app.Fragment.UserFragment

import com.example.wallpaer_app.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    val fm = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        frag(HomeFragment())
bottom_navigation.setOnItemSelectedListener {
    when (it.itemId) {
        R.id.window -> frag(HomeFragment())
        R.id.download -> frag(DownloadFragment())
        R.id.user-> frag(UserFragment())
    }
    true
}


    }
    fun frag(frag:Fragment){
        val ft = fm.beginTransaction()
        ft.replace(R.id.containers,frag)
        ft.commit()
    }
}