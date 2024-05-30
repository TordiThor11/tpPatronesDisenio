package tp6Punto4.model;

import java.util.List;

public class ControladorDeParticipantes extends Observable {

    public ControladorDeParticipantes(List<Observer> observadores) {
        super(observadores);
    }

    public void registrarParticipante(Participante participante) throws Exception {
        super.notificar(participante);
    }
}
