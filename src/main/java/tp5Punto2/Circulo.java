package tp5Punto2;

class Circulo implements Figura {
    private int radio;
    private Coordenada coordenada;

    public Circulo(Coordenada coordenada, int radio) {
        this.radio = radio;
        this.coordenada = coordenada;
    }

    /*@Override
    public void dibujar(Graphics2D g2d) {
        g2d.drawOval(coordenada.x() - radio,
                coordenada.y() - radio,
                radio * 2,
                radio * 2);
    }*/
    public void dibujar(Panel panel) {
        panel.dibujarCirculo(this.coordenada, this.radio);
    }

}
