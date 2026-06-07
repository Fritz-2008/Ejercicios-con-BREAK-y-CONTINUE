import java.util.Scanner;

public class BuscarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {5, 10, 15, 20, 25};

        System.out.print("Número a buscar: ");
        int buscado = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == buscado) {
                System.out.println("Encontrado en posición: " + i);
                break;
            }
        }
    }
}
