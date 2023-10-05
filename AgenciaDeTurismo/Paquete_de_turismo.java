package AgenciaDeTurismo;

import java.util.ArrayList;

public class Paquete_de_turismo extends Paquete {
    private final ArrayList<String> excursiones;

    public Paquete_de_turismo(Integer ID,String destino, String medioDeTransporte, String hospedaje, String provedor,Integer costo) {
        super(ID,destino, medioDeTransporte, hospedaje, provedor, costo);
        excursiones = new ArrayList<>();
    }

    @Override
    public void agregarExcursion(String excursion) {
        excursiones.add(excursion);
    }

    @Override
    public String mostrarDetalle() {
        String mensaje= "";
        mensaje = mensaje + "Paquete de Turismo: \n";
        mensaje = mensaje + "Destino: " + destino + "\n";
        mensaje = mensaje + "Medio de Transporte: " + medioDeTransporte+ "\n";
        mensaje = mensaje + "Hospedaje: " + hospedaje+ "\n";
        mensaje = mensaje + "Proveedor: " + provedor + "\n";
        mensaje = mensaje + "Excursiones:" + "\n";
        for (String excursion : excursiones) {
            mensaje = mensaje + "- " + excursion + "\n";
        }
        mensaje = mensaje + "Costo: " + costo.toString() + "\n";
        return mensaje;
    }
}