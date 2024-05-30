package tp6Punto4.main;

import tp6Punto4.mail.MailJakarta;
import tp6Punto4.model.ControladorDeParticipantes;
import tp6Punto4.model.MailObserver;
import tp6Punto4.model.Observer;
import tp6Punto4.ui.VentanaDeCarga;

import java.awt.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FakeRegistro registroParticipante = new FakeRegistro();
                    
                    //creo la lista de observadores
                    List<Observer> observadores = new ArrayList<>();
                    observadores.add(new MailObserver(new MailJakarta("sandbox.smtp.mailtrap.io", "2525", "136bf073b21441", "035c321df45fe7")));
                    observadores.add(new FakeRegistro());

                    ControladorDeParticipantes controladorDeParticipantes = new ControladorDeParticipantes(observadores);
                    new VentanaDeCarga(controladorDeParticipantes);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        });
    }
}
