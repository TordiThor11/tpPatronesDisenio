package punto3Tp4;

import java.util.HashSet;

public class Paquete implements Seguro {
    public static final double descuento_por_paquete = 0.95;

    private HashSet<Seguro> seguros;

    public Paquete() {
        this.seguros = new HashSet<>();
    }

    public void addSeguro(Seguro seguro) {
        this.seguros.add(seguro);
    }

    @Override
    public double calcularValor() {
        double valorTotal = 0;
        for (Seguro seguro : seguros) {
            valorTotal += seguro.calcularValor() * descuento_por_paquete;
        }
        return valorTotal;
    }

}
