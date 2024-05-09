package punto1;

import java.util.HashSet;

public class LiderDeProyecto extends Empleado {
    private HashSet<Regular> empleados;

    public LiderDeProyecto(String nombre, int salario) {
        super(nombre, salario);
        this.empleados = new HashSet<Regular>();
    }

    public void agregarEmpleado(Regular regular) {
        this.empleados.add(regular);
    }

    @Override
    public String toString() {
        var toString = super.toString() + System.lineSeparator() + " // Los regulares son:";
        toString += this.empleados.toString();
        return toString;
    }

    @Override
    int salarioTotalEmpresa() {
        int salarioTotal = salario;
        for (Regular empleado : empleados) {
            salarioTotal += empleado.salarioTotalEmpresa();
        }
        return salarioTotal;
    }
}