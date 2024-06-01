package tp6Punto1.modelo;

import java.util.Scanner;

public class ConsoleMonitor implements Observer {
    @Override
    public void actualizar(String info) {
        int valor = 0;
        Scanner scanner = new Scanner(info);
        if (scanner.hasNextInt()) {
            valor = scanner.nextInt();

        }
        scanner.close();
        if (valor > 45) {
            System.out.println("Temp: " + info + " -> Hace calor");
        } else {
            System.out.println("Temp: " + info + " -> Hace frio");
        }

    }
}
