package tp4Punto1;

import java.util.HashSet;

public class Gerente extends Empleado implements Responsable {
    private HashSet<Empleado> empleados;

    public Gerente(String nombre, int salario) {
        super(nombre, salario);
        empleados = new HashSet<Empleado>();
    }

    public void agregarEmpleado(Empleado mandoMedio) {
        this.empleados.add(mandoMedio);
    }

    @Override
    public String toString() {
        var toString = super.toString() + System.lineSeparator() + " // Los Mandos son:";
        toString += this.empleados.toString();
        return toString;
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
