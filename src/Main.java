import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);

        String DNI;
        int numero;
        int opcion = -1;
        System.out.println("1 para pintura 2 alarmas");
int tipodeobra=sc.nextInt();
        try {
            metodos pintura=new metodos("yi","contrata", LocalDate.now(),100,2);
            alarma si=new alarma("yi","contrata",LocalDate.now(),2);
            do {
                //Try catch para evitar que el programa termine si hay un error
                System.out.println("MENU DE OPCIONES:" +
                        "\n1.- Coste total" +
                        "\n2.- detalle de ña obra" +
                        "\n0.- Salir");
                System.out.println("Enter la opcion elegida: ");
                opcion = sc.nextInt();
                //Ejemplo de switch case en Java
                switch (opcion) {
                    case 1:
                        if(tipodeobra==1){
                            System.out.println("Precio obre igual a "+pintura.costetotal());
                        }else{
                            System.out.println("alarmas igual a"+si.costetotal());
                        }
                        break;
                    case 2:
                        if(tipodeobra==1){
                        System.out.println(pintura.detalleservicio());
                        }else{
                            System.out.println(si.detalleservicio());
                        }

                        break;
                    case 0:
                        System.out.println("Adios!");
                        break;
                    default:
                        System.out.println("Número no reconocido");
                        break;
                }//switch

                System.out.println("\n"); //Mostrar un salto de línea en Java



            } while (opcion != 0);//while
            System.out.println("Hasta pronto");
        } //try
        catch (Exception e) {
            System.out.println("Uoop! Error!");
        }//catch
    }
}