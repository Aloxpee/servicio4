import java.time.LocalDate;

public class metodos extends ejercicio { //pintura
    double superficie;
    double precio_pintura;

    public metodos(String trabajador, String cliente, LocalDate fecha, double superficie, double precio_pintura) {
        super(trabajador, cliente, fecha);
        this.superficie = superficie;
        this.precio_pintura = precio_pintura;
    }

    @Override
    public double costeMaterial() {
        return ((this.superficie / 7.8) * this.precio_pintura);
    }

    public double Manpower() {
        return ((superficie / 10) * 9.5);
    }

    public double costetotal() {
        return (this.costeMaterial() + Manpower());
    }

    public String detalleservicio() {
        System.out.println("Cliente:" + cliente +
                "Fecha de inicio: " + fecha +
                "Pintor" + trabajador +
                "mano de obra " + Manpower() +
                "Coste adicional " + costeMaterial() +
                "coste total" + costetotal());
            return detalleservicio();
    }
}