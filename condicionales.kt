//Semaforo part1
fun main() {
    val trafficLightColor ="Black"
    val message =
    if (trafficLightColor == "Red") "Stop"
    else if(trafficLightColor == "Yellow")"Slow"
    else if(trafficLightColor == "Green")"Go"
    else "Invalid traffic-light color"
    
    println(message)
}
//Semaforo part2
fun main() {
    val trafficLightColor ="Amber"
   when(trafficLightColor){
       "Red"->println("Stop")
       "Yellow","Amber"->println("Slow")
       "Green"->println("Go")
       else ->println("Invalid traffic-light color")
   }
}

   //Semaforo part3
   fun main() {
    val trafficLightColor ="Amber"
   val message = when(trafficLightColor){
       "Red"->"Stop"
       "Yellow","Amber"->"procced with caution"
       "Green"->"Go"
       else ->"Invalid traffic-light color"
   }
   println(message)
   
}
//numeros
fun main() {
   val x: Any = 20
    
    when(x){
        2, 3,5,7->println("x es un número primo entre 1 y 10.")
        in 1..10->println("x es un número entre 1 y 10, pero no es un número primo.")
        is Int->println("x es un número entero, pero no entre 1 y 10")
        else->println("x no es un número entero")
        
    }
}

