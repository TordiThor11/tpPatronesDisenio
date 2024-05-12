package tp4Punto5;

public class RemeraImportada extends Remera {
    public static final double impuesto_recargo = 3; // 3%
    public static final double impuesto_aduanero = 5; // 5%
    public static final double agregado_local_importado = 25; //25%

    public RemeraImportada(double valor) {
        super(valor);
    }

    @Override
    double recargosExternos() {
        return impuesto_aduanero + impuesto_recargo;
    }

    @Override
    double agregadoLocal() {
        return agregado_local_importado;
    }
}
