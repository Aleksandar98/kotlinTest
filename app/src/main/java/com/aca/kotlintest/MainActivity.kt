package com.aca.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aca.kotlintest.Adapters.RecyAdapter
import com.aca.kotlintest.Models.People
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lista:ArrayList<People> = ArrayList()
        lista.add(People("Aleksandar Mitrovic","Opis 1"))
        lista.add(People("Aleksandar Mitrovic","Opis 1"))
        lista.add(People("Aleksandar Mitrovic","Opis 1"))
        lista.add(People("Aleksandar Mitrovic","Opis 1"))
        lista.add(People("Aleksandar Mitrovic","Opis 1"))
        lista.add(People("Aleksandar Mitrovic","Opis 1"))
        lista.add(People("Aleksandar Mitrovic","Opis 1"))
        recyclerView.layoutManager = LinearLayoutManager(this);
        recyclerView.adapter = RecyAdapter(lista)
    }
}