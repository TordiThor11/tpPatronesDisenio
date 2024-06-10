package tp8Punto1;

import java.util.HashSet;
import java.util.Set;

public class CarritoDeCompras {
    private Envio envio;
    private Set<Producto> productos;

    public CarritoDeCompras(Envio envio) {
        this.envio = envio;
        this.productos = new HashSet<Producto>();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public double calcularValorTotal(String destino, int distancia) {
        double valorTotal = 0;
        double pesoTotal = 0;
        for (Producto producto : productos) {
            valorTotal += producto.getPrecio();
            pesoTotal += producto.getPeso();
        }
        valorTotal += envio.valorDeEnvio(destino, pesoTotal, distancia);
        return valorTotal;
    }
}
