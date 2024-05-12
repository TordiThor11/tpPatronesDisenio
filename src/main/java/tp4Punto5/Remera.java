package tp4Punto5;

public abstract class Remera {

    protected double valor;

    public Remera(double valor) {
        this.valor = valor;
    }


    public double valorFinal() {
        double precioFinal = valor;
        precioFinal = precioFinal * (1 + (recargosExternos() / 100));//Agrega los impuestos al valor del producto
        precioFinal = precioFinal * (1 + (agregadoLocal() / 100));//Agrega los impuestos locales al resultado de lo anterior
        return precioFinal;
    }

    abstract double recargosExternos();//Impuestos,recargos o gastos varios a agregar expresado en %. O sea, si tiene 15% retorna 15

    abstract double agregadoLocal();
}
