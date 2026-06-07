
import java.util.Scanner;

public class SalirNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Ingrese números (negativo para salir):");

        while (true) {
            num = sc.nextInt();
            if (num < 0) break;

            System.out.println("Ingresado: " + num);
        }

        System.out.println("Se detectó un número negativo. Fin.");
    }
}
