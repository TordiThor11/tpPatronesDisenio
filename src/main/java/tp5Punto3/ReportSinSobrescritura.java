package tp5Punto3;

import java.io.File;

public class ReportSinSobrescritura implements Exportable {
    private Exportable exportable;

    public ReportSinSobrescritura(Exportable exportable) {
        this.exportable = exportable;
    }

    @Override
    public void export(File file) {
        if (file.exists()) {
            throw new IllegalArgumentException(
                    "El archivo ya existe..."
            );
        }
        exportable.export(file);
    }
}
