package tp4Punto2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Punto2Test {
    @Test
    public void calcularTiempoDeHistoria() {
        var historia = new Historia(15);
        historia.addItem(new Tarea(20));
        historia.addItem(new Tarea(5));
        assertEquals(historia.tiempoTotalRequerido(), 40);
    }

    @Test
    public void calcularTiempoDeProyecto() {
        var historia = new Historia(15);
        historia.addItem(new Tarea(20));
        historia.addItem(new Tarea(5));

        var proyecto = new Proyecto();
        proyecto.addItem(new Spike(11));
        proyecto.addItem(historia);
        assertEquals(proyecto.tiempoTotalRequerido(), 51);
    }
}