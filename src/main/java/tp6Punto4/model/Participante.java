package tp6Punto4.model;

public class Participante {
    private String nombre;
    private String telefono;
    private String region;
    private String mail;

    public Participante(String nombre, String telefono, String region, String mail) throws Exception {
        validar(nombre, telefono, region);
        this.nombre = nombre;
        this.telefono = telefono;
        this.region = region;
        this.mail = mail;
    }

    private void validar(String nombre, String telefono, String region) throws Exception {
        if (!esValidoElTelefono(telefono)) {
            throw new Exception("Telefono invalido");
        }
        if (!esRegionValida(region)) {
            throw new Exception("region invalido");
        }
        if (!esValido(nombre, telefono, region)) {
            throw new Exception("Campos vacios");
        }
    }

    private boolean esValido(String nombre, String telefono, String region) {
        return !nombre.trim().isEmpty() || telefono.trim().isEmpty() || region.trim().isEmpty();
    }

    private boolean esRegionValida(String region) {
        return region.equals("China") || region.equals("US") || region.equals("Europa");
    }

    private boolean esValidoElTelefono(String telefono) {
        String regex = "\\d{4}-\\d{6}";
        return telefono.matches(regex);
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getRegion() {
        return region;
    }

    public String getMail() {
        return mail;
    }
    

}
