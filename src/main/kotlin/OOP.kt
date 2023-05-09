class Sturborn{
//    data member
    private var nambari:Int=5
//    member function
    fun calc():Int{
        return nambari *nambari

    }
}

fun main(args: Array<String>) {
//    This is an object
    val myobject=Sturborn()
    println(myobject.calc())
    val obj=Num()
    println(obj.say())

}
class Num{
    var value:Int=19
    fun say():Int{
        return value/value
    }
}