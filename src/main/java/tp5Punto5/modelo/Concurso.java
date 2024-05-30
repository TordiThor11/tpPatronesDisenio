package tp5Punto5.modelo;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Concurso implements Inscribible {
    private String nombre;
    private Set<Participante> participantes = new HashSet<Participante>();
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaCierre;
    private RegistroDeInscripcion registroDeInscripcion;

    private ProveedorDeFechas proveedorDeFechas;

    public Concurso(String nombre, LocalDateTime fechaInicio, LocalDateTime fechaCierre, RegistroDeInscripcion registroDeInscripcion, ProveedorDeFechas proveedorDeFechas) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
        this.registroDeInscripcion = registroDeInscripcion;
        this.proveedorDeFechas = proveedorDeFechas;
    }

    @Override
    public void inscribir(Participante participante) throws Exception {
        if (esFechaValida()) {
            this.participantes.add(participante);
            if (esPrimerDia()) {
                participante.sumarPuntosPorInscripcion();
            }
            registroDeInscripcion.registrar(proveedorDeFechas.fecha(), participante.getDni(), this.nombre);
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
