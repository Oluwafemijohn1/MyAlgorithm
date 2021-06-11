package com.example.algorithm

import com.example.algorithm.TargetSumWithPointers.searchTarget
import com.example.algorithm.TargetSumWithPointers2.searchTarget2
import java.util.*
import kotlin.collections.HashMap
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min


//1
/**
 * CREATED BY ANIETIE IN THE CLASS, TO REMOVE DUPLICATE
 * */
object myTargetSumWithPointers {

    fun removeDuplicate(array: IntArray): Int {
        var pointer = 0
        var counter = 0
        for (i in array.indices){
            if (array[i] != pointer){
                pointer = array[i]
                counter ++
            }
        }
        return counter
    }

}

//2
// (NOT TWO POINTERS), REMOVE DUPLICATE
class TwoPointerTechnique () {
    companion object {
//        Given an array of sorted numbers, remove all duplicates from it.
//        You should not use any extra space; after removing the duplicates in-place return the length of the subarray
//        that has no duplicate in it.
//
//        Example:input = [2,3,3,3,6,9,9]
//        output = 4

        fun twoPointerTechnique(arr: IntArray) : Int {
            var pointerOne = 0
            var  counter = 0
            for (i in arr.indices) {
                if (arr[i] != pointerOne) {
                    pointerOne = arr[i]
                    counter++
                }
            }
            return counter
        }
    }
}



//3
/*
* THE PROBLEM AND THE SOLUTION
* TWO POINTERS
* */
/**
 * Given an array of sorted numbers, remove all duplicates from it. You should not use any extra space;
 * after removing the duplicates in-place return the length of the subarray that has no duplicate in it.
 * Example:input = [2,3,3,3,6,9,9]
 * output = 4
 * */

object TargetSumWithPointers {
    fun searchTarget(array: IntArray, targetSum: Int): List<Int> {
        val results = mutableListOf<Int>()
        /// 1, 2, 3, 4, 6    targetSum = 6
        var pointerOne = 0
        var pointerTwo = array.size - 1
        for (i in array.indices) {
            val sum = array[pointerOne] + array[pointerTwo]
            if (sum == targetSum) {
                results.add(pointerOne)
                results.add(pointerTwo)
                break
            } else if (sum > targetSum) {
                pointerTwo --
            } else {
                pointerOne ++
            }
        }

        return results.toList()
    }
}

object TargetSumWithPointers2 {
    fun searchTarget2(array: IntArray, targetSum: Int): List<Int> {
        val results = mutableListOf<Int>()
        /// 1, 2, 3, 4, 6    targetSum = 6
        var pointerOne = 0
        var pointerTwo = array.size - 1
        while (pointerOne < pointerTwo){
            var sum = array[pointerOne] + array[pointerTwo]
            if (sum == targetSum){
                results.add(pointerOne)
                results.add(pointerTwo)
                break
            }else if (sum > targetSum){
                pointerTwo--
            }else{
                pointerOne++
            }
        }
        return results.toList()
    }
}


//4
/**
 * SLIDING WINDOW TECHNIQUE TO FIND MAXIMUM *
 * SOLUTION
 * */
fun findMaxSumArray(array: Array<Int>, k: Int): Int {
    /**
     * 1) Initialize the smallest number possible. In kotlin, it's Int.MIN_VALUE
     * 2) Initialize an initial window sum of zero.
     * 3) If the next window sum is greater the previous window sum, replace it.
     * 4) To slide a window forward, remove the first value of the current window and add the next item outside the window
     */
    var windowSum = 0 // 0+4+2+1 = 7
    var returnValue = Int.MIN_VALUE // 7
    for (index in array.indices) {
        windowSum += array[index]
        if (index >= k - 1) {
            returnValue = max(windowSum, returnValue)
            windowSum -= array[index - (k - 1)]
        }
    }
    return returnValue
}

//5
/**
 * SLIDING WINDOW TECHNIQUE TO FIND MINIMUM
 * SOLUTION
 * */
fun findMinSumArray(array: Array<Int>, k: Int): Int {
    /**
     * 1) Initialize the smallest number possible. In kotlin, it's Int.MIN_VALUE
     * 2) Initialize an initial window sum of zero.
     * 3) If the next window sum is greater the previous window sum, replace it.
     * 4) To slide a window forward, remove the first value of the current window and add the next item outside the window
     */

    var windowSum = 0 // 0+4+2+1 = 7
    var returnValue = Int.MAX_VALUE // 7
    for (index in array.indices) {
        windowSum += array[index]
        if (index >= k - 1) {
            returnValue = min(windowSum, returnValue)
            windowSum -= array[index - (k - 1)]
        }
    }
    return returnValue
}




