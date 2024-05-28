package tp5Punto5.modelo;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Concurso {
    private String nombre;
    private Set<Participante> participantes = new HashSet<Participante>();
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaCierre;
    private RegistroDeInscripcion registroDeInscripcion;
    private MailJakarta mail;

    private ProveedorDeFechas proveedorDeFechas;

    public Concurso(String nombre, LocalDateTime fechaInicio, LocalDateTime fechaCierre, RegistroDeInscripcion registroDeInscripcion, ProveedorDeFechas proveedorDeFechas) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
        this.registroDeInscripcion = registroDeInscripcion;
        this.mail = new MailJakarta("sandbox.smtp.mailtrap.io", "2525", "136bf073b21441", "035c321df45fe7"); //se puede desacoplar como en registro
        this.proveedorDeFechas = proveedorDeFechas;
    }

    public void agregarParticipante(Participante participante) throws Exception {
        if (esFechaValida()) {
            this.participantes.add(participante);
            if (esPrimerDia()) {
                participante.sumarPuntosPorInscripcion();
            }

//            String datosARegistrar = LocalDateTime.now().toString() + "||" + participante.getDni() + "||" + this.nombre + "\n";
            registroDeInscripcion.registrar(proveedorDeFechas.fecha(), participante.getDni(), this.nombre);
            mail.enviarMail("Inscripcion del concurso", "Le comunicamos que la inscripcion al concurso " + nombre + " fue existosa");
        } else {
            throw new Exception("La fecha no es valida");
        }

    }

    private boolean esFechaValida() {
        LocalDateTime fechaActual = LocalDateTime.now();
        return (fechaInicio.isBefore(fechaActual) && fechaCierre.isAfter(fechaActual));
    }

    private boolean esPrimerDia() {
        LocalDateTime fechaActual = LocalDateTime.now();
        return (fechaInicio.getDayOfYear() == fechaActual.getDayOfYear());
    }

    public boolean estaInscriptoElParticipante(Participante participante) {
        return participantes.contains(participante);
    }
}
