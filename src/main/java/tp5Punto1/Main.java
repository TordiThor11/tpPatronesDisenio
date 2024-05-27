package tp5Punto1;

public class Main {
    public static void main(String[] args) {
        var motorEconomico = new MotorEconomico();
        motorEconomico.arrancar();
        motorEconomico.acelerar();
        motorEconomico.apagar();

        var motorElectrico = new MotorElectricoAdapter(new MotorElectrico());
        motorElectrico.arrancar();
        motorElectrico.acelerar();
        motorElectrico.apagar();

    }
}
