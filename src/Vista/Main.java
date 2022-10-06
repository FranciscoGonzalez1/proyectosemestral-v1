package Vista;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> mochilaDeClientes = new ArrayList();

        while (true) {
            System.out.println("******* SISTEMA DE ARRIENDO DE EQUIPOS DE NIEVE ********\n");
            System.out.println("*** MENU DE OPCIONES ***");
            System.out.println("1. Crea un nuevo cliente");
            System.out.println("2. Crea un nuevo equipo");
            System.out.println("3. Lista todos los clientes");
            System.out.println("4. Lista todos los equipos");
            System.out.println("5. Salir");
            System.out.print("\tIngrese Opcion:\t");

            int op = sc.nextInt();

            switch (op) {
                case 1: //Crea un nuevo cliente
                    //solicitando la info

                    //crea el cliente

                    //llenar info

                    //agregarlo al arreglo
                    break;
                case 2: //Crea un nuevo equipo
                    break;
                case 3: //Lista todos los clientes
                    System.out.println("LISTADO DE CLIENTES");
                    System.out.println("-------------------\n");

                    for (Cliente clienteSacado : mochilaDeClientes) {
                        System.out.println("Nombre:\t");
                        System.out.println("Apellido Paterno:\t");
                        System.out.println("Apellido Materno:\t");
                        System.out.println("RUT:\ŧ");
                        System.out.println("-------------------");
                    }
                    break;
                case 4: //Lista todos los equipos

                    break;
                case 5: //Salir
                    System.exit(2)
                default:    //caso error

            }
        }//loop

    }
}
