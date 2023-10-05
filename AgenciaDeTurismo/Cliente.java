package AgenciaDeTurismo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;

public class Cliente {
    private Integer usuario;
    private String nombre;
    private ArrayList<Integer> listadecompras = new ArrayList<Integer>();
    private ArrayList<LocalDate> fechaCompra = new ArrayList<LocalDate>();

    public Integer getUsuario() {
        return usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getListadecompras() {
        return listadecompras;
    }

    public ArrayList<LocalDate> getFechaCompra() {
        return fechaCompra;
    }

    public void nuevoCliente (Integer usuario, String nombre, Integer compra){
        this.fechaCompra.add(LocalDate.now());
        this.usuario = usuario;
        this.nombre = nombre;
        this.listadecompras.add(compra);
    }
    public void AgregarCompra(Integer compra){
        this.fechaCompra.add(LocalDate.now());
        this.listadecompras.add(compra);
    }

    public ArrayList<Integer> ventas_del_mes(){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (int i = 0; i < listadecompras.size(); i++) {
            if (fechaCompra.get(i).getMonth().equals(LocalDate.now().getMonth())) {
                lista.add(listadecompras.get(i));
            }
        }
        return lista;
    }

    public Integer DestinoMasComprado(){
        Map<Integer, Integer> conteo = new HashMap<>();
        int numeroMasFrecuente = 0;
        int maximoConteo = 0;

        for (int numero : listadecompras) {
            int nuevoConteo = conteo.getOrDefault(numero, 0) + 1;
            conteo.put(numero, nuevoConteo);
            if (nuevoConteo > maximoConteo) {
                numeroMasFrecuente = numero;
                maximoConteo = nuevoConteo;
            }
        }
        return numeroMasFrecuente;
    }
}
