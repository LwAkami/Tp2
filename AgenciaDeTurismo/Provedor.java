package AgenciaDeTurismo;
import java.util.Collections;
import Clup_de_futbol.Socio;
import java.time.LocalDate;
import java.util.ArrayList;
public class Provedor {
    private ArrayList<Paquete_de_turismo> paquetes = new ArrayList<Paquete_de_turismo>();
    private ArrayList<Cliente> Clientes= new ArrayList<Cliente>();
    public void nuevoCliente (Integer usuario,String nombre, Integer idcompra){
        Cliente cliente = new Cliente();
        cliente.nuevoCliente(usuario,nombre,idcompra);
        Clientes.add(cliente);
    }
    public void agregarCompra(Integer usuario, Integer compra){
        for (Cliente clientes : Clientes) {
            if (clientes.getUsuario().equals(usuario)){
                clientes.AgregarCompra(compra);
            }
        }
    }
    public void crearPaquete(Integer ID,String destino, String medioDeTransporte, String hospedaje, String proveedor, Integer costo) {
        Paquete_de_turismo paquete = new Paquete_de_turismo(ID,destino, medioDeTransporte, hospedaje, proveedor,costo);
        paquetes.add(paquete);
    }
    public String mostrarPaquetes() {
        String mensaje = "Paquetes del Proveedor:";
        for (Paquete_de_turismo paquete : paquetes) {
            mensaje= mensaje + paquete.mostrarDetalle();
            mensaje= mensaje + ("-----------------------------\n");
        }
        return mensaje;
    }
    public void agregarExcursionAPaquete(Integer idPaquete, String excursion) {
        for (Paquete_de_turismo paquete : paquetes) {
            if (paquete.getId().equals(idPaquete)) {
                paquete.agregarExcursion(excursion);
                return; // Terminamos la búsqueda después de encontrar el paquete.
            }
        }
        System.out.println("No se encontró un paquete con el ID especificado: " + idPaquete + "\n");
    }
    public String mostrarVentasMensuales(){
        LocalDate mes = LocalDate.now();
        ArrayList<Integer> listaDeCompras = new ArrayList<Integer>();
        String listado = "Ventas del mes: \n";
        for (Cliente clientes : Clientes) {
            listaDeCompras.addAll(clientes.ventas_del_mes());
        }
        Collections.sort(listaDeCompras);
        for (Integer elemento : listaDeCompras) {
            for (Paquete_de_turismo paquete : paquetes) {
                if (paquete.getId().equals(elemento)) {
                   listado = listado + paquete.getDestino() + "\n";
                }
            }
        }
        return listado;
    }
    public String DestinoMascomprado(Integer IDcliente){
        Integer Destino;
        String Mensaje = "";
        for (Cliente clientes : Clientes) {
            if (clientes.getUsuario().equals(IDcliente)){
                Destino = clientes.DestinoMasComprado();
                for (Paquete_de_turismo paquete : paquetes) {
                    if (paquete.getId().equals(Destino)) {
                        Mensaje ="El destino mas visitado por "+clientes.getNombre() + " es "+ paquete.getDestino() + "\n";
                    }
                }
                break;
            }
        }
        return Mensaje;
    }
}