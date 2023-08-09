package com.akash.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapterDemo(var list:MutableList<MyDataModel1>): RecyclerView.Adapter<RecyclerAdapterDemo.MyDemoHolder>() {
    class MyDemoHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var sem: TextView = itemView.findViewById(R.id.semText)
        var cgpa: TextView = itemView.findViewById(R.id.cgpaTxt)
        var year: TextView = itemView.findViewById(R.id.yearTxt)
        var del: Button = itemView.findViewById(R.id.delBtn)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyDemoHolder {
        val inflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerdemo,parent,false)
        return MyDemoHolder(inflater)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyDemoHolder, position: Int) {
        val data = list[position]
        holder.sem.text = data.getSem()
        holder.cgpa.text = data.getCGPA()
        holder.year.text = data.getYear()
        holder.del.setOnClickListener(){
            list.removeAt(position)
            notifyDataSetChanged()

        }
    }
}