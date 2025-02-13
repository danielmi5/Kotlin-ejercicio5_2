abstract class Empleado(private val nombre: String,private val id: String) {


    init {
        require(nombre.isNotBlank()){"El nombre no puede estar vacío"}
        require(id.isNotBlank()){"La ID no puede estar vacía"}
        require(id.toIntOrNull() != null && id.length in 1..4) { "ID no válida" }
    }
    abstract fun calcularSalario(): Double

    override fun toString(): String {
        val numEnteros = 4; val numDecimales = 2
        return "${this.nombre} con ID-${"%0${numEnteros}d".format(this.id.toInt())} tiene un salario de ${"%.${numDecimales}f".format(this.calcularSalario())} € al mes."
    }
}