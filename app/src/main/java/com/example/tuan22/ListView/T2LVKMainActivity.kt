package com.example.tuan22.ListView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.tuan22.R

class T2LVKMainActivity : AppCompatActivity() {
    var l:ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_t2_lvkmain)
        l = findViewById(R.id.t2lvv)
        val arr = arrayOf("Tuần 1", "Tuần 2","Tuần 3","Tuần 4", "Tuần 5","Tuần 6", "Tuần 7", "Tuần 8", "Tuần 9", "Tuần 10")
        val ad = ArrayAdapter(this, android.R.layout.simple_list_item_1, arr)
        l!!.adapter = ad
    }
}