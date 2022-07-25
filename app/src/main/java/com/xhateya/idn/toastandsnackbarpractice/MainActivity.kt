package com.xhateya.idn.toastandsnackbarpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import com.google.android.material.snackbar.Snackbar
import com.xhateya.idn.toastandsnackbarpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSnackbar.setOnClickListener {
            val snackbar = Snackbar.make(binding.root, "This is a simple snackbar", Snackbar.LENGTH_INDEFINITE)
            snackbar.setAction("Dismiss"){
                Snackbar.make(binding.root,"Dismissed", Snackbar.LENGTH_SHORT).show()
            }.show()

        }

        binding.btnToast.setOnClickListener {
            Toast.makeText(this, "Hey!This is a toast", Toast.LENGTH_SHORT).show()

        }
    }
}