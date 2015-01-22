/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuconclases;

/**
 *
 * @author openjob
 */
public class Pares {
    static Menu m = new Menu();
    
    public void numerosPares(int desde, int hasta) {
        m.limpiarPantalla();
        System.out.println("Numeros pares desde " + desde + " hasta " + hasta);

        for (int i = desde; i <= hasta; i++) {
            if (esPar(i)) {
                System.out.print(i + " ");
            }
        }

        m.continuar();
    }
    
    public boolean esPar(int valor) {
        boolean par = false;

        if (valor % 2 == 0) {
            par = true;
        }

        return par;
    }
}
