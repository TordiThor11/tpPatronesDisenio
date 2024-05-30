package tp6Punto4.main;

import tp6Punto4.model.Observer;
import tp6Punto4.model.Participante;

public class FakeRegistro implements Observer {
    //No se usan de esta forma los fakes, pero me tira error en la BD y no puedo probar el resto del codigo
    @Override
    public void actualizar(Participante participante) {
        System.out.println("Se registro el participante: " + participante.getNombre());
    }

}
