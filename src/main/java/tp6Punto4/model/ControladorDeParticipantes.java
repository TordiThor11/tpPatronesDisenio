package tp6Punto4.model;

import java.util.List;

public class ControladorDeParticipantes extends Observable {

    /*La persistencia deberia seguir estando por inyeccion,
     por lo general el patron observer se usa para otro tipo de cosas*/


    public ControladorDeParticipantes(List<Observer> observadores) {
        super(observadores);
    }

    public void registrarParticipante(Participante participante) throws Exception {
        super.notificar(participante);
    }
}
