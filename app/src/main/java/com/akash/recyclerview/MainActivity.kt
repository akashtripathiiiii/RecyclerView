package com.akash.recyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    lateinit var adap:RecyclerAdapterDemo
    val list = ArrayList<MyDataModel1>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = (layoutManager)
        recyclerView.itemAnimator=DefaultItemAnimator()
        adap=RecyclerAdapterDemo(list)
        recyclerView.adapter =adap
        call()


    }
    fun call() {
        list.add(MyDataModel1("Sem 1", "9.0","2019"))
        list.add(MyDataModel1("Sem 2", "8.9","2019"))
        list.add(MyDataModel1("Sem 3", "8.7","2020"))
        list.add(MyDataModel1("Sem 4", "9.2","2020"))
        list.add(MyDataModel1("Sem 5", "9.4","2021"))
        list.add(MyDataModel1("Sem 6", "9.3","2021"))
        list.add(MyDataModel1("Sem 7", "9.6","2022"))
        list.add(MyDataModel1("Sem 8", "9.2","2022"))
        adap.notifyDataSetChanged()

    }
}