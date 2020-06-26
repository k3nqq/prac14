package com.example.picasso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.picass.ItemAdapter
import com.example.picass.ItemOfList
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.OkHttpClient

class MainActivity : AppCompatActivity() {
    var users: ArrayList<String> = ArrayList()
    private var client = OkHttpClient()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getUserList()
    }
    private fun getUserList(){
        recyclerview.visibility = View.VISIBLE
        recyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val versions = ArrayList<ItemOfList>()
        versions.addAll(ItemOfList.getAndroidVersionList())
        val Adap = ItemAdapter(versions)
        recyclerview.adapter = Adap
    }
}
