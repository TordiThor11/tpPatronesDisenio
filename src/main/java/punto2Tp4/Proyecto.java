package punto2Tp4;

import java.util.ArrayList;

public class Proyecto {
    private ArrayList<Item> items;

    public Proyecto() {
        this.items = new ArrayList<>();
    }

    public Proyecto(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public int tiempoTotalRequerido() {
        int tiempoTotalRequerido = 0;
        for (Item item : items) {
            tiempoTotalRequerido += item.tiempoTotalRequerido();
        }
        return tiempoTotalRequerido;
    }
}
