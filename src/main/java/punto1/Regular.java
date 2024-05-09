package punto1;

public class Regular extends Empleado {

    public Regular(String nombre, int salario) {
        super(nombre, salario);
    }

    @Override
    int salarioTotalEmpresa() {
        return salario;
    }
}
