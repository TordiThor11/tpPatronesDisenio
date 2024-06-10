package tp8Punto1;

public class ColectivosSur implements Envio {
    public static final String capital_federal = "caba";
    public static final String gran_bsas = "gran_buenos_aires";

    @Override
    public double valorDeEnvio(String destino, double peso, int distancia) {
        double agregadoPorDestino = 3000;//Numeros magicos
        double agregadoPorPeso = 0;
        if (destino.equals(capital_federal)) {
            agregadoPorDestino = 1000;//Numeros magicos
        }
        if (destino.equals(gran_bsas)) {
            agregadoPorDestino = 1500;//Numeros magicos
        }
        if (peso > 5) { //numero magico
            agregadoPorPeso = 500;//numero magico
        }
        if (peso > 30) {
            agregadoPorPeso = 2000;//numero magico
        }

        return agregadoPorDestino + agregadoPorPeso;
    }
}
