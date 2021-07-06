package com.geek.android4_4.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    val count = MutableLiveData<Int>()
    val commands = MutableLiveData<String>()

    private var counter = 0
    private var command = ""

    fun plus() {
        counter++
        count.value = counter

        command += "+\n"
        commands.value = command
    }

    fun minus() {
        counter--
        count.value = counter

        command += "-\n"
        commands.value = command
    }

}