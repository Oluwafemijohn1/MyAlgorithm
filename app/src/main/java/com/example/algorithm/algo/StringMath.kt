package com.example.algorithm

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    println(stringMath("1 + 1"))
}

@RequiresApi(Build.VERSION_CODES.N)
fun stringMath(string: String): Int{
    var result = 0
    for (i in string.split(" ")) {
        if (i.contains("+")) {
            result += i.split("+")[1].toInt()
        } else if (i.contains("-")) {
            result -= i.split("-")[1].toInt()
        } else if (i.contains("*")) {
            result *= i.split("*")[1].toInt()
        } else if (i.contains("/")) {
            result /= i.split("/")[1].toInt()
        }
    }
    return result
}