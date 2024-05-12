package tp4Punto2;

public class Tarea extends Item {
    public Tarea(int tiempoRequerido) {
        super(tiempoRequerido);
    }

    @Override
    public int tiempoTotalRequerido() {
        return this.tiempoRequerido;
    }
}
