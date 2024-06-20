//part1
fun main() {
  val treatFunction = trickOrTreat(false)
  val trickFunction=trickOrTreat(true)
    treatFunction()
    trickFunction()
}
fun trickOrTreat(isTrick: Boolean): ()->Unit{
    if(isTrick){
        return trick
    }
    else{
        return treat
    }
}
val trick = {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}

//part2
fun main() {
    val coins: (Int)->String = {quantity-> 
        "$quantity quarters"
    }
    val cupcake: (Int)->String ={
    "Have a cupcake!"
    }
    
  val treatFunction = trickOrTreat(false, coins)
  val trickFunction=trickOrTreat(true, cupcake)
    treatFunction()
    trickFunction()
}
fun trickOrTreat(isTrick: Boolean, extraTreat:(Int)->String): ()->Unit{
    if(isTrick){
        return trick
    }
    else{
        println(extraTreat(5))
        return treat
    }
}
val trick = {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}

//part3

fun main() {
    val coins: (Int)->String = {quantity-> 
        "$quantity quarters"
    }

    
  val treatFunction = trickOrTreat(false, coins)
  val trickFunction=trickOrTreat(true, null)
    treatFunction()
    trickFunction()
}
fun trickOrTreat(isTrick: Boolean, extraTreat:((Int)->String)?): ()->Unit{
    if(isTrick){
        return trick
    }
    else{
        if(extraTreat != null){
        println(extraTreat(5))
        }
        return treat
    }
}
val trick = {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}

//part4
fun main() {
    val coins: (Int)->String = { 
        "$it quarters"
    }

    
  val treatFunction = trickOrTreat(false, coins)
  val trickFunction=trickOrTreat(true, null)
    treatFunction()
    trickFunction()
}
fun trickOrTreat(isTrick: Boolean, extraTreat:((Int)->String)?): ()->Unit{
    if(isTrick){
        return trick
    }
    else{
        if(extraTreat != null){
        println(extraTreat(5))
        }
        return treat
    }
}
val trick = {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}

//part5

fun main() {
  
  val treatFunction = trickOrTreat(false, {"$it quarters"})
  val trickFunction=trickOrTreat(true, null)
    treatFunction()
    trickFunction()
}
fun trickOrTreat(isTrick: Boolean, extraTreat:((Int)->String)?): ()->Unit{
    if(isTrick){
        return trick
    }
    else{
        if(extraTreat != null){
        println(extraTreat(5))
        }
        return treat
    }
}
val trick = {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}

//final

fun main() {
  
  val treatFunction = trickOrTreat(false) {"$it quarters"}
  val trickFunction=trickOrTreat(true, null)
    repeat(4){
         treatFunction()
    }
     trickFunction()
}
fun trickOrTreat(isTrick: Boolean, extraTreat:((Int)->String)?): ()->Unit{
    if(isTrick){
        return trick
    }
    else{
        if(extraTreat != null){
        println(extraTreat(5))
        }
        return treat
    }
}
val trick = {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}