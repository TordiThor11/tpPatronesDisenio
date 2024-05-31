package tp6Punto5.modelo;

import java.util.HashMap;
import java.util.Map;

public class Pedido {
    private HashMap<Consumible, Integer> platosPrincipalesMap = new HashMap<>();
    private HashMap<Consumible, Integer> bebidasMap = new HashMap<>();
    private int numeroMesa;
    private int estado = 0; //0 es en proceso y 1 es confirmado

    public Pedido(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public void pedir(PlatoPrincipal plato) {
        if (this.estado != 0) {
            throw new IllegalStateException("No se puede agregar nada una vez confirmado el pedido");
        }
        if (platosPrincipalesMap.containsKey(plato)) {
            int cantidadVieja = platosPrincipalesMap.get(plato);
            this.platosPrincipalesMap.replace(plato, cantidadVieja + 1);
        } else {
            this.platosPrincipalesMap.put(plato, 1);
        }
    }

    public void pedir(Bebida bebida) {
        if (this.estado != 0) {
            throw new IllegalStateException("No se puede agregar nada una vez confirmado el pedido");
        }
        if (bebidasMap.containsKey(bebida)) {
            int cantidadVieja = bebidasMap.get(bebida);
            this.bebidasMap.replace(bebida, cantidadVieja + 1);
        } else {
            this.bebidasMap.put(bebida, 1);
        }

    }

    public int getCantidadPedido(PlatoPrincipal platoPrincipal) {
        return platosPrincipalesMap.get(platoPrincipal);
    }

    public int getCantidadPedido(Bebida bebida) {
        return bebidasMap.get(bebida);
    }

    public void confirmar() {
        estado = 1;
    }

    private double contarMonto(HashMap<Consumible, Integer> mapa) {
        double sumatoria = 0;
        for (Map.Entry<Consumible, Integer> entry : mapa.entrySet()) {
            sumatoria += entry.getKey().getPrecio() * entry.getValue();
        }
        return sumatoria;
    }

    public double contarMontoPlatoPrincipal() {
        return contarMonto(platosPrincipalesMap);
    }

    public double contarMontoBebida() {
        return contarMonto(bebidasMap);
    }

}
