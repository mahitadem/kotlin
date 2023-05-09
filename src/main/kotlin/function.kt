import kotlin.math.exp
import kotlin.math.sqrt

fun esther(){
    println("This is a customized user defined function")
}
fun kiriaini(){
    val num1=6
    val num2=8
    println("This is a girls school")
    println("The sum of $num1 and $num2 is ${num1+num2}")
}
fun main(args: Array<String>) {
    esther()
    kiriaini()
    mine("Esther",  90)
    him("Trevnick",  "Mahita",  8)
}
fun him(fname: String,lname:String,darasa:Int){
    println("He is $fname $lname and is in class $darasa")

}

fun mine(fname:String,age:Int){
    println("My first name is $fname and am $age years old")
}
