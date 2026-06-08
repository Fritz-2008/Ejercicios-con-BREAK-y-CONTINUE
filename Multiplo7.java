
import java.util.Scanner;

public class Multiplo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inicio: ");
        int inicio = sc.nextInt();

        System.out.print("Fin: ");
        int fin = sc.nextInt();

        for (int i = inicio; i <= fin; i++) {
            if (i % 7 == 0) {
                System.out.println("Primer múltiplo: " + i);
                break;
            }
        }
    }
}
