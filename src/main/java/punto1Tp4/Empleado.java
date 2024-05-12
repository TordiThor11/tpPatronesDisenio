package punto1Tp4;

public abstract class Empleado {
    protected String nombre;
    protected int salario;

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    abstract int salarioTotalEmpresa();
}
