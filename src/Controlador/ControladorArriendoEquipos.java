package Controlador;

import Modelo.Cliente;
import Modelo.Equipo;

import java.util.ArrayList;

public class ControladorArriendoEquipos {
    //basicamente, el controlador crea, guarda y retorna datos de los Objetos
    //crea objetos basandose en los datos dados por UI
    //guarda los objetos dentro de ArrayList's
    //retorna los datos en formato String[][]

    //creación de array's
    ArrayList<Cliente> mochilaDeClientes = new ArrayList<>();
    ArrayList<Equipo> mochilaDeEquipos = new ArrayList<>();
    //instance y constructor privado
    private static ControladorArriendoEquipos instance=new ControladorArriendoEquipos();
    private ControladorArriendoEquipos(){}
    //getInstance()
    public static ControladorArriendoEquipos getInstance(){
        return instance;
    }
    //metodos
    public void creaCliente(String rut, String nom, String dir, String tel){
        //crea el cliente y llena info
        Cliente clienteNuevo = new Cliente(rut, nom, tel, dir);
        //agregarlo al arreglo
        mochilaDeClientes.add(clienteNuevo);
    }
    public void creaEquipo(String cod, String desc, long precio){
        //crea el equipo y llena info
        long code =Long.parseLong(cod);
        Equipo equipoNuevo = new Equipo(code, desc, precio);
        //agregarlo al arreglo
        mochilaDeEquipos.add(equipoNuevo);
    }

    public String[][] listaClientes(){
        //crea un String[][] con todos los datos de clientes
        String[][] bolsaClientes = new String[mochilaDeClientes.size()][5];
        int contador = 0;
        for (Cliente elCliente : mochilaDeClientes) {
            //[0]: rut, [1]: nombre, [2]: dirección, [3]: telefono, [4]: estado
            bolsaClientes[contador][0] = elCliente.getRut();
            bolsaClientes[contador][1] = elCliente.getNombre();
            bolsaClientes[contador][2] = elCliente.getDireccion();
            bolsaClientes[contador][3] = elCliente.getTelefono();
            String activ;
            if (elCliente.isActivo()){
                activ = "Activo";
            }
            else{
                activ = "Inactivo";
            }
            bolsaClientes[contador][4] = activ;
            contador++;
        }
        return bolsaClientes;
    }
    public String[][] listaEquipo(){
        //crea un String[][] con todos los datos de equipos
        String[][] bolsaEquipos = new String[mochilaDeEquipos.size()][4];
        int contador = 0;
        String estad;
        for (Equipo elEquipo : mochilaDeEquipos) {
            //[0]: código, [1]: descripción, [2]: precio, [3]: estado
            bolsaEquipos[contador][0] = ("" + elEquipo.getCódigo());
            bolsaEquipos[contador][1] = elEquipo.getDescripción();
            bolsaEquipos[contador][2] = ("" + elEquipo.getPrecioArriendoDia());
            switch (elEquipo.getEstado()){
                case OPERATIVO:
                    estad = "operativo";
                    break;
                case EN_REPARACION:
                    estad = "en reparación";
                    break;
                case DADO_DE_BAJA:
                    estad = "dado de baja";
                    break;
                default:
                    estad = "no inicializado";
            }
            bolsaEquipos[contador][3] = estad;
            contador++;
        }
        return bolsaEquipos;
    }
}
