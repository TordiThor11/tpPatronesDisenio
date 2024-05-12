package tp4Punto5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemeraTest {
    @Test
    public void calculoRemeraImportada() {
        var remeraImportada = new RemeraImportada(100);
        assertEquals(135, remeraImportada.valorFinal());
    }

    @Test
    public void calculoRemeraNacional() {
        var remeraImportada = new RemeraNacional(100);
        assertEquals(139.725, remeraImportada.valorFinal());
    }


}