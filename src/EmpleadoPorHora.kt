class EmpleadoPorHora(
    override val nombre: String,
    override val id: String,
    val horasTrabajadasAlMes: Double,
    val tarifaPorHora: Double
): Empleado() {

    override fun calcularSalario(): Double = horasTrabajadasAlMes*tarifaPorHora
}