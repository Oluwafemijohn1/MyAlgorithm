package com.example.classcalling

fun main(){
    val className = SecondClass("femi")
  className.printName()

    println(isEven.accept(5))
}

fun interface IntPredicate {
    fun accept(i: Int): Boolean
}

// Creating an instance using lambda
val isEven = IntPredicate { it % 2 == 0 }