/**
 * ASSIGNMENT
 * */
/*
Find the smallest subArray to sum up to or more than a target sum k
[4,2,1,7,8,1,2,1,8,1,0] should return 1
 */

fun smallestSubArray(array: Array<Int>, k: Int): Int {

    return 0
}




fun main() {
    //CREATED BY ANIETIE IN THE CLASS, TO REMOVE DUPLICATE
//    removeDuplicate(intArrayOf(2,3,3,3,6,9,9))

    //CREATED BY ME
//    print(powM(2, 2))

     //TWO POINTERS, TARGET SUM
//    print(searchTarget(intArrayOf(2,3,5,6,7,7,8,9,10), 9))
//    println(searchTarget(intArrayOf(2,3,3,3,6,9,9,5), 6))

     // SLIDING WINDOW TECHNIQUES

    //Group 1
//    println(findMaxSumArray(arrayOf(4, 2, 1, 7, 8, 1, 2, 1, 8, 1, 0), 3))
    //Group 2
//    println(findMinSumArray(arrayOf(4, 2, 1, 7, 8, 1, 2, 1, 8, 1, 0), 3))

//    println(searchTarget(intArrayOf(1, 2, 3, 4, 6), 6))
//    println(searchTarget2(intArrayOf(1, 2, 3, 4, 6), 6))

//    println(validBracketArray("[()]{}{[()()]()}"))
//    println(isValid("[()]{}{[()()]()}"))

//    println(bracketArray("{[]}"))
    println(closestNumbers(arrayOf(-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854, -520, -470 )))
}

fun closestNumbers(arr: Array<Int>): Array<Int> {
    // Write your code here
    arr.sort()
    var minDiff = Int.MAX_VALUE

    var returnArray = arrayListOf<Int>()
    for(i in arr.indices){
        for(j in i+1 until arr.size){
            var diff = abs(arr[j] - arr[i])
            minDiff = Math.min(minDiff, diff)
            if(diff == minDiff){
                returnArray.add(i)
                returnArray.add(j)
            }
        }
    }
    return returnArray.toTypedArray()

}




/**
 * WEEK 9 WITHE BOARDING
 * */

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 *
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 *
 * Example 4:
 *
 * Input: s = "([)]"
 * Output: false
 *
 * Example 5:
 *
 * Input: s = "{[]}"
 * Output: true
 *
 * Constraints:
 *
 * 1 <= s.length <= 10^4
 *
 * s consists of parentheses only '()[]{}'
 *
 * */

fun bracketArray(s: String): Boolean{

    var stack = Stack<Char>()

    for (i in s){

        if (i ==  '(' || i== '{' || i == '['){
            stack.push(i)
        }else if (stack.last() == '(' && i == ')' || stack.last() == '{' && i == '}' || stack.last() == '[' && i == ']'){
            stack.pop()
        }
    }
    return stack.empty()
}

fun validBracketArray(s:String):Boolean{
    //Get an HasMap of key ({[ and }})
    val collection = hashMapOf<Char, Char>(
            '(' to ')',
            '{' to '}',
            '[' to ']'
    )
    //Traverse through the string s to check if keys is contains characters in s
    // is contained in our collection
    val stack = Stack<Char>()
    for (element in s){
        //  if we have ( then push the the value ),
        if (collection.containsKey(element)){
            stack.push(collection[element])
            println(collection[element])
        }else if (collection.containsValue(element)){
            if ( stack.isEmpty() || stack.pop() != element){
                return false
            }

        }
    }
    return stack.isEmpty()
}

fun isValid(str: String): Boolean{
    val hashMap = hashMapOf<Char, Char>()
    hashMap['('] = ')'
    hashMap['['] = ']'
    hashMap['{'] = '}'
    val stack = Stack<Char>()
    for (element in str) {
        if (hashMap.containsKey(element)) {
            stack.push(hashMap[element]) //
        } else if (hashMap.containsValue(element)) {
            if (stack.isEmpty() || stack.pop() != element) {
                return false
            }
        }
    }
    return stack.isEmpty()
}







