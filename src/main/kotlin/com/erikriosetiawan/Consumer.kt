package com.erikriosetiawan

class Consumer<in T> {
    fun consume(t: T) {
    println("I'm consume $t")
    }
}