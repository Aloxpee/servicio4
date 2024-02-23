import java.time.LocalDate;

public class alarma extends ejercicio {
    int alarmas;

    public alarma(String trabajador, String cliente, LocalDate fecha, int alarmas) {
        super(trabajador, cliente, fecha);
        this.alarmas = alarmas;
        this.trabajador = "revisor especialista";
    }

    public int getAlarmas() {
        return alarmas;
    }

    public void setAlarmas(int alarmas) {
        this.alarmas = alarmas;
    }

    public double costeMaterial() {
        return 0;
    }

    public double Manpower() {
        return ((alarmas / 3) * 40);
    }

    public double costetotal() {
        return (this.Manpower());
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