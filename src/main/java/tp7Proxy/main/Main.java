package tp7Proxy.main;

import tp7Proxy.modelo.Persona;
import tp7Proxy.modelo.Telefono;
import tp7Proxy.performance.PersonaDao;

public class Main {
    public static void main(String[] args) {
        PersonaDao personaDao = new PersonaDao();
        Persona miPersona = personaDao.personaPorId(124);
        System.out.println(miPersona.getNombre());
        for (Telefono telefono : miPersona.getTelefonos()) {
            System.out.println(telefono);
        }
    }
}
