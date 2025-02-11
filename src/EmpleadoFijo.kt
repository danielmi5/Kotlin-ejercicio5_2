class EmpleadoFijo(
    override val nombre: String,
    override val id: String,
    val salarioFijo: Double,
    val numPagas: Int
): Empleado() {


    override fun calcularSalario(): Double = salarioFijo*numPagas

}