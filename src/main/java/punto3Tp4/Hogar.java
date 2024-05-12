package punto3Tp4;


public class Hogar implements Seguro {
    private double valor;

    public Hogar(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularValor() {
        return valor;
    }

}
