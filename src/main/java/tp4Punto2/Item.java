package tp4Punto2;

public abstract class Item {
    protected int tiempoRequerido;

    public Item(int tiempoRequerido) {
        this.tiempoRequerido = tiempoRequerido;
    }

    public abstract int tiempoTotalRequerido();
}
