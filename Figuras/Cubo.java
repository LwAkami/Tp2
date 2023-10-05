package Figuras;

public class Cubo  extends TresDimenciones{
    double Aristas;

    @Override
    public double CalcularArea() {
        return 6 * (Aristas*Aristas);
    }

    public void setAristas(double aristas) {
        Aristas = aristas;
    }

    @Override
    public double CalcularBolumen() {
        return  (Aristas*Aristas*Aristas);
    }
}
