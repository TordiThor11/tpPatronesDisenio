package tp5Punto5.persistencia;

import tp5Punto5.modelo.ProveedorDeFechas;

import java.time.LocalDateTime;

public class RealProveedorDeFechas implements ProveedorDeFechas {
    @Override
    public LocalDateTime fecha() {
        return LocalDateTime.now();
    }
}
