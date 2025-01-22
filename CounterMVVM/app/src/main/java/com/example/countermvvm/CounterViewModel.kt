package com.example.countermvvm


import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel() : ViewModel() {
    private val counterRepository = CounterRepository()
    private val _count = mutableStateOf(counterRepository.getCounter().count)

    val count: MutableState<Int> = _count
    fun increment() {
        counterRepository.incrementCounter()
        _count.value = counterRepository.getCounter().count
    }
    fun decrement() {
        counterRepository.decrementCounter()
        _count.value = counterRepository.getCounter().count
    }


}