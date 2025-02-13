import Utilidades.Companion.decimales

class EmpleadoFijo(
    nombre: String,
    id: String,
    salarioFijo: Double,
    private val numPagas: Int
): Empleado(nombre, id) {
    private val salarioFijo = salarioFijo
        get() = field.decimales(2)
    init {
        require(salarioFijo > 0){"salarioFijo debe ser positiva (>0)"}
        require(numPagas > 0){"numPagas debe ser positiva (>0)"}
    }
    override fun calcularSalario(): Double = (salarioFijo*numPagas)/12

}