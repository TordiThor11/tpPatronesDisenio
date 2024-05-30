package tp6Punto4.model;

public interface RegistroDeParticipantes {
    //Se implementa solo con el JDBC, no cambie nada ya que use un fake para simular la conexion a la BD
    void registrar(Participante participante) throws Exception;
}
