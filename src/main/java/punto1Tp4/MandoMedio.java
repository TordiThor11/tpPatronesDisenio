package punto1Tp4;

import java.util.HashSet;

public class MandoMedio extends Empleado {
    private HashSet<Empleado> empleados;

    public MandoMedio(String nombre, int salario) {
        super(nombre, salario);
        empleados = new HashSet<Empleado>();
    }

    void agregarEmpleado(Empleado Empleado) {
        this.empleados.add(Empleado);
    }

    @Override
    public String toString() {
        var toString = super.toString() + System.lineSeparator() + " // Los Lideres son:";
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
