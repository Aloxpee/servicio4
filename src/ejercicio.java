import java.time.LocalDate;

public abstract class  ejercicio implements si {
    protected String trabajador;
    protected String cliente;
    protected LocalDate fecha;

    public ejercicio(String trabajador, String cliente, LocalDate fecha) {
        this.trabajador = trabajador;
        this.cliente = cliente;
        this.fecha = fecha;
    }
    public abstract double costeMaterial();
    public abstract double costetotal();

    public abstract double Manpower();
    public abstract String detalleservicio();

}
