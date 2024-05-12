package punto2Tp4;

public class Spike extends Item {

    public Spike(int tiempoRequerido) {
        super(tiempoRequerido);
    }

    @Override
    public int tiempoTotalRequerido() {
        return this.tiempoRequerido;
    }
}
