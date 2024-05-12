package tp4Punto5;

public class RemeraNacional extends Remera {
    public static final double transporte_recargo = 1.5; // 1.5%
    public static final double bonificacion_recargo = 20; // 20%
    public static final double agregado_local_nacional = 15; //15%

    public RemeraNacional(double valor) {
        super(valor);
    }

    @Override
    double recargosExternos() {
        return transporte_recargo + bonificacion_recargo;
    }

    @Override
    double agregadoLocal() {
        return agregado_local_nacional;
    }
}
