package Vista;

import Modelo.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class UIArriendoEquipos {
    private static Scanner sc = new Scanner(System.in);

    public static void menu(String[] args) {
        //TODO: cambiar lo de Main a UIArriendoEquipos y ControladorArriendoEquipos como corresponda
        while (true) {
            //lanza el menu
            int option = sc.nextInt();
            //elige opción según input
            switch (option) {
                case 1: //Crea un nuevo cliente
                //   creaCliente();
                    break;
                case 2: //Crea un nuevo equipo
                    //TODO: implementar creaEquipo()
                    break;
                case 3: //Lista todos los clientes
                //    listaClientes(mochilaDeClientes);
                    break;
                case 4: //Lista todos los equipos
                    //TODO: implementar listaEquipos()
                    break;
                case 5: //Salir
                    System.exit(2);
                default:    //caso error
                    System.out.println("Error: ingrese int valido (1-5)");
            }
        }//loop
    }



    public static int menu(Scanner reader){
        //función y uso original en la implementación del profesor Fernando
        System.out.println("******* SISTEMA DE ARRIENDO DE EQUIPOS DE NIEVE ********\n");
        System.out.println("*** MENU DE OPCIONES ***");
        System.out.println("1. Crea un nuevo cliente");
        System.out.println("2. Crea un nuevo equipo");
        System.out.println("3. Lista todos los clientes");
        System.out.println("4. Lista todos los equipos");
        System.out.println("5. Salir");
        System.out.print("\tIngrese Opción:\t");
        //ingresa un Integer
        int option = reader.nextInt();
        reader.nextLine(); //sino se salta en el sig. nextLine
        return option;
    }

    public static void creaCliente(Scanner reader, ArrayList<Cliente> mochilaDeClientes){
        //función y uso original en la implementación del profesor Fernando
        //solicitando la info (linea por linea)
        System.out.println("Creando un nuevo cliente...\n");
        System.out.print("Rut:\t");
        String ruts = reader.nextLine();
        System.out.print("Nombre:\t");
        String nombre = reader.nextLine();
        System.out.print("Domicilio:\t");
        String domic = reader.nextLine();
        System.out.print("Telefono:\t");
        String telef = reader.nextLine();
        //crea el cliente y llena info
        Cliente elClienteNuevo = new Cliente(ruts, nombre, telef, domic);
        //agregarlo al arreglo
        mochilaDeClientes.add(elClienteNuevo);
    }
}
   /* public static void listaClientes(ArrayList<Cliente> mochilaDeClientes){
        //función y uso original en la implementación del profesor Fernando
        //TODO: implementación horizontal como indicado
        System.out.println("LISTADO DE CLIENTES");
        System.out.println("-------------------\n");
        for (Cliente elCliente : mochilaDeClientes) {
            System.out.println("Rut:\t" + elCliente.getRut());
            System.out.println("Nombre:\t" + elCliente.getNombre());
            System.out.println("Direccion:\t" + elCliente.getDireccion());
            System.out.println("Telefono:\t" + elCliente.getTelefono());

            String activ;
            if (elCliente.isActivo()){
                activ = "Activo";
            }
            else{
                activ = "Inactivo";
            }
            System.out.println("Estado:\t" + activ);
            System.out.println("------------------");
        }
        System.out.println("FIN DEL LISTADO");
}*/
