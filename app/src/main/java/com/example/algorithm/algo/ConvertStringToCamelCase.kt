package com.example.algorithm.algo

fun main(args: Array<String>) {
//    println(toCamelCase3("the-stealth-warrior"))
//    println(toCamelCase3("The_Stealth_Warrior"))
//    println(toCamelCase3("The-Stealth-Warrior"))
//    println(toCamelCase3("A-B-C"))
    println(stringMath("1+2*3"))
}

fun toCamelCase(str: String): String = str.split("-", "_").mapIndexed { index, s -> if (index == 0) s else s.capitalize() }.joinToString("")

fun toCamelCase2(str:String):String = str.split(Regex("_|-")).reduce{ fullString, word -> fullString + word.capitalize() }

fun toCamelCase3(s: String) = s.split("-", "_").run {
    println(this)
    drop(1).joinToString("", first()) { it.capitalize() }
}

fun toCamelCase4(str:String):String{
    var srt = ""
    return str.split("_", "-").reduce{ fullString, word ->
//        println(word.capitalize())
        println(fullString)
        fullString + word.capitalize() }
}


fun stringMath(string: String): Int{
    var result = 0
    return when(string){
        "+" -> {
            string.split("").map { it.toInt() }.reduce { acc, i -> acc + i }

        }
        "-" -> {
             string.split("").map { it.toInt() }.reduce { acc, i -> acc - i }

        }
        "*" -> {
             string.split("").map { it.toInt() }.reduce { acc, i -> acc * i }
        }
        "/" -> {
            string.split("").map { it.toInt() }.reduce { acc, i -> acc / i }

        }
        else -> {
             string.toInt()
        }
    }
}