package com.example.algorithm

fun main() {
    println(find(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
}


//Mine solution
fun find(integers: Array<Int>): Int {
    var even = mutableListOf<Int>()
    var odd = mutableListOf<Int>()
    integers.forEach {
        if (it % 2 == 0) even.add(it)
        else odd.add(it)
    }
    println(even)
    println(odd)
    return     if (even.size == 1)   even[0] else   odd[0]
}


// Other people's solution on code war

fun find2(integers: Array<Int>) = integers.singleOrNull { it % 2 == 0 } ?: integers.single { it % 2 != 0 }

fun find3(integers: Array<Int>): Int {
    val (even, odd) = integers.partition { it % 2 == 0 }
    return if (even.size == 1) even[0] else odd[0]
}

fun find4(integers: Array<Int>): Int {
    val evens = integers.filter { it % 2 == 0 }
    val odds = integers.filter { it % 2 != 0 }
    return if(evens.size == 1){
        evens.first()
    }else{
        odds.first()
    }
}

fun find5(integers: Array<Int>): Int =
    integers.groupBy { it % 2 == 0 }.values.first { it.size == 1 }.first()

fun find6(arr: Array<Int>): Int {
    return arr.partition { it % 2 == 0 }.let { if (it.first.size == 1) it.first[0] else it.second[0] }
}

fun find7(ints: Array<Int>) = ints.first { it and 1 == if (ints.slice(0..2).count { it and 1 == 0 } > 1) 1 else 0 }