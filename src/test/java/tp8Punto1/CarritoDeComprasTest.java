package tp8Punto1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarritoDeComprasTest {
    public static final String capital_federal = "caba";
    public static final String gran_bsas = "gran_buenos_aires";

    @Test
    public void compraSinPasarPesoEnColectivoSurDestinoCaba() {
        var carrito = new CarritoDeCompras(new ColectivosSur());
        carrito.agregarProducto(new Producto(100, 2));
        carrito.agregarProducto(new Producto(50, 3));
        assertEquals(1150, carrito.calcularValorTotal(capital_federal, 200));
    }

    @Test

    public void compraPasando5kgPesoEnColectivoSurDestinoGranBsas() {
        var carrito = new CarritoDeCompras(new ColectivosSur());
        carrito.agregarProducto(new Producto(100, 6));
        carrito.agregarProducto(new Producto(50, 3));
        assertEquals(2150, carrito.calcularValorTotal(gran_bsas, 200));
    }

    @Test

    public void compraPasando30kgPesoEnColectivoSurDestinoSinOferta() {
        var carrito = new CarritoDeCompras(new ColectivosSur());
        carrito.agregarProducto(new Producto(100, 6));
        carrito.agregarProducto(new Producto(50, 30));
        assertEquals(5150, carrito.calcularValorTotal("unknown city", 200));
    }

    @Test

    public void compraEnCorreoArgentinoDestinoCaba() {
        var carrito = new CarritoDeCompras(new CorreoArgentino());
        carrito.agregarProducto(new Producto(100, 6));
        carrito.agregarProducto(new Producto(50, 30));
        assertEquals(650, carrito.calcularValorTotal(capital_federal, 200));
    }

    @Test

    public void compraEnCorreoArgentinoDestinoSinOferta() {
        var carrito = new CarritoDeCompras(new CorreoArgentino());
        carrito.agregarProducto(new Producto(100, 6));
        carrito.agregarProducto(new Producto(50, 30));
        assertEquals(1950, carrito.calcularValorTotal("unknown city", 200));
    }

}