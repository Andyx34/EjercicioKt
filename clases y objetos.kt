class SmartDevice{

val name="Android Tv"
val category="Entertainment"
var deviceStatus="online"

fun turnOn(){
    println("smart device is turned on")
}
fun turnOff(){
    println("smart device is turned off")
}
}
fun main(){
    val smartTvDevice=SmartDevice()
    println("Device name is: ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}

