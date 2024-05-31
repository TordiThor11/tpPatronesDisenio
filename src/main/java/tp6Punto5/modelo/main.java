package tp6Punto5.modelo;

import tp6Punto5.persistencia.EnConsolaObserver;
import tp6Punto5.persistencia.EnDiscoRegistroDePedido;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Pedido miPedido = new Pedido(1);
        miPedido.pedir(new PlatoPrincipal("napolitana", 250));
        miPedido.pedir(new PlatoPrincipal("napolitana", 250));
        miPedido.pedir(new Bebida("sprite", 60));

        List<Observer> observadores = new ArrayList<>();
        observadores.add(new EnDiscoRegistroDePedido());
        observadores.add(new EnConsolaObserver());
        TarjetaViedma miTarjeta = new TarjetaViedma(33142, 1000, observadores);
        miTarjeta.pagar(3.0, miPedido);   //ejemplo como porcentaje de 3%
    }
}
