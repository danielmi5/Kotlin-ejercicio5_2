class EmpleadoFijo(
    nombre: String,
    id: String,
    private val salarioFijo: Double,
    private val numPagas: Int
): Empleado(nombre, id) {

    init {
        require(salarioFijo > 0){"salarioFijo debe ser positiva (>0)"}
        require(numPagas > 0){"numPagas debe ser positiva (>0)"}
    }
    override fun calcularSalario(): Double = (salarioFijo*numPagas)/12

}