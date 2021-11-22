package com.example.algorithm

import android.os.Build
import androidx.annotation.RequiresApi
import java.nio.file.Paths.get
import kotlin.properties.Delegates

fun main() {

//    val rectangle = Rectangle(3, 4)
//    println(rectangle.result)


    /*The use case of by Delegate */
//    val b = BaseImpl(10)
//
//    println(b.print())
//    Derived(b).print()

    var e = Employee("feh", "uurr", 33)
    e.hello()

}

open class A(var a:String) {

    var name = "Super class"
    private var number by Delegates.notNull<Int>()

    @RequiresApi(Build.VERSION_CODES.O)
    open fun print(): String {
//       var value:String

        return name
    }

    var value: String = ""
        get() = name
        set(value) {
            field = value
        }

    val value2
        get() = name

}


class B(var name2: String) : A(name2) {

//    @RequiresApi(Build.VERSION_CODES.O)
    override fun print():String{
    this.name2
        return " Sub class "
    }

}

class Rectangle(val width: Int, val height: Int) {
    val square: Int
        get() = this.width * this.height
    val a = A(width.toString())

    val result: String
        get() = a.name
}


/*The use case of by Delegate */
interface Base {
    val props:Int
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override val props: Int
        get() = TODO("Not yet implemented")

    override fun print() {
        print(x)
    }
}

class Derived(b: Base) : Base by b


/*Interface*/
interface Named {
    val name: String
    fun hello(){
        println("Hello")
    }
}

interface Person : Named {
    val firstName: String
    val lastName: String

    override val name: String get() = "$firstName $lastName"
}

data class Employee(
    // implementing 'name' is not required
    override val firstName: String,
    override val lastName: String,
    val position: Int
) : Person






//interface 2
interface AA {
    fun foo() { print("A") }
    fun bar()
}

interface BB {
    fun foo() { print("B") }
    fun bar() { print("bar") }
}

class C : AA {
    override fun bar() { print("bar") }
}

class D : AA, BB {
    override fun foo() {
        super<AA>.foo()
        super<BB>.foo()
    }

    override fun bar() {
        super<BB>.bar()
    }
}

