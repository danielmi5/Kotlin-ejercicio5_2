fun String.aniadirCeros(numEnteros: Int): String{
    var nuevoValor = this
    if (this.length == numEnteros) return this
    for(i in 1..numEnteros-this.length){
        nuevoValor = "0$nuevoValor"
    }
    return nuevoValor
}


fun main(){
    val departamento = Departamento("Oficina")
    departamento.agregarEmpleado(EmpleadoFijo("Felipe", "1", 100.0, 45))
    val hola = 2.6466
    println("%2.".format(hola))
}