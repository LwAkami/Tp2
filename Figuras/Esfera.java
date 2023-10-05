package Figuras;

public class Esfera extends TresDimenciones{
    double Radio;

    @Override
    public double CalcularArea() {
        return 4 * 3.14 * (Radio*Radio);
    }

    public void setRadio(double radio) {
        Radio = radio;
    }

    @Override
    public double CalcularBolumen() {
        return  (4/3) * 3.14 * (Radio*Radio*Radio);
    }
}
