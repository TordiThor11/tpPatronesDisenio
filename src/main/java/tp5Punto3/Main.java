package tp5Punto3;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String nombreReporte = "Segundo reporte";
        var file = new File("C:\\Users\\Valentin\\IdeaProjects\\tpPatronesDisenio\\src\\main\\resources\\ReportesTp5Punto3\\" + nombreReporte);
        var reportConSobrescritura = new Report("A reportar2...");
//        reportConSobrescritura.export(file);
        var reportSinSobrescritura = new ReportSinSobrescritura(reportConSobrescritura);
        reportSinSobrescritura.export(file);
    }
}
