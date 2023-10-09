/*fun main(args: Array<String>) {
*//*   println("What is your name?")

   val name = readln()
   println("Hello, $name")*//*
   print("Enter a number: ")

   val stringInput = readLine()!!

   //converts string to integer
   var integer:Int = stringInput.toInt()
   println("You entered: $integer")
}*/
//Task five
/*
fun main(args: Array<String>){
   val first: Int = 10
   val second: Int = 20

   val sum = first + second
   println("The sum is: $sum")
}
*/

/*
//Task 7

fun main(args: Array<String>){
   val ch = 'z'

   when(ch){
      'a','e','i','o','u' -> println("$ch is vowel")
      else -> println("$ch is consonant")
   }
}
*/
//Task 8
/*
fun main(args: Array<String>){
   val year = 1900
   var leap = false

   if (year % 4 == 0){
      if (year % 100 == 0){

         leap = year % 400 == 0

      }else
         leap = true
   }else
      leap = false
   println(if (leap)"$year is a leap year." else "$year is not a leap year.")
}*/

