package tp7Proxy.modelo;

import tp7Proxy.performance.PersonaDao;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProxyTelefonos implements Set {
    private Set<Telefono> telefonos;
    private int id;
    private PersonaDao performance;//Lo puedo desacoplar con una interfaz

    public ProxyTelefonos(int id, PersonaDao performance) {//Lo puedo desacoplar con una interfaz
        this.id = id;
        this.telefonos = new HashSet<Telefono>();
        this.performance = performance;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        telefonos = performance.telefonosPorId(id);
        return telefonos.toArray(new Telefono[telefonos.size()]);
    }
}
