package tp8Punto1;

public class CorreoArgentino implements Envio {
    public static final String capital_federal = "caba";
    public static final String gran_bsas = "gran_buenos_aires";

    @Override
    public double valorDeEnvio(String destino, double peso, int distancia) {
        double agregadoPorDestino = 800;//Numeros magicos
        if (destino.equals(capital_federal)) {
            agregadoPorDestino = 500;//Numeros magicos
        } else {
            agregadoPorDestino += 5 * distancia;//numero magico
        }
        return agregadoPorDestino;
    }
}

