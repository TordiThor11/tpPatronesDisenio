package punto1;

import java.util.HashSet;

public class Gerente extends Empleado {
    private HashSet<MandoMedio> empleados;

    public Gerente(String nombre, int salario) {
        super(nombre, salario);
        empleados = new HashSet<MandoMedio>();
    }

    void agregarEmpleado(MandoMedio mandoMedio) {
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
        for (MandoMedio empleado : empleados) {
            salarioTotal += empleado.salarioTotalEmpresa();
        }
        return salarioTotal;
    }
}
