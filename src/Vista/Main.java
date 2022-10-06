package Vista;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("******* SISTEMA DE ARRIENDO DE EQUIPOS DE NIEVE ********\n");
        System.out.println("*** MENU DE OPCIONES ***");
        System.out.println("1. Crea un nuevo cliente");
        System.out.println("2. Crea un nuevo equipo");
        System.out.println("3. Lista todos los clientes");
        System.out.println("4. Lista todos los equipos");
        System.out.println("5. Salir");
        System.out.print("\tIngrese Opcion:\t");

        int op = sc.nextInt();

        switch(op){
            case 1: //Crea un nuevo cliente
                //solicitando la info

                //crea el cliente

                //llenar info

                //agregarlo al arreglo
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.exit(2)
            default:

        }


    }
}
