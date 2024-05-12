package punto1Tp4;

public class Main {
    public static void main(String[] args) {
        var liderDeProyecto = new LiderDeProyecto("liderDeProyecto1", 1000);
        liderDeProyecto.agregarEmpleado(new Regular("regular1", 700));
        liderDeProyecto.agregarEmpleado(new Regular("regular2", 700));
//        System.out.println(liderDeProyecto.toString());

        var mandoMedio = new MandoMedio("mandoMedio1", 1200);
        mandoMedio.agregarEmpleado(liderDeProyecto);
        mandoMedio.agregarEmpleado(new LiderDeProyecto("liderDeProyexto2", 1000));
//        System.out.println(mandoMedio.toString());

        var gerente = new Gerente("gerente1", 1500);
        gerente.agregarEmpleado(mandoMedio);
        gerente.agregarEmpleado(new MandoMedio("mandoMedio2", 1200));
        System.out.println(gerente.toString());
    }
}
