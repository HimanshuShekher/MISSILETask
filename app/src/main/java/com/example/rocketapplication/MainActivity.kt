package com.example.rocketapplication

import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.rocketapplication.adapter.RocketAdapter
import com.example.rocketapplication.databinding.ActivityMainBinding
import com.example.rocketapplication.view_model.RocketViewModel
import java.io.Serializable

class MainActivity : AppCompatActivity() {
    lateinit var rocketAdapter: RocketAdapter
    lateinit var binding: ActivityMainBinding
    private val rocketViewModel: RocketViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
