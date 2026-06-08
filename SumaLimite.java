import java.util.Scanner;

public class SumaLimite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int limite;

        System.out.print("Ingrese límite: ");
        limite = sc.nextInt();

        for (int i = 1; ; i++) {
            suma += i;

            if (suma > limite) {
                System.out.println("Se superó con suma: " + suma);
                break;
            }
        }
    }
}
