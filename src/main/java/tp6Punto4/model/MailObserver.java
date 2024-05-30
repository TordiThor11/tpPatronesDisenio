package tp6Punto4.model;

public class MailObserver implements Observer {
    private EnvioDeMail envioDeMail;

    public MailObserver(EnvioDeMail envioDeMail) {
        this.envioDeMail = envioDeMail;
    }

    @Override
    public void actualizar(Participante participante) {
        this.envioDeMail.enviarMail(participante.getMail(), "Fue agregado al concurso", "Felicitaciones " + participante.getNombre() + ", fue agregado al concurso!");
    }
}
