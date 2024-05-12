package tp4Punto2;

import java.util.ArrayList;

public class Historia extends Item {
    private ArrayList<Item> items;

    public Historia(int tiempoRequerido) {
        super(tiempoRequerido);
        this.items = new ArrayList<>();
    }

    @Override
    public int tiempoTotalRequerido() {
        int tiempoTotalRequerido = this.tiempoRequerido;
        for (Item item : items) {
            tiempoTotalRequerido += item.tiempoTotalRequerido();
        }
        return tiempoTotalRequerido;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }
}
