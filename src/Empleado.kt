abstract class Empleado(val nombre: String, val id: String) {


    init {
        require(nombre.isNotBlank()){"El nombre no puede estar vacío"}
        require(id.isNotBlank()){"La ID no puede estar vacía"}
        require(id.toIntOrNull() != null && id.length in 1..4) { "ID no válida" }
    }
    abstract fun calcularSalario(): Double

}