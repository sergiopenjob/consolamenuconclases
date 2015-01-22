package menuconclases;

public class Primos {
    Menu m = new Menu();
    
    public void numerosPrimos(int desde, int hasta) {
        m.limpiarPantalla();
        System.out.println("Numeros primos desde " + desde + " hasta " + hasta);

        for (int i = desde; i <= hasta; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }

        m.continuar();
    }
    
    public boolean esPrimo(int valor) {
        int num = 2;
        boolean primo = true;

        while (primo && num < valor) {
            if (valor % num == 0) {
                primo = false;
            }

            num++;
        }

        return primo;
    }
}
