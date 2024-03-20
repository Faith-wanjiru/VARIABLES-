/* 1. Declare a variable
(A) Declare a variable named age and assign it the value 25.
*/
/*fun main(){
    var age: Int = 25

/*(B) Convert the age variable (from question 1) to a String and store it in a new variable named ageAsString.*/
    var ageAsString: String ="25"
     println(ageAsString)


/* 2. Immutable vs. Mutable
Explain the difference between immutable and mutable variables in Kotlin.*/
Immutable variables are variables which cannot be changed while mutable variables
are variables that can be changed

/* 3. String Interpolation
Create a variable named name with your name as its value.
Then, create a new variable greeting that combines the name variable with a greeting message using string interpolation.*/
val name = "Faith"
val  greeting = "Hello"
val sentence = "$greeting my name is $name"
println(sentence)
}*/
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

/*Default Parameter Value
Create a function named greet that takes a name parameter (String) and a greeting parameter (String with a default value of "Hello"). The function should return a formatted greeting message.*/
fun main(){
val greet = "Hello"
}
fun greet(name: String ):String{
    println(name)
}




