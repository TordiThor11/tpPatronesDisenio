package tp5Punto1;

public class MotorComun implements Motor {
    @Override
    public void arrancar() {
        System.out.println("Arranca");
    }

    @Override
    public void acelerar() {
        System.out.println("acelera");
    }

    @Override
    public void apagar() {
        System.out.println("apaga");
    }
}
