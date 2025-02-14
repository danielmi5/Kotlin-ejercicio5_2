fun main(){
    val departamento = Departamento("Oficina")
    departamento.agregarEmpleado(EmpleadoFijo("Felipe", "01", 100.0, 45))
    departamento.agregarEmpleado(EmpleadoPorHora("Luis", "34", 2100.0, 2.0))
    departamento.agregarEmpleado(EmpleadoFijo("No", "1201", 10000.45, 1))
    departamento.agregarEmpleado(EmpleadoPorHora("Roberto", "751", 234.0, 15.2))

    departamento.mostrarInfoEmpleados()
    println("\nSalario total del departamento ${departamento.nombre}: ${departamento.calcularSalarioTotal()}€.")

}
