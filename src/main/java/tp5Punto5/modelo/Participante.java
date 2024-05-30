package tp5Punto5.modelo;

public class Participante {
    private String nombre;
    private int dni;
    private int puntaje;

    public Participante(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.puntaje = 0;
    }

    public void sumarPuntosPorInscripcion() {
        this.puntaje = +10;
    }

    public int getPuntaje() {
        return this.puntaje;
    }

    public int getDni() {
        return this.dni;
    }

    public String getNombre() {
        return nombre;
    }
}
