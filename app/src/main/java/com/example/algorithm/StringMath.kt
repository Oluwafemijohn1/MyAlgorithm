package com.example.algorithm

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    println(stringMath("1 + 1"))
}

@RequiresApi(Build.VERSION_CODES.N)
fun stringMath(string: String): List<String> {
    var splitedString = string.split("")
    for (i in splitedString){
        val csr =i.chars()

    }
    return splitedString
}