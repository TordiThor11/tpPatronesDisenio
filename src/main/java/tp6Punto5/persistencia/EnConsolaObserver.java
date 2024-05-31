package tp6Punto5.persistencia;

import tp6Punto5.modelo.Observer;

public class EnConsolaObserver implements Observer {

    public static final double monto_superar = 300;

    @Override
    public void actualizar(double monto) {
        if (monto <= monto_superar) {
            System.out.println("El monto es: " + monto);
        } else {
            System.out.println("El monto exede los " + monto_superar + ", con un total de = " + monto);
        }

    }
}
