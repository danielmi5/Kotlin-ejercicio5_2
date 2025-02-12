class EmpleadoPorHora(
    nombre: String,
    id: String,
    private val horasTrabajadasAlMes: Double,
    private val tarifaPorHora: Double
): Empleado(nombre, id) {
    init {
        require(horasTrabajadasAlMes > 0){"horasTrabajadasAlMes debe ser positiva (>0)"}
        require(tarifaPorHora > 0){"tarifaPorHora debe ser positiva (>0)"}
    }
    override fun calcularSalario(): Double = horasTrabajadasAlMes*tarifaPorHora


}