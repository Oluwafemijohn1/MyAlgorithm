package com.example.algorithm.algo

import java.util.regex.Pattern

fun main() {
    println(getCount3("abracadabra"))
}

fun getCount(str : String) : Int {
    var count = 0
    for(i in 0 until str.length){
        if (Pattern.matches("[aeiou]", str[i].toString())){
            count++
        }
    }
    return count
}

fun getCount2(str : String) = str.count { it in "aeiou" }
fun getCount3(str : String): Int = str.count { it in listOf('a','i','e','o','u') }

fun getCount4(str : String) : Int {
    return str.count{x->"aeiou".contains(x)}
}

fun getCount5(str : String) : Int {
    val regex = Regex("([aeiou])")
    return regex.findAll(str).count()
}

fun getCount6(str : String) : Int = str.length - str.replace("[aeiou]".toRegex(),"").length
fun getCount7(str : String) = str.filter { ch -> ch in "aeiou" }.length