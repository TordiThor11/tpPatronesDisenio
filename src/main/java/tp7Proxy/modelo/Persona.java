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
//        System.out.println(telefonos.size());
        return telefonos.toArray(new Telefono[telefonos.size()]);
    }

    public String getNombre() {
//        System.out.println(telefonos.size());
        return nombre;
    }
}

