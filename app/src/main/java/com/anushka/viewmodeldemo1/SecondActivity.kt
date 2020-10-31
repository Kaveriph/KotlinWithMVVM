package com.anushka.viewmodeldemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.anushka.viewmodeldemo1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    private lateinit var viewModel : MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding.countText.text = viewModel.getCurrentCount().toString()
        binding.addButton.setOnClickListener {
            binding.countText.text = viewModel.getUpdatedCount(binding.etNumber.text.toString().toInt()).toString()
        }
    }

    override fun onRestart() {
        Log.d("InSecondActivity", "onRestart")
        super.onRestart()
    }

    override fun onPostResume() {
        Log.d("InSecondActivity", "onPostResume")
        super.onPostResume()
    }

    override fun onStart() {
        Log.d("InSecondActivity", "onStart")
        super.onStart()
    }

    override fun onPause() {
        Log.d("InSecondActivity", "onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("InSecondActivity", "onStop")
        super.onStop()
    }

    override fun onResume() {
        Log.d("InSecondActivity", "onResume")
        super.onResume()
    }

    override fun onDestroy() {
        Log.d("InSecondActivity", "onDestroy")
        super.onDestroy()
    }
}