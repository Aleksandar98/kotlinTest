package com.aca.kotlintest.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aca.kotlintest.Models.People
import com.aca.kotlintest.R
import java.util.ArrayList

class RecyAdapter(val lista:List<People>) : RecyclerView.Adapter<RecyAdapter.ViewHolder>() {



    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nameTv : TextView = itemView.findViewById(R.id.nameTv)
        var descTv : TextView = itemView.findViewById(R.id.descTv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.recy_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameTv.text = lista.get(position).name
        holder.descTv.text = lista.get(position).desc
    }
}