package punto1;

import java.util.HashSet;

public class MandoMedio extends Empleado {
    private HashSet<LiderDeProyecto> empleados;

    public MandoMedio(String nombre, int salario) {
        super(nombre, salario);
        empleados = new HashSet<LiderDeProyecto>();
    }

    void agregarEmpleado(LiderDeProyecto liderDeProyecto) {
        this.empleados.add(liderDeProyecto);
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
        for (LiderDeProyecto empleado : empleados) {
            salarioTotal += empleado.salarioTotalEmpresa();
        }
        return salarioTotal;
    }
}
