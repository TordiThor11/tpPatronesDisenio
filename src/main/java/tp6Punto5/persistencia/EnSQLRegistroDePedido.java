package tp6Punto5.persistencia;

import tp6Punto5.modelo.Observer;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class EnSQLRegistroDePedido implements Observer {
    @Override
    public void actualizar(double monto) {
        try (java.sql.Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema_restaurante", "root", "");
             PreparedStatement sent = conexion.prepareStatement("INSERT INTO `pedidos` (`fecha`, `monto`) VALUES (?, ?);");) {
            sent.setString(1, LocalDateTime.now().toString());
            sent.setString(2, String.valueOf(monto));
            int update = sent.executeUpdate();

            sent.close();
            conexion.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}
