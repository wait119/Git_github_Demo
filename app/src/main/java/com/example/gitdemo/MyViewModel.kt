package com.example.gitdemo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    private val _number = MutableLiveData(0)
    val numberlivedata: LiveData<Int> = _number

    fun add(n: Int) {
        _number.value = _number.value?.plus(n)
    }

    fun reset() {
        _number.value = 0
    }
}