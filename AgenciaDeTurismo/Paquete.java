package AgenciaDeTurismo;

public abstract class Paquete {
    protected Integer id;
    protected String destino;
    protected String medioDeTransporte;
    protected String provedor;
    protected String hospedaje;
    protected Integer costo;

    public Paquete(Integer id, String destino, String medioDeTransporte, String hospedaje,String provedor,Integer costo) {
        this.id = id;
        this.destino = destino;
        this.medioDeTransporte = medioDeTransporte;
        this.hospedaje = hospedaje;
        this.provedor = provedor;
        this.costo = costo;
    }

    public String getDestino() {
        return destino;
    }

    public String getMedioDeTransporte() {
        return medioDeTransporte;
    }

    public String getProvedor() {
        return provedor;
    }

    public String getHospedaje() {
        return hospedaje;
    }

    public Integer getCosto() {
        return costo;
    }

    public Integer getId() {
        return id;
    }

    public abstract void agregarExcursion(String excursion);

    public abstract String mostrarDetalle();
}