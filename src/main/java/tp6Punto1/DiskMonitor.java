package tp6Punto1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import static java.time.LocalDate.now;

public class DiskMonitor implements Observer {
    @Override
    public void actualizar(String info) {
        try {
            info = info + " " + now() + "\n";
            Files.write(Paths.get("C:\\Users\\Valentin\\IdeaProjects\\tpPatronesDisenio\\src\\main\\resources\\RegistrosTp6Punto2.txt"), info.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error en la entrada/salida de datos", e);
        }
    }
}
