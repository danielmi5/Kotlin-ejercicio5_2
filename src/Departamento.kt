class Departamento(val nombre: String, private val listaEmpleados: MutableList<Empleado> = mutableListOf()) {

    init {
        require(nombre.isNotBlank()){"El nombre no puede estar vacío"}
    }
    fun agregarEmpleado(empleado: Empleado){
        listaEmpleados.add(empleado)
    }

    fun calcularSalarioTotal(): String {
        var salarioTotal = 0.0
        for (empleado in listaEmpleados){
            salarioTotal +=empleado.calcularSalario()
        }
        val numDecimales = 2
        return "%.${numDecimales}f".format(salarioTotal)
    }

    fun mostrarInfoEmpleados(){
        for (empleado in listaEmpleados){
            println(empleado)
        }
    }

}