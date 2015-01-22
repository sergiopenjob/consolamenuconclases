package menuconclases;

import static menuconclases.Menu.SALIR_MENU;
import java.util.Scanner;
        
public class Main {
    static int     menu = 0;
    static Menu    m    = new Menu();
    static Scanner scn  = new Scanner(System.in);
        
    public static void main(String[] args) {
        do {
            m.mostrarMenu();
            menu = scn.nextInt();
            m.ejecutarMenu(menu);
        } while (menu != SALIR_MENU);

        System.out.println("Hasta luego!");
    }
}