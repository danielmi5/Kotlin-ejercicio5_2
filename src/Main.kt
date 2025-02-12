fun main(){
    val departamento = Departamento("Oficina")
    departamento.agregarEmpleado(EmpleadoFijo("Felipe", "01", 100.0, 45))
    departamento.agregarEmpleado(EmpleadoFijo("Luis", "34", 2100.0, 2))
    departamento.agregarEmpleado(EmpleadoFijo("No", "1201", 10000.0, 1))

    departamento.mostrarInfoEmpleados()
}