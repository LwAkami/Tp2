package Figuras;

public class Rectangulo extends DosDimenciones{
    Integer base;
    Integer Altura;

    public void setrectangulo(Integer base,Integer altura) {
        this.base = base;
        this.Altura = altura;
    }

    @Override
    public double CalcularArea() {
        return base * Altura;
    }
}
