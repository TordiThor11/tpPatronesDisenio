package tp5Punto5.persistencia;

import tp5Punto5.modelo.RegistroDeInscripcion;

import java.time.LocalDateTime;

public class FakePersistencia implements RegistroDeInscripcion {
    //No se usa asi el fake, pero tira error con la persistencia y quiero practicar patrones
    @Override
    public void registrar(LocalDateTime fecha, int dniParticipante, String nombreConcurso) {
        System.out.println("Se grabo en la persistencia");
    }
}
