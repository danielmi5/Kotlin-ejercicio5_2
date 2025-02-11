class Departamento(val nombre: String) {
    private val listaEmpleados: MutableList<Empleado> = mutableListOf()

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

}