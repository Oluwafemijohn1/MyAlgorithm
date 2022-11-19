package com.example.algorithm

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    println(stringMath("1 + 1"))
}

fun stringMath(string: String): Int{
    var result = 0
    return when(string){
        "+" -> {
            result = string.split(" ").map { it.toInt() }.reduce { acc, i -> acc + i }
            result
        }
        "-" -> {
            result = string.split(" ").map { it.toInt() }.reduce { acc, i -> acc - i }
            result
        }
        "*" -> {
            result = string.split(" ").map { it.toInt() }.reduce { acc, i -> acc * i }
            result
        }
        "/" -> {
            result = string.split(" ").map { it.toInt() }.reduce { acc, i -> acc / i }
            result
        }
        else -> {
            result = string.toInt()
            result
        }
    }
}