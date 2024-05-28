package tp5Punto5.modelo;

import sistemaConcursos.persistencia.EnSQLRegistroDeInscripcion;
import sistemaConcursos.persistencia.RealProveedorDeFechas;

import java.time.LocalDateTime;

public class main {
    public static void main(String[] args) {
        Concurso miConcurso = new Concurso("miConcurso", LocalDateTime.now().minusDays(2), LocalDateTime.now().plusDays(2), new EnSQLRegistroDeInscripcion(), new RealProveedorDeFechas());
        try {
            miConcurso.agregarParticipante(new Participante("Juan", 41544891));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        
        /*MailJakarta mail = new MailJakarta("sandbox.smtp.mailtrap.io", "2525", "136bf073b21441", "035c321df45fe7");
        mail.enviarMail("Este es el tema", "este es el texto del mensaje");*/
    }
}
