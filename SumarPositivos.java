
import java.util.Scanner;

public class SumarPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int num;

        System.out.println("Ingrese números (0 para salir):");

        while (true) {
            num = sc.nextInt();

            if (num == 0) break;
            if (num < 0) continue;

            suma += num;
        }

        System.out.println("Suma de positivos: " + suma);
    }
}
