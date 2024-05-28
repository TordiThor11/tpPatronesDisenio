package tp5Punto3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Report implements Exportable {
    private String reporte;

    public Report(String reporte) {
        this.reporte = reporte;
    }

    public void export(File file) {
        if (file == null) {
            throw new IllegalArgumentException(
                    "File es NULL; no puedo exportar..."
            );
        }
        // Exportar el reporte a un archivo.
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(reporte);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al exportar el reporte...", e);
        }
    }
}