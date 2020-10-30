package com.anushka.viewmodeldemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.anushka.viewmodeldemo1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("InMainActivity", "onCreate")
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding.countText.text = viewModel.getCurrentCount().toString()
        binding.button.setOnClickListener {
            binding.countText.text = viewModel.getUpdatedCount().toString()
        }
    }

    override fun onRestart() {
        Log.d("InMainActivity", "onRestart")
        super.onRestart()
    }

    override fun onPostResume() {
        Log.d("InMainActivity", "onPostResume")
        super.onPostResume()
    }

    override fun onStart() {
        Log.d("InMainActivity", "onStart")
        super.onStart()
    }

    override fun onPause() {
        Log.d("InMainActivity", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("InMainActivity", "onStop")
        super.onStop()
    }

    override fun onResume() {
        Log.d("InMainActivity", "onResume")
        super.onResume()
    }

    override fun onDestroy() {
        Log.d("InMainActivity", "onDestroy")
        super.onDestroy()
    }
}