package com.example.algorithm

import java.util.*


fun main(){
    println(minimumRemovalPalindromeParmutation("geeksforgeeks"))
}


fun minimumRemovalPalindromeParmutation(palindromeString: String): Int {
    val stack = Stack<String>()
    val charArray = palindromeString.split("")
    for (i in charArray){
        if (stack.contains(i)){
            stack.remove(i)
        }else{
            stack.add(i)
        }
    }
    val stackSize = stack.size
    return if(stackSize == 0) 0 else stackSize -1
}