package com.example.activity_1

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.activity_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapteroflist: ArrayList<dataitems>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the layout using ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Your list of countries
        val country = arrayOf(
            "Philippines", "Canada", "United States", "Sweden", "Germany", "Italy",
            "Australia", "Finland", "Denmark", "Netherlands", "Spain", "Belgium",
            "Ireland", "Japan", "China", "South Korea", "India", "Brazil", "Russia", "Thailand"
        )

        // Initialize the adapter's data
        adapteroflist = ArrayList()
        for (i in country.indices) {
            adapteroflist.add(dataitems(country[i]))
        }

        // Access the ListView directly using binding
        val listView: ListView = binding.listView  // Access ListView via binding
        val adapter = listadapter(this, adapteroflist)  // Set custom adapter
        listView.adapter = adapter  // Set the adapter to the ListView
    }
}
