package tp4Punto3;

public class Vida implements Seguro {
    private double valor;

    public Vida(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularValor() {
        return valor;
    }
}
