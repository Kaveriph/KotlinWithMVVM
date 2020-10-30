package com.anushka.viewmodeldemo1

import android.util.Log
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    override fun onCleared() {
        Log.d("InMainActivity", "onCleared of viewmodel")
    }

    private var count = 0

    fun getCurrentCount(): Int {
        return count
    }

    fun getUpdatedCount(): Int {
        return count++
    }
}