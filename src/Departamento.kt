class Departamento(val nombre: String) {
    private val listaEmpleados: MutableList<Empleado> = mutableListOf()

    init {
        require(nombre.isNotBlank()){"El nombre no puede estar vacío"}
    }
    fun agregarEmpleado(empleado: Empleado){
        listaEmpleados.add(empleado)
    }

    fun calcularSalarioTotal():Double{
        var salarioTotal = 0.0
        for (empleado in listaEmpleados){
            salarioTotal +=empleado.calcularSalario()
        }
        return salarioTotal
    }

    fun mostrarInfoEmpleados(){
        val numEnteros = 4; val numDecimales = 2
        for (empleado in listaEmpleados){
            println("${empleado.nombre} con ID-${"%0${numEnteros}d".format(empleado.id.toInt())} tiene un salario de ${"%.${numDecimales}f".format(empleado.calcularSalario())} € al mes.")
        }
    }

}