package tp6Punto1;

import java.util.List;

public class Medidor extends Observable {
    private String temperatura;
    private ClimaOnline clima;

    public Medidor(ClimaOnline clima, List<Observer> observadores) {
        super(observadores);
        this.clima = clima;
    }

    public String leerTemperatura() {
//leo la temperatura del servicio web
        this.temperatura = this.clima.temperatura();
        return this.temperatura;
    }
}