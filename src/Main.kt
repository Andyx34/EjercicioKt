//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val readOnly: List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    val a = readOnly.filter { it =="lunes"|| it == "Juernes" }
    readOnly.size
    readOnly.get(3)
    readOnly.first()
    readOnly.last()
    println(readOnly)

    var mutableList: MutableList<String> = mutableListOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado")
    println(mutableList)
    mutableList.add("Domingo")
    println(mutableList)

    for(item in mutableList) {
        println(item)
    }

    for((indice,item)in mutableList.withIndex()) {
        println("la posicion $item contiene $item")
    }


}