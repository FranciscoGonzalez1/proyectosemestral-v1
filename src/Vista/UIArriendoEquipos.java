package Vista;

import Controlador.ControladorArriendoEquipos;
import Modelo.Cliente;
import Modelo.Equipo;

import java.util.List;
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
            System.out.println("******* SISTEMA DE ARRIENDO DE EQUIPOS DE NIEVE *******");
            System.out.println("");
            System.out.println("1. Crea un nuevo cliente");
            System.out.println("2. Crea un nuevo equipo");
            System.out.println("3. Lista todos los clientes");
            System.out.println("4. Lista todos los equipos");
            System.out.println("5. Salir");
            System.out.println("    Ingrese una opcion");
            elPepe = sc.nextInt();

            if (elPepe < 0 && elPepe > 5) {
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
        System.out.println("Ingrese el rut del cliente");
        String rut = sc.next();
        //el metodo de la clase Scanner next() no admite espacios o enter
        //por lo cual un nextLine() gasta el enter extra
        sc.nextLine();
        System.out.println("Ingrese el nombre del cliente");
        String nombre = sc.nextLine();
        //sc.nextLine();
        System.out.println("Ingrese la direccion del cliente");
        String direccion = sc.nextLine();
        //sc.nextLine();
        System.out.println("Ingrese el numero de telefono del cliente");
        String telefono = sc.next();
        //cuadro de dialogo donde se muestra el cliente ingresado
        System.out.println("Creando un nuevo cliente...");
        System.out.println("Rut: " + rut);
        System.out.println("Nombre: " + nombre);
        System.out.println("Domicilio: " + direccion);
        System.out.println("Telefono: " + telefono);
        try {
            //utilizamos el metodo sleep para detener la ejecucion del programa unos segundos
            //para asi poder mostrar los datos que se ingresan.
            //como es un metodo de la clase thread va a acompañado del try y catch
            Thread.sleep(5*1000);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        controladorArriendoEquipos.creaCliente(rut, nombre, direccion, telefono);
    }
    public void creaEquipo(){
        System.out.println("Ingrese el codigo del equipo");
        String cod = sc.next();
        sc.nextLine();
        System.out.println("Ingrese la descripcion del equipo");
        String desc = sc.nextLine();
        //sc.nextLine();
        System.out.println("Ingrese la cantidad de dias de arriendo");
        Long dias = sc.nextLong();
        System.out.println("Ingrese el precio por dia");
        Long precioDia = sc.nextLong();
        Long precio = dias * precioDia;
        System.out.println("Creando un nuevo equipo...");
        System.out.println("Codigo: " + cod);
        System.out.println("Descripcion: " + desc);
        System.out.println("Precio arriendo por dia: " + precio);
        try {
            //utilizamos el metodo sleep para detener la ejecucion del programa unos segundos
            //para asi poder mostrar los datos que se ingresan.
            //como es un metodo de la clase thread va a acompañado del try y catch
            Thread.sleep(5*1000);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        controladorArriendoEquipos.creaEquipo(cod, desc, precio);
    }
    public void listaCliente(){
        //llamo la lista de clientes desde la clase controlador arriendos de equipos con la instancia del controlador
        //desde ahi llamo el metodo getclientes para obtener los clientes
        List<Cliente> clientes = controladorArriendoEquipos.getClientes();
        System.out.println("LISTADO DE CLIENTES");
        System.out.println("-------------------");
        System.out.println("");
        System.out.println("Rut          Nombre \t\t\t Direccion \t\t\t Telefono     Estado");
        for (int i = 0; i<clientes.size(); i++){
            /*
            clientes.get(i).getNombre();
            clientes.get(i).getDireccion();
            clientes.get(i).getRut();
            clientes.get(i).getTelefono();
            */
            System.out.println(
                    "" + clientes.get(i).getRut() + " " +
                            "" + clientes.get(i).getNombre() + "\t " +
                            "" + clientes.get(i).getDireccion() + "\t " +
                            "" + clientes.get(i).getTelefono() + "  ");
            try {
                //utilizamos el metodo sleep para detener la ejecucion del programa unos segundos
                //para asi poder mostrar los datos que se ingresan.
                //como es un metodo de la clase thread va a acompañado del try y catch
                Thread.sleep(5*1000);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public void listaEquipos(){
        //llamo la lista de equipos desde la clase controlador arriendos de equipos con la instancia del controlador
        //desde ahi llamo el metodo getequipos para obtener los equipos
        List<Equipo> equipos = controladorArriendoEquipos.getEquipos();
        System.out.println("LISTADO DE EQUIPOS");
        System.out.println("-------------------");
        System.out.println("");
        System.out.println("Codigo \t\tDescripcion \t\t\t\t\t Precio  Estado");
        for (int i = 0; i<equipos.size(); i++){
            /*
            equipos.get(i).getCodigo();
            equipos.get(i).getDescripcion();
            equipos.get(i).getPrecioArriendoDia();
            equipos.get(i).getEstado();
            */
            System.out.println(
                    "" + equipos.get(i).getCodigo() + " \t" +
                            "" + equipos.get(i).getDescripcion() + " \t\t\t " +
                            "" + equipos.get(i).getPrecioArriendoDia() + "  ");
            try {
                //utilizamos el metodo sleep para detener la ejecucion del programa unos segundos
                //para asi poder mostrar los datos que se ingresan.
                //como es un metodo de la clase thread va a acompañado del try y catch
                Thread.sleep(5*1000);
            }
            catch (Exception e) {
                System.out.println(e);
            }

        }
    }

}