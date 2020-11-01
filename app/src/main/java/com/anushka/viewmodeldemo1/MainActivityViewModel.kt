package com.anushka.viewmodeldemo1

import android.util.Log
import android.widget.EditText
import androidx.lifecycle.ViewModel

class MainActivityViewModel(initialValue: Int) : ViewModel() {

    private var count = 0

    init {
        count = initialValue
    }

    override fun onCleared() {
        Log.d("InMainActivity", "onCleared of viewmodel")
    }

    fun getCurrentCount(): Int {
        return count
    }

    fun getUpdatedCount(etNumber: Int): Int {
        count  = count+etNumber
        return count
    }
}