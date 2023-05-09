class Students(val name:String,var gender:String,val age:Int){

}

fun main(args: Array<String>) {
//    This is an object
    val myobj = Students("Esther",  "female",  28)
    println("Student's name is ${myobj.name} and is a ${myobj.gender} of ${myobj.age}")
    var obj=Watu("Joe","Male",17 , "Muranga")
    var obj2=Watu("Hannah","female",19,"Mombasa")
    println("His/Her name is ${obj.name} and is a ${obj.gender} aged ${obj.age} living in ${obj.location}")
    println("His/Her name is ${obj2.name} and is a ${obj2.gender} aged ${obj2.age} living in ${obj2.location}")

}
class Watu(val name:String,val gender: String,val age: Int,val location:String){

}
