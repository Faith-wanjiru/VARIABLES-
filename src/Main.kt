/* 1. Declare a variable
(A) Declare a variable named age and assign it the value 25.
*/
/*fun main(){
    var age: Int = 25

/*(B) Convert the age variable (from question 1) to a String and store it in a new variable named ageAsString.*/
    var ageAsString: String ="25"
     println(ageAsString)
     On question one I have declared a variable named age and assigned it the value 25,
     on question 1b I have converted the age variable to a string and stored it in a new variable named ageAsString
 */
 */


/* 2. Immutable vs. Mutable
Explain the difference between immutable and mutable variables in Kotlin.*/
/*Immutable variables are variables which cannot be changed while mutable variables
are variables that can be changed*/

/* 3. String Interpolation
Create a variable named name with your name as its value.
Then, create a new variable greeting that combines the name variable with a greeting message using string interpolation.
val name = "Faith"
val  greeting = "Hello"
val sentence = "$greeting my name is $name"
println(sentence)
}
In question 3 I have combined the name variable which I have assigned it the value Faith with the greeting message which I have assigned it to Hello
using the ($) sign
 */

/*Function with Parameters
Write a function named sum that takes two parameters a and b (both integers) and returns their sum.
*/
/*fun main(){
  sum(24,76)
}
fun sum(num1: Int,num2:Int): Int {
    val a = 24
    var b = 12
    var sum = a + b
    println(sum)
    return sum
}
On question 4 I have declared a function named sum that is assigned to the parameters a and b and I have returned its sum

/*Default Parameter Value

Create a function named greet that takes a name parameter (String) and a greeting parameter (String with a default value of "Hello"). The function should return a formatted greeting message.*/
fun main(){
val greet = "Hello"
}
fun greet(name: String ):String{
    println(name)
}
In question 5 I have created a function named greet which takes in the name parameter that is a string and the
default value of the greeting parameter is Hello which returns a formatted greeting message.
 */

//Nullable Return Type
Write a function named findLength that takes a String parameter and returns its length. However, make the return type nullable, indicating that it may return null if the input String is null.

fun main(){
 var checkLen = findLength("Akirachix")
}

fun findLength(name:String):Int?{
 var checkLen =name.length
 return checkLen
}
//Function with Varargs
// Write a function named average that takes a variable number of integers as its parameters (varargs) and returns the average of those numbers.
fun main(){

}

fun average (var args number:Int):Double{
 val sum = number()
 return sum.toDouble
}
//the function (varargs) is used to pass in any number of integers as arguments, therefore it will
//return the average as double.

//Function with Extension
//Create a Kotlin extension function named capitalizeEven for the String class. This function should capitalize every second character in the string. For example, if the input is "kotlin", the output should be "kOtLiN".
fun String.capitalizeEven():String{
 cities.forEach{ city
  println(city.capitalize())

 }
}




