package com.example.kateinasquotes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.kateinasquotes.adapter.ItemAdapter
import com.example.kateinasquotes.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Loading dataset
        val myDataset = Datasource().loadQuotes()
        var recycleView = findViewById<RecyclerView>(R.id.recycler_view)

        recycleView.adapter = ItemAdapter(this,myDataset)
        recycleView.setHasFixedSize(true)
    }
}