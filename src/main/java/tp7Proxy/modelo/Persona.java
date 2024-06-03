package tp7Proxy.modelo;

import java.util.Set;

public class Persona {
    private int id;
    private String nombre;
    private Set<Telefono> telefonos;

    public Persona(int id, String nombre, Set<Telefono> telefonos) {
        this.id = id;
        this.nombre = nombre;
        this.telefonos = telefonos;
    }

    public Telefono[] getTelefonos() {
        return telefonos.toArray(new Telefono[telefonos.size()]);
    }

    public String getNombre() {
        return nombre;
    }
}
