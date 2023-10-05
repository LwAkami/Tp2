import Clup_de_futbol.Administrador_de_socios;
import AgenciaDeTurismo.Provedor;
import Figuras.*;

public class Main {
    public static void main(String[] args) {
        //ejercicio 1
    Administrador_de_socios socios = new Administrador_de_socios();
    socios.generarnuevosocio(3,"jose","jose.com","sanluis","322452","23235243","02/10/2023");
    socios.generarnuevosocio(1,"miguel","miguel.com","lisandrolatorre","322434","23235265","22/10/2023");
    socios.generarnuevosocio(2,"luis","luis.com","josesepaz","343452","23235443","12/10/2023");
    socios.generarnuevaActividad("pileta",1);
    socios.generarnuevaActividad("parke",2);
    socios.generarnuevaActividad("futbol",3);
    socios.generarnuevaActividad("tele",1);
    System.out.printf(socios.SocioSegunSuscripcion());
    System.out.printf(socios.SocioMensual());
    System.out.printf(socios.listaActividades());
    //ejercicio 2
    System.out.printf("\nEjercicio 2 \n ------------------------------------------\n");
    Provedor paquetes = new Provedor();
    paquetes.crearPaquete(1,"Playa del Carmen", "Avión", "Hotel XYZ", "TurismoPlus", 10000);
    paquetes.agregarExcursionAPaquete(1,"islas");
    paquetes.agregarExcursionAPaquete(1,"monte");
    paquetes.crearPaquete(2,"Cancún", "Crucero", "Resort ABC", "ViajesMarinos", 5000);
    paquetes.agregarExcursionAPaquete(2,"playa");
    paquetes.nuevoCliente(1,"jorge",1);
    paquetes.nuevoCliente(2,"miguel",2);
    paquetes.agregarCompra(1,2);
    paquetes.agregarCompra(1,2);
    System.out.printf(paquetes.mostrarPaquetes());
    System.out.printf(paquetes.mostrarVentasMensuales());
    System.out.printf("------------------------------------\n");
    System.out.printf(paquetes.DestinoMascomprado(1));
    //ejercicio 3
    System.out.printf("\nEjercicio 3 \n ------------------------------------------\n");

    //ejercicio 9
    System.out.printf("\nEjercicio 9 \n ------------------------------------------\n");
    Circulo circulo = new Circulo();
    Rectangulo rectangulo = new Rectangulo();
    Triangulo triangulo = new Triangulo();
    circulo.setRadio(10);
    rectangulo.setrectangulo(10,14);
    triangulo.setTringulo(14,20);
    System.out.printf("el area del circulo es "+ Double.toString(circulo.CalcularArea()) + "\n");
    System.out.printf("el area del Triangulo es "+ Double.toString(triangulo.CalcularArea()) + "\n");
    System.out.printf("el area del Rectangulo es "+ Double.toString(rectangulo.CalcularArea()) + "\n");
    //tres dimenciones
    Esfera esfera = new Esfera();
    Cubo cubo = new Cubo();
    esfera.setRadio(10);
    cubo.setAristas(15);
    System.out.printf("el area de la esfera es "+ Double.toString(esfera.CalcularArea()) + " y su bolumen es "+Double.toString(esfera.CalcularBolumen()) +"\n");
    System.out.printf("el area del cubo es "+ Double.toString(cubo.CalcularArea()) + " y su bolumen es "+Double.toString(cubo.CalcularBolumen()) +"\n");
    }
}