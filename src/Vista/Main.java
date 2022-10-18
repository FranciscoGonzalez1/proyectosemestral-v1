package Vista;
import Modelo.Cliente;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        UIArriendoEquipos instaMenu = UIArriendoEquipos.getInstance();
        instaMenu.menu();
    }
}
