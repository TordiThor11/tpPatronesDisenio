package tp6Punto1.main;

import tp6Punto1.modelo.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Observer> observadores = new ArrayList<>();
        observadores.add(new ConsoleMonitor());
        observadores.add(new DiskMonitor());
        var medidor = new Medidor(new WeatherChannelService(), observadores);
        medidor.leerTemperatura();
    }
}
