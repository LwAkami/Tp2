package Academia_de_danza;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Secretaria {
    ArrayList<Diagrama> diagramas = new ArrayList<Diagrama>();
    ArrayList<Alumnos> alumnos = new ArrayList<Alumnos>();
public void CrearDiagrama(String Diciplina,String nive,String salon,String profesor,String dia,String hora, String id){
    Diagrama diagram = new Diagrama();
    diagram.nuevoDiagrama(Diciplina,nive,salon,profesor,dia,hora,id);
    diagramas.add(diagram);
}
public void CrearAlumno(String nombre_apellido,String DNI, String Telefono, String IDcredencial,String id_del_diagrama){
    Alumnos alumno = new Alumnos();
    alumno.setDNI(DNI);
    alumno.setTelefono(Telefono);
    alumno.setNombre_apellido(nombre_apellido);
    alumno.CrearCredencial(nombre_apellido,IDcredencial,id_del_diagrama);
    alumnos.add(alumno);
}

public void acistencia(String Nombre,String ID){
    for (Alumnos elemento : alumnos){
        if (Objects.equals(elemento.getNombre_apellido(), Nombre)){
            if(Objects.equals(elemento.credencialId(), ID)){
                elemento.asistencia();
                return;
            }
        }
    }
}
private ArrayList<LocalDate> confirmarAsistencia(ArrayList<LocalDate> fechas){
    for(LocalDate elemento: fechas){
        if(elemento.getMonth() != LocalDate.now().getMonth()){
            fechas.remove(elemento);
        }
    }
    return fechas;
}
public String Importemensual(){
    String mensaje = "";
    String id;
    for (Diagrama clases : diagramas){
        ArrayList<LocalDate> asistencias = new ArrayList<LocalDate>();
        Integer cantidad_alumnos = 0;
        id = clases.getId();
        for (Alumnos alumno : alumnos){
            if (Objects.equals(alumno.CredencialIdDigrama(), id)){
                asistencias.addAll(alumno.getAsistencias());
            };
        }
        confirmarAsistencia(asistencias);
        cantidad_alumnos = asistencias.size();
        if (cantidad_alumnos != 0){mensaje = mensaje + "al profesor " + clases.getProfesor() +" se le debe pagar " + (cantidad_alumnos*10) + "$\n";}
    }

    return mensaje ;
}
    public String Diciplina_mayor_ingreso(){
        String mensaje = "";
        String id;
        for (Diagrama clases : diagramas){
            Integer cantidad_alumnos, diciplinaactual = 0;
            ArrayList<LocalDate> asistencias = new ArrayList<LocalDate>();
            id = clases.getId();
            for (Alumnos alumno : alumnos){
                if (Objects.equals(alumno.CredencialIdDigrama(), id)){
                    asistencias.addAll(alumno.getAsistencias());
                };
            }
            confirmarAsistencia(asistencias);
            cantidad_alumnos = asistencias.size();
            if (cantidad_alumnos > diciplinaactual){mensaje = "la diciplina que mas redituo este mes fue el " + clases.getDiciplina();}
        }
        return mensaje;
    }

}