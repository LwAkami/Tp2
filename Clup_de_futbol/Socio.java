package Clup_de_futbol;
import javax.print.DocFlavor;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.logging.SimpleFormatter;
import java.time.format.DateTimeFormatter;
public class Socio {
    private Integer credencial = 0;
    private String nombre = "";
    private String DNI = "";
    private String telefono = "";
    private String email = "";
    private String direcion = "";
    private LocalDate fecha = null;
    public Integer getCredencial() {
        return credencial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getDirecion() {
        return direcion;
    }

    public LocalDate getFecha(){
        return fecha;
    }
    public void setCredencial(Integer credencial) {
        this.credencial = credencial;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public void setFecha(String fecha){
        LocalDate mes;
        mes = Fechas(fecha);
        this.fecha = mes;
    }
    private LocalDate Fechas(String fecha) {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate fechas = null;
        try {
            fechas = LocalDate.parse(fecha, formatter1);
        } catch (Exception e1) {
            try {
                fechas = LocalDate.parse(fecha, formatter2);
            } catch (Exception e2) {
                // Ambos formatos de fecha fallaron
                e2.printStackTrace();
            }
        }
        return fechas;
    }
}