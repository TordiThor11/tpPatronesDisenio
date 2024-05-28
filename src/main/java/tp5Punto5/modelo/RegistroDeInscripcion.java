package tp5Punto5.modelo;

import java.time.LocalDateTime;

public interface RegistroDeInscripcion {
    void registrar(LocalDateTime fecha, int dniParticipante, String nombreConcurso);
}
