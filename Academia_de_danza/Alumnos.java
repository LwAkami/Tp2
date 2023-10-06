package Academia_de_danza;

import javax.print.DocFlavor;
import java.time.LocalDate;
import java.util.ArrayList;

public class Alumnos {
private String nombre_apellido;
private String DNI;
private String Telefono;
private Credencial creden;
    public void setNombre_apellido(String nombre_apellido) {
        this.nombre_apellido = nombre_apellido;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getNombre_apellido() {
        return nombre_apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public String getTelefono() {
        return Telefono;
    }
    public String credencialId(){
        return creden.getID();
    }
    public String CredencialIdDigrama(){
        return creden.getId_del_diagrama();
    }
    public void  CrearCredencial(String alumno,String id,String id_del_diagrama){
        Credencial credencia = new Credencial();
        credencia.Creacion(alumno,id,id_del_diagrama);
        this.creden = credencia;
    }
    public void asistencia(){
        creden.nuevaAsistencia();
    }

    public ArrayList<LocalDate> getAsistencias() {
        return creden.getAsistencias();
    }
}