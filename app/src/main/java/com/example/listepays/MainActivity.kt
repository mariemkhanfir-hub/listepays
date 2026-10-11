
package com.example.listepays

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listViewPays)

        val countries = resources.getStringArray(R.array.countries)

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            countries
        )

        listView.adapter = adapter

        listView.setOnItemClickListener { parent, _, position, _ ->
            val item = parent.getItemAtPosition(position).toString()

            Toast.makeText(
                this,
                "Pays sélectionné : $item",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
