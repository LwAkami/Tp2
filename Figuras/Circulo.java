package Figuras;

public class Circulo extends DosDimenciones{
    double Radio;

    public void setRadio(int radio) {
        Radio = radio;
    }

    @Override
    public double CalcularArea() {
        double resultado =  3.14 * (Radio* Radio);
       return resultado;
    }
}
