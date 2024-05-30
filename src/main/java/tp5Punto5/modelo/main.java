package tp5Punto5.modelo;

import tp5Punto5.persistencia.FakePersistencia;
import tp5Punto5.persistencia.RealProveedorDeFechas;

import java.time.LocalDateTime;

public class main {
    public static void main(String[] args) {
        Concurso miConcurso = new Concurso("miConcurso", LocalDateTime.now().minusDays(2), LocalDateTime.now().plusDays(2), new FakePersistencia(), new RealProveedorDeFechas());
        DecoradorConcurso decoradorConcurso = new DecoradorConcurso(miConcurso, new MailJakarta("sandbox.smtp.mailtrap.io", "2525", "136bf073b21441", "035c321df45fe7"));
        try {
            decoradorConcurso.inscribir(new Participante("Juan", 41544891));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
