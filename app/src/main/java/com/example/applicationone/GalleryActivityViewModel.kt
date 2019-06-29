package com.example.applicationone

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryActivityViewModel : ViewModel() {
    private var currentVal : Int = 0

    private var text = "123445"

    fun setText(input: String) {
        currentVal = 1 - currentVal
        text = input
    }

    fun getText(): String {
        return text
    }

    fun getInitial() : Int {
        return currentVal
    }
}