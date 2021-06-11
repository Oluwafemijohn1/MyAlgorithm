package com.example.algorithm

import android.os.Build
import androidx.annotation.RequiresApi
import kotlin.math.pow


fun main() {
//    print(migratoryBirds(arrayOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)))
//    println(getTotalX(arrayListOf(2, 4), arrayListOf(16, 32, 96)))
//    println(TwoPointerTechnique.twoPointerTechnique(intArrayOf(2, 3, 3, 3, 6, 9, 9)))
//    println(TwoPointerTechnique.twoPointerTechnique(intArrayOf(2,5,3,4,4,6,7,7,7)))
//    print(migratoryBirds(arrayOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)))
//    println(getTotalX(arrayListOf(2, 4), arrayListOf(16, 32, 96)))


    //POWER FUNCTION CREATED BY ME
//    print(powM(2, 2))

    //POW USAGE
//    println(2.0.pow(2.0))

//    println(sockMerchant(9, arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20)))

    println(reverseNumber(23))

}

fun reverseNumber(num: Int):Int{
    var num = num
    var reversed = 0

    while (num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }
    return reversed
}


fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    /*
     * Write your code here.
     */

    return keyboards.flatMap { k -> drives.map { it + k } }
            .filter { it <= b }
            .max() ?:-1
}



fun sockMerchant(n: Int, ar: Array<Int>): Int {
    // Write your code here
    return  0
}



fun strangeCounter(t: Long): Long {
    var t1: Long = 2
    var v1: Long = 3
    var r: Long = 0
    while (t1 < t) {
        t1 += v1
        v1 *= 2
    }
    r = (t1 - 1) % t
    if (r == 0L) r = v1
    return r
}

fun powM(a: Long, b: Int):Long{
    var result =1L
    for(i in 1..b){
        result *= a
    }
    return result
}

fun migratoryBirds(arr: Array<Int>): Int {

    // Complete this function
    var n = arr.size
    val ary = IntArray(n)
    for (i in 0 until n) ary[arr[i]]++
    var max = 0
    var maxpos = 0
    for (i in 0 until n) {
        if (ary[i] > max) {
            max = ary[i]
            maxpos = i
        }
    }
    return maxpos

}


fun getTotalX(a: List<Int>, b: List<Int>): Int {
    // Write your code here
    var n = a.size
    var m = b.size
    a.sorted()
    b.sorted()
    val lower_bound = a[n - 1]
    val upper_bound = b[0]
    var count_x = 0
    for (i in lower_bound..upper_bound) {
        var sum_mod = 0
        for (j in 0 until n) {
            sum_mod += i % a[j]
        }
        for (k in 0 until m) {
            sum_mod += b[k] % i
        }
        if (sum_mod == 0) count_x++
    }
    return count_x
}

// Complete the countApplesAndOranges function below.
fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    var applesCount = 0
    var orangesCount = 0
    for(fruit in apples){
        if(a+fruit >= s && a+fruit <= t)
            applesCount++
    }
    for(fruit in oranges){
        if(b+fruit <= t && b+fruit >= s)
            orangesCount++
    }
    print("$applesCount\n$orangesCount")
}



