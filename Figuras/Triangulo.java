package Figuras;

public class Triangulo extends DosDimenciones{
    Integer Base;
    Integer Altura;

    public void setTringulo(Integer altura,Integer base) {
        this.Altura = altura;
        this.Base = base;
    }

    @Override
    public double CalcularArea() {
        return (Base*Altura) /2;
    }
}
