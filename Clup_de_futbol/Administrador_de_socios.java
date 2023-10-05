package Clup_de_futbol;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;

public class Administrador_de_socios {
    ArrayList <Socio> lista = new ArrayList<Socio>();
    ArrayList <Actividad> litaDeActividades = new ArrayList<Actividad>();
    public void generarnuevosocio(Integer credencial, String nombre, String email, String direcion, String DNI, String telefono,String fecha){
        Socio cliente = new Socio();
        cliente.setCredencial(credencial);
        cliente.setDirecion(direcion);
        cliente.setDNI(DNI);
        cliente.setEmail(email);
        cliente.setNombre(nombre);
        cliente.setTelefono(telefono);
        cliente.setFecha(fecha);
        lista.add(cliente);
    }
    public void generarnuevaActividad(String nombre, Integer Nivel){
        Actividad descripcion = new Actividad();
        descripcion.setActividad(nombre);
        descripcion.setNivel(Nivel);
        litaDeActividades.add(descripcion);
    }
    private Socio existeSocio(String DNI){
        for (Socio persona : lista) {
            if (persona.getNombre().equals(DNI)) {
                return persona;
            }
        }
        return null;
    }
    public void OrdenarSocios(){
        Collections.sort(lista, new Comparator<Socio>() {
            @Override
            public int compare(Socio persona1, Socio persona2) {
                return persona1.getCredencial() - persona2.getCredencial();
            }
        });
    }
    public boolean ActividadPermitida(int nivel,String DNI, String Actividad){
        boolean permitir = false;
        Socio cliente = new Socio();
        cliente = existeSocio(DNI);
        if (cliente == null){return permitir;}
        if (cliente.getCredencial() >= nivel){permitir = true;}
        return permitir;
    }
    public String SocioMensual() {
        LocalDate mes = LocalDate.now();
        String listado = "Socios del mes: \n";
        for (Socio persona : lista) {
            if (persona.getFecha().getMonth().equals(mes.getMonth())) {
                listado = listado + persona.getNombre() + "\n";
            }
        }
        return listado;
    }
    private String convertirCredencialTexto(int credencial){
        switch (credencial) {
            case 1:
                return "Básico";
            case 2:
                return "Intermedio";
            case 3:
                return "Destacado";
        }
        return "";
    }
    public String SocioSegunSuscripcion(){
        OrdenarSocios();
        String credencial;
        String listado = "Socios del mes: \n";
        for (Socio persona : lista) {
                credencial = convertirCredencialTexto(persona.getCredencial());
                listado = listado + persona.getNombre() + " Suscipcion de nivel " + credencial+ "\n";
        }
        return listado;
    }
    public void OrdenarActividades(){
        Collections.sort(litaDeActividades, new Comparator<Actividad>() {
            @Override
            public int compare(Actividad persona1, Actividad persona2) {
                return persona1.getNivel() - persona2.getNivel();
            }
        });
    }
    public String listaActividades(){
        OrdenarActividades();
        String credencial;
        String listado = "Socios del mes: \n";
        for (Actividad persona : litaDeActividades) {
            credencial = convertirCredencialTexto(persona.getNivel());
            listado = listado + persona.getActividad() + " Suscipcion de nivel " + credencial+ "\n";
        }
        return listado;
    }
}