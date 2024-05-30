package tp5Punto5.modelo;


public class DecoradorConcurso implements Inscribible {
    private Inscribible inscribible;
    private Mail mailJakarta;

    public DecoradorConcurso(Inscribible inscribible, MailJakarta mailJakarta) {
        this.inscribible = inscribible;
        this.mailJakarta = mailJakarta;
    }

    @Override
    public void inscribir(Participante participante) throws Exception {
        inscribible.inscribir(participante);
        mailJakarta.enviarMail("Inscripcion del concurso", "Le comunicamos que la inscripcion al concurso " + participante.getNombre() + " fue existosa");

    }
}
