package menuconclases;

import java.util.Scanner;

public class Menu {
    
    static final int    SALIR_MENU  = 3;
    static final int    SALIR_FUNC  = 0;
    static Pares               npar        = new Pares();
    static Primos              nprim       = new Primos();
    
    public void mostrarMenu() {
        limpiarPantalla();
        System.out.println("JAVA CONSOLA");
        System.out.println("1. Num Pares");
        System.out.println("2. Num Primo");
        System.out.println("3. Salir");
        System.out.println("Seleccione opcion [1-3] : ");
    }

    public void ejecutarMenu(int menu) {
        int desde, hasta;
        Scanner scn = new Scanner(System.in);

        limpiarPantalla();

        switch (menu) {
            case 1:
                System.out.println("Escriba el numero de comienzo");
                desde = scn.nextInt();
                System.out.println("Escriba el numero de fin");
                hasta = scn.nextInt();

                npar.numerosPares(desde, hasta);
                break;

            case 2:
                System.out.println("Escriba el numero de comienzo");
                desde = scn.nextInt();
                System.out.println("Escriba el numero de fin");
                hasta = scn.nextInt();

                nprim.numerosPrimos(desde, hasta);
                break;
        }
    }

    public void continuar() {
        Scanner scn = new Scanner(System.in);
        int continuar = 1;

        do {
            System.out.println("\n\nPulse 0 para continuar...");
            continuar = scn.nextInt();
        } while (continuar != SALIR_FUNC);

        limpiarPantalla();
    }
    
    public void limpiarPantalla() {
        for (int i = 0; i <= 25; i++) {
            System.out.println();
        }
    }
}
