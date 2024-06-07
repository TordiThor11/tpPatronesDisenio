package tp7Proxy.performance;

import tp7Proxy.modelo.Persona;
import tp7Proxy.modelo.ProxyTelefonos;
import tp7Proxy.modelo.Telefono;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class PersonaDao {
    public static final String get_persona_por_id = "SELECT persona.nombe FROM persona WHERE persona.id = ?;";
    public static final String get_telefonos_por_id = "SELECT telefono.numero FROM persona JOIN telefono ON persona.id = telefono.id_persona WHERE persona.id = ?;";

    private Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/tp_proxy", "root", "");
    }

    public Persona personaPorId(int id) {
        String sql = get_persona_por_id;
        try (Connection conn = obtenerConexion();
             PreparedStatement statement = conn.prepareStatement(sql);) {
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            String nombrePersona = null;
            while (result.next()) {
                nombrePersona = result.getString(1);
            }
            return new Persona(id, nombrePersona, new ProxyTelefonos(id, new PersonaDao()));
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public Set<Telefono> telefonosPorId(int id) {
        String sql = get_telefonos_por_id;
        try (Connection conn = obtenerConexion();
             PreparedStatement statement = conn.prepareStatement(sql);) {
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            Set<Telefono> telefonos = new HashSet<Telefono>();
            while (result.next()) {
                telefonos.add(new Telefono(result.getString(1)));
            }
            return telefonos;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
