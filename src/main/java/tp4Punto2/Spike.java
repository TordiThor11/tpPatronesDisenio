package tp4Punto2;

public class Spike extends Item {

    public Spike(int tiempoRequerido) {
        super(tiempoRequerido);
    }

    @Override
    public int tiempoTotalRequerido() {
        return this.tiempoRequerido;
    }
}
