//part1

fun main() {
   var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor)
    
    favoriteActor=null
    println(favoriteActor)
   
}

//part2
fun main() {
   var number: Int? =10
    println(number)
    
    number=null
    println(number)
}
// parte3

fun main() {
   var favoriteActor: String = "Sandra Oh"
    println(favoriteActor.length)
}

fun main() {
   var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor?.length)
}

fun main() {
   var favoriteActor: String? = null
    println(favoriteActor?.length)
}

//part4
fun main() {
   var favoriteActor: String? = null
    if(favoriteActor != null){
    println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
    }
    else{
        println("You didn't input a name.")
    }
}

fun main() {
   val favoriteActor: String? = "Sandra Oh"
    
    val lengthOfName = if(favoriteActor != null){
        favoriteActor.length
    }
    else{
       0
    }
    println("The number of characters in your favorite actor's name is $lengthOfName.")

}
fun main() {
   val favoriteActor: String? = "Sandra Oh"
    
    val lengthOfName = favoriteActor?.length?:0
  
    println("The number of characters in your favorite actor's name is $lengthOfName.")

}