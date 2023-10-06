package Academia_de_danza;

import java.time.LocalDate;

public class Diagrama {
    private String id;
    private String diciplina;
    private String nivel;
    private String dia;
    private  String hora;
    private String salon;
    private String profesor;

    public String getId() {
        return id;
    }

    public void nuevoDiagrama(String diciplina, String nivel, String salon, String profesor , String dia, String hora, String id){
        this.diciplina = diciplina;
        this.dia = dia;
        this.nivel = nivel;
        this.profesor = profesor;
        this.salon = salon;
        this.hora= hora;
        this.id = id;
    }
    public String getDiciplina() {
        return diciplina;
    }

    public String getNivel() {
        return nivel;
    }

    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }

    public String getSalon() {
        return salon;
    }

    public String getProfesor() {
        return profesor;
    }
}