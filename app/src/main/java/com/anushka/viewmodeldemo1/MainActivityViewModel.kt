package com.anushka.viewmodeldemo1

import android.util.Log
import android.widget.EditText
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(initialValue: Int) : ViewModel() {

    private var count = MutableLiveData<Int>()
    val countTotal: LiveData<Int>
        get() = count

    init {
        count.value = initialValue
    }

    override fun onCleared() {
        Log.d("InMainActivity", "onCleared of viewmodel")
    }

    fun updateCount(etNumber: Int) {
        count.value  = count.value?.plus(etNumber)
    }
}