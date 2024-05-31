package tp6Punto5.persistencia;

import tp6Punto5.modelo.Observer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class EnDiscoRegistroDePedido implements Observer {
    @Override
    public void actualizar(double monto) {

        String datosARegistrar = LocalDateTime.now().toString() + "||" + monto + "\n";
        try {
            Files.write(Paths.get("src/main/resources/pedidos.txt"), datosARegistrar.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException("Error en la entrada/salida de datos", e);
        }
    }
}
