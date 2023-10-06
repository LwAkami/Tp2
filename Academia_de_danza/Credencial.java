package Academia_de_danza;

import java.time.LocalDate;
import java.util.ArrayList;

public class Credencial {
    private String Alumno;
    private String ID;
    private String id_del_diagrama;
    private ArrayList<LocalDate> asistencias = new ArrayList<LocalDate>();

    public void Creacion(String Alumno, String id,String id_del_diagrama){
        this.Alumno = Alumno;
        this.ID = id;
        this.id_del_diagrama = id_del_diagrama;
    }

    public void nuevaAsistencia (){
        LocalDate fecha = LocalDate.now();
        asistencias.add(fecha);
    }

    public String getAlumno() {
        return Alumno;
    }

    public String getID() {
        return ID;
    }

    public String getId_del_diagrama() {
        return id_del_diagrama;
    }

    public ArrayList<LocalDate> getAsistencias() {
        return asistencias;
    }
}