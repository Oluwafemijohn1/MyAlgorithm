package com.example.algorithm

import android.app.Notification
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import android.os.Message
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.annotation.RequiresApi
//import androidx.core.content.ContextCompat
//import androidx.core.content.res.ResourcesCompat


interface Utils{
    companion object{
        /*Regular function*/
        fun isEvent(x:Int):Boolean = x % 2 == 0
        fun isOdd(x:Int):Boolean = isOdd(x)
    }
}

/*Extension function*/
fun Int.isEven()= this % 2 == 0
//fun Int.isOdd() = isOdd()

fun  test(x:Int){
    /*Regular function*/
    Utils.isEvent(3)
    Utils.isOdd(4)

    val even = x.isEven()
    /*Using extension function with context*/

}






//
//fun test2(context: Context){
//    context.toast("Oluwafemi", )
//}
//
//private fun Context.toast(message: String, length:Int = Toast.LENGTH_SHORT ) {
//    Toast.makeText(this, message, length).show()
//}
//
//
//
//
//
//fun test3(viewGroup: ViewGroup, @LayoutRes layoutRes:Int){
//    /*The normal way*/
//    val view = LayoutInflater.from(viewGroup.context).inflate(layoutRes, viewGroup, true)
//    /*this can also be done with extension function as*/
//    var view2 = viewGroup.inflate2(layoutRes)
//
//    /*Also with expression function*/
//    var view3 = viewGroup.inflate3(layoutRes)
//}
//
//
///*Extension function*/
//fun ViewGroup.inflate2(@LayoutRes layoutRes: Int, attachToRoot:Boolean = false): View {
//   return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
//}
//
///*The above can be converted to Expression function like*/
//fun ViewGroup.inflate3(@LayoutRes layoutRes: Int, attachToRoot:Boolean = false): View =
//    LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
//
//
//fun test4(view: View){
//    view.onClick4{
//
//    }
//}
//
//private fun View.onClick() {
//    setOnClickListener(object :View.OnClickListener{
//        override fun onClick(v: View?):Unit {
//
//        }
//    })
//}
//
//fun View.onClick2() {
//    setOnClickListener(object :View.OnClickListener{
//        override fun onClick(v: View?):Unit {
//
//        }
//    })
//}
//
///*Passing in lambda function */
// fun View.onClick3(listener:(View)->Unit) {
//    setOnClickListener(object :View.OnClickListener{
//        override fun onClick(v: View?):Unit {
//
//        }
//    })
//}
//
///*Converting it to lambda function*/
// fun View.onClick4(listener:(View)->Unit) {
//    setOnClickListener { listener(it) }
//}
//
///*Converting it to inline function*/
//inline fun View.onClick5(crossinline listener:(View)->Unit) {
//    setOnClickListener { listener(it) }
//}
//
//
//
//
//
//
//
//@RequiresApi(Build.VERSION_CODES.O)
//fun test5(context: Context, id:Int, channelId:String) {
//    val builder = Notification.Builder(context, channelId)
//    builder
//        .setContentText("This is a testing ")
//        .setColor(ResourcesCompat.getColor(context.resources, R.color.design_default_color_background, null))
//        .setSmallIcon(0)
//    val notification = builder.build()
//    val notificationManager = ContextCompat.getSystemService(context, NotificationManager::class.java)
//    notificationManager!!.notify(id, notification)
//
//    /*Using expression and lambda function */
//    context.notify(0, ""){
//        it.setContentText("This is a testing ")
//        .setColor(ResourcesCompat.getColor(context.resources, R.color.design_default_color_background, null))
//        .setSmallIcon(0)
//    }
//
//    /*Can be done as below making the Notification.Builder the receiver*/
//    context.notify2(0, ""){
//        this.setContentText("This is a testing ")
//        .setColor(ResourcesCompat.getColor(context.resources, R.color.design_default_color_background, null))
//        .setSmallIcon(0)
//    }
//
//    val textView:TextView = TextView(context).apply {
//        text = "Hello wolrd"
//        textSize = 20f
//        hint = "Hint"
//    }
//
//
//    /*Using our own apply*/
//    val textView2:TextView = TextView(context).apply2 {
//        it.text = "Hello wolrd"
//        it.textSize = 20f
//        it.hint = "Hint"
//    }
//
//
//    /*Using our own apply and make TextView the receiver of the property*/
//    val textView3:TextView = TextView(context).apply3 {
//        text = "Hello wolrd"
//        textSize = 20f
//        hint = "Hint"
//    }
//
//    val string:String = "Hello".apply4 {
//        replace("", "")
//    }
//    val textView4:CharSequence = TextView(context).let {
//        it.text = context.getString(R.string.hello_world)
//        it.textSize = 20f
//        it.hint = "Hint"
//        it.error
//        it.text
//    }
//
//    val textView5:CharSequence = TextView(context).let2 {
//        it.text = "Hello wolrd"
//        it.textSize = 20f
//        it.hint = "Hint"
//        it.error
//        it.text
//    }
//}
//
///*Look like let*/
//fun TextView.let2(body: (TextView) -> CharSequence):CharSequence = body(this)
//
///*the generic type*/
//fun <T, U> T.let3(body: (T) -> U):U = body(this)
//
//fun <T>T.apply4(body:T.() -> Unit):T{
//    body(this)
//    return this
//}
//
//
//
//fun TextView.apply3(body:TextView.() -> Unit):TextView{
//    body(this)
//    return this
//}
//
//fun TextView.apply2(body:(TextView) -> Unit):TextView{
//    body(this)
//    return this
//}
//
///*Using expression and lambda function */
//@RequiresApi(Build.VERSION_CODES.O)
//fun Context.notify(id: Int, channelId: String, body:(Notification.Builder)->Unit ){
//    val builder = Notification.Builder(this, channelId)
//    val notification = builder.build()
//    val notificationManager = ContextCompat.getSystemService(this, NotificationManager::class.java)
//    notificationManager!!.notify(id, notification)
//}
///*Can be done as*/
//@RequiresApi(Build.VERSION_CODES.O)
//fun Context.notify2(id: Int, channelId: String, body:Notification.Builder.()->Unit ){
//    val builder = Notification.Builder(this, channelId)
//    builder.body()
//    val notification = builder.build()
//    val notificationManager = ContextCompat.getSystemService(this, NotificationManager::class.java)
//    notificationManager!!.notify(id, notification)
//}


