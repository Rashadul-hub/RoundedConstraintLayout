package com.example.roundedconstraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roundedconstraintlayout.databinding.ActivityMainBinding


//This IS Incomeplete

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}