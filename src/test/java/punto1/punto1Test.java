package punto1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class punto1Test {

    LiderDeProyecto liderDeProyecto = new LiderDeProyecto("liderDeProyecto1", 1000);

    @Test
    public void calcularSalarioTotalDeLiderDeProyecto() {
        liderDeProyecto.agregarEmpleado(new Regular("regular1", 700));
        liderDeProyecto.agregarEmpleado(new Regular("regular2", 700));
        assertEquals(liderDeProyecto.salarioTotalEmpresa(), 2400);

    }

    @Test
    public void calcularSalarioTotalDeMandoMedio() {
        liderDeProyecto.agregarEmpleado(new Regular("regular1", 700));
        liderDeProyecto.agregarEmpleado(new Regular("regular2", 700));

        var mandoMedio = new MandoMedio("mandoMedio1", 1200);
        mandoMedio.agregarEmpleado(liderDeProyecto);
        mandoMedio.agregarEmpleado(new LiderDeProyecto("liderDeProyexto2", 1000));

        assertEquals(mandoMedio.salarioTotalEmpresa(), 4600);
    }
}