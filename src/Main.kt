import java.awt.SystemColor.text
import kotlin.random.Random
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
//    val i = 10
//    val s = "Kotlin"
//    println("i = $i") // “i = 10”
//    println("Length of $s is ${s.length}")

//    val n1 = Person(name = "Kiw" , Id = 1)
//    print(n1.name)

//    print(sum( a = 1 , b = 2))

//    var x = 10
//    when (x) {
//        1 -> print("x /= 1")
//        2 -> print("x /= 2")
//        else -> {
//            print("x is neither 1 nor 2")
//        }
//    }


//    val items = listOf("apple", "banana", "kiwifruit")
//    for (item in items){
//        println(item)
//    }

//    val notNullText: String = "Definitely not null"
//    val nullableText1: String? = "Might be null"
//    val nullableText2: String? = null
//    funny(notNullText)
//    funny(nullableText1)
//    funny(nullableText2)

    var x: Int = Random.nextInt(0,100)
    println(x)
    if((x%3==0) and (x%5==0)){
        println("fizz, buzz")
    }else if((x%3)==0){
        println("fizz")
    }else if((x%5)==0){
        println("buzz")
    }else{
        println("error")
    }
}

fun funny(text: String?) {
    if (text != null)
        println(text)
    else
        println("Nothing to print :(")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

data class Person(var name:String, var Id:Int)