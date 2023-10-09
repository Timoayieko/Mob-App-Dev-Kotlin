import java.util.*

/*
fun main(args: Array<String>){
    println("Hello world")
}*/
/*
fun main(args: Array<String>){
    //println("Hello, ${args[0]}")
    val temperature = 10
    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
    println(message)
    */
/*val isHot = if (temperature > 50) true else false
    println(isHot)*//*


}*/
/*

fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        temperature > 30 -> true
        dirty > 30 -> true
        day == "Sunday" ->  true
        else -> false
    }
}


//Step 3
    fun fishFood (day : String) : String {
        return when (day) {
            "Monday" -> "flakes"
            "Wednesday" -> "redworms"
            "Thursday" -> "granules"
            "Friday" -> "mosquitoes"
            "Sunday" -> "plankton"
            else -> "nothing"
        }
    }

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println ("Today is $day and the fish eat $food")
}

fun randomDay(): String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}
*/
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)


}


fun main(args: Array<String>) {
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilter))

    fun increaseDirty( start: Int ) = start + 1

    println(updateDirty(15, ::increaseDirty))


    var dirtyLevel = 19
    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
    println(dirtyLevel)
    /*var dirtyLevel = 20
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }*/
    //val waterFilter = { dirty : Int -> dirty / 2}
    //println(waterFilter(dirtyLevel))
    /*val mysports = listOf("basketball", "fishing", "running")
    val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
    val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
    val mylist = listOf(mysports, myplayers, mycities)     // list of lists
    println("-----")
    println("Flat: ${mylist.flatten()}")*/
 /*   val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")


    val eager = decorations.filter { it [0] == 'p' }
    println("eager: $eager")

    // lazy, will wait until asked to evaluate
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")

    // force evaluation of the lazy list
    val newList = filtered.toList()
    println("new list: $newList")

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }
    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")

    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
        println("access: $it")
        it
    }
    println("-----")
    println("filtered: ${lazyMap2.toList()}")
*/

    //feedTheFish()
    /*swim()   // uses default speed
    swim("slow")   // positional argument
    swim(speed="turtle-like")*/
}
fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun swim(speed: String = "fast") {
    println("swimming $speed")
}