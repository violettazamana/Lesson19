package com.zamana.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.zamana.myapplication.databinding.ActivityHomeBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView.text = "qsdads sdfdsf"
        val adapter = HomeAdapter(this)
        binding.listView.adapter = adapter
        binding.listView.layoutManager = LinearLayoutManager(this)
        (binding.listView.adapter as HomeAdapter).setList(HomeWorkRepository.listHomeworks)
        binding.listView.isNestedScrollingEnabled = true
    }
}