package com.example.algorithm

import java.util.*

fun main(){
    println(palindromeParmutations("acba"))
}

fun palindromeParmutations(palindromeString: String):Boolean {
    val charArray = palindromeString.split("")
    val stack = Stack<String>()
    for (i in charArray){
        if (stack.contains(i)){
            stack.remove(i)
        }else{
            stack.add(i)
        }
    }
    return stack.size <= 1
}

