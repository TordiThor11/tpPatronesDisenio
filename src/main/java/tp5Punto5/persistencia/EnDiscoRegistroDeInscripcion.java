package tp5Punto5.persistencia;

import org.example.sistemacConcursos.RegistroDeInscripcion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public class EnDiscoRegistroDeInscripcion implements RegistroDeInscripcion {
    @Override
    public void registrar(LocalDateTime fecha, int dniParticipante, String nombreConcurso) {
        String datosARegistrar = fecha.toString() + "||" + dniParticipante + "||" + nombreConcurso + "\n";
        try {
            Files.write(Paths.get("C:\\Users\\Valentin\\Desktop\\archivoTextoPoo.txt"), datosARegistrar.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException("Error en la entrada/salida de datos", e);
        }
    }
}
