package tp5Punto4;

public class Main {
    public static void main(String[] args) {
        //Sin patron builder
        var comboFamiliar = new ComboFamiliar();
        var comboFamiliarConPapaExtra = new PapaExtra(comboFamiliar);
//        System.out.println(comboFamiliarConPapaExtra.valor());

        //Con patron builder
        var comboConstruido = new PedidoBuilder(comboFamiliar).agregarPapa().agregarTomate().agregarTomate().build();
        System.out.println(comboConstruido.valor());
    }
}
