package tp5Punto5.persistencia;

import org.example.sistemacConcursos.RegistroDeInscripcion;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class EnSQLRegistroDeInscripcion implements RegistroDeInscripcion {
    @Override
    public void registrar(LocalDateTime fecha, int dniParticipante, String nombreConcurso) {
        try (java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/concurso", "root", "");
             PreparedStatement sent = conexion.prepareStatement("INSERT INTO `registro` (`fecha`, `dni`, `nombre_concurso`) VALUES (?, ?, ?);");) {
            sent.setString(1, fecha.toString());
            sent.setString(2, String.valueOf(dniParticipante));
            sent.setString(3, nombreConcurso);
            int update = sent.executeUpdate();

            sent.close();
            conexion.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}
