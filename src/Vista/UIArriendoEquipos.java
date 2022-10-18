package Vista;

import Controlador.ControladorArriendoEquipos;
import java.util.Scanner;


public class UIArriendoEquipos {
    public Scanner sc = new Scanner(System.in);
    private static UIArriendoEquipos instance = new UIArriendoEquipos();
    ControladorArriendoEquipos controladorArriendoEquipos = ControladorArriendoEquipos.getInstance();
    private UIArriendoEquipos(){

    }
    public static UIArriendoEquipos getInstance(){
        return instance;
    }


    public void menu() {
        int elPepe;
        do {
            System.out.println("******* SISTEMA DE ARRIENDO DE EQUIPOS DE NIEVE ********\n");
            System.out.println("*** MENU DE OPCIONES ***");
            System.out.println("1. Crea un nuevo cliente");
            System.out.println("2. Crea un nuevo equipo");
            System.out.println("3. Lista todos los clientes");
            System.out.println("4. Lista todos los equipos");
            System.out.println("5. Salir");
            System.out.print("\tIngrese opcion:\t");
            elPepe = sc.nextInt();

            if (elPepe < 0 || elPepe > 5) {
                System.out.println("ingrese una opcion valida ");
                break;
            }
            switch (elPepe) {
                case 1:
                    //llamar al metodo creaCliente
                    creaCliente();
                    break;
                case 2:
                    //llamar al metodo creaEquipo
                    creaEquipo();
                    break;
                case 3:
                    //llama al metodo que muestra la lista de clientes
                    listaCliente();
                    break;
                case 4:
                    //llama al metodo que muestra la lista de clientes
                    listaEquipos();
                    break;
                case 5:
                    System.out.println("Adios!");
                    break;

            }
        } while (elPepe != 5);
    }

    public void creaCliente(){
        //presionando ctrl+d optengo la misma linea abajo
        System.out.println("Creando un nuevo cliente...\n");
        System.out.print("Rut:\t");
        String rut = sc.next();
        //el metodo de la clase Scanner next() no admite espacios o enter
        //por lo cual un nextLine() gasta el enter extra
        sc.nextLine();
        System.out.print("Nombre:\t");
        String nombre = sc.nextLine();
        //sc.nextLine();
        System.out.print("Domicilio:\t");
        String direccion = sc.nextLine();
        //sc.nextLine();
        System.out.print("Telefono:\t");
        String telefono = sc.next();
        //cuadro de dialogo donde se muestra el cliente ingresado
        try {
            //utilizamos el metodo sleep para detener la ejecucion del programa unos segundos
            //para asi poder mostrar los datos que se ingresan.
            //como es un metodo de la clase thread va a acompañado del try y catch
            Thread.sleep(2*1000);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        controladorArriendoEquipos.creaCliente(rut, nombre, direccion, telefono);
    }
    public void creaEquipo(){
        System.out.println("Creando un nuevo equipo...\n");
        System.out.print("Codigo:\t");
        String cod = sc.next();
        sc.nextLine();
        System.out.print("Descripcion:\t");
        String desc = sc.nextLine();
        //sc.nextLine();
        System.out.print("Precio arriendo por dia:\t");
        long dias = sc.nextLong();
        System.out.print("Ingrese el precio por dia\t");
        long precioDia = sc.nextLong();
        long precio = dias * precioDia;
        try {
            //utilizamos el metodo sleep para detener la ejecucion del programa unos segundos
            //para asi poder mostrar los datos que se ingresan.
            //como es un metodo de la clase thread va a acompañado del try y catch
            Thread.sleep(2*1000);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        controladorArriendoEquipos.creaEquipo(cod, desc, precio);
    }
    public void listaCliente(){
        String[][] clientes= controladorArriendoEquipos.listaClientes();
        System.out.println("Rut nombre direccion telefono estado");
        for (int i = 0; i<clientes.length; i++){
            for(int j = 0; j<5; j++) {
                System.out.print(clientes[i][j] + "");
            }
            System.out.println("");
        }
        try {
            //utilizamos el metodo sleep para detener la ejecucion del programa unos segundos
            //para asi poder mostrar los datos que se ingresan.
            //como es un metodo de la clase thread va a acompañado del try y catch
            Thread.sleep(2 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void listaEquipos(){
        //llamo la lista de equipos desde la clase controlador arriendos de equipos con la instancia del controlador
        //desde ahi llamo el metodo getequipos para obtener los equipos
        String[][] equipos = controladorArriendoEquipos.listaEquipo();
        System.out.println("LISTADO DE EQUIPOS");
        System.out.println("-------------------");
        System.out.println("");
        System.out.println("Codigo \t\tDescripcion \t\t\t\t\t Precio  Estado");

        for (int i = 0; i<equipos.length; i++){
            for(int j = 0; j<4; j++) {
                System.out.print(equipos[i][j]);

            }
            System.out.println("");

        }
        try {
            //utilizamos el metodo sleep para detener la ejecucion del programa unos segundos
            //para asi poder mostrar los datos que se ingresan.
            //como es un metodo de la clase thread va a acompañado del try y catch
            Thread.sleep(2 * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}