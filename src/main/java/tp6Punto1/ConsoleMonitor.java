package tp6Punto1;

public class ConsoleMonitor implements Observer {
    @Override
    public void actualizar(String info) {
        System.out.println("En consola: " + info);
    }
}
