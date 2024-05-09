package punto1;

import java.util.HashSet;

public class Director extends Regular {
    private HashSet<Gerente> empleados;

    public Director(String nombre, int salario) {
        super(nombre, salario);
        empleados = new HashSet<Gerente>();
    }

    public Director(String nombre, int salario, HashSet<Gerente> empleados) {
        super(nombre, salario);
        this.empleados = empleados;
    }


    public void agregarEmpleado(Gerente empleado) {
        this.empleados.add(empleado);
    }

    public HashSet<Gerente> getEmpleados() {
        return this.empleados;
    }

    @Override
    int salarioTotalEmpresa() {
        int salarioTotal = salario;
        for (Gerente empleado : empleados) {
            salarioTotal += empleado.salarioTotalEmpresa();
        }
        return salarioTotal;
    }
}
