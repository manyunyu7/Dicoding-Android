package com.feylabs.navigationdrawer.bottom_navigation.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment si Bottom Nav ya"
    }
    val text: LiveData<String> = _text
}