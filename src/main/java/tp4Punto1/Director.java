package tp4Punto1;

import java.util.HashSet;

public class Director extends Regular {
    private HashSet<Empleado> empleados;

    public Director(String nombre, int salario) {
        super(nombre, salario);
        empleados = new HashSet<Empleado>();
    }

    public Director(String nombre, int salario, HashSet<Empleado> empleados) {
        super(nombre, salario);
        this.empleados = empleados;
    }


    public void agregarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

    public HashSet<Empleado> getEmpleados() {
        return this.empleados;
    }

    @Override
    int salarioTotalEmpresa() {
        int salarioTotal = salario;
        for (Empleado empleado : empleados) {
            salarioTotal += empleado.salarioTotalEmpresa();
        }
        return salarioTotal;
    }
}
