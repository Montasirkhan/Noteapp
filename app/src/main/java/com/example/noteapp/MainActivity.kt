package com.example.noteapp

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.noteapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  lateinit  var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.showBtn.setOnClickListener {
            var msg :String =binding.userinput.text.toString()

            Toast.makeText(this@MainActivity,msg, Toast.LENGTH_LONG).show()
            binding.image1.setImageResource(R.drawable.wallpaper)
        }
    }
    }