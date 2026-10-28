import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos (n) do vetor: ");
        int n = scanner.nextInt();
        double[] vetor = new double[n];

        System.out.println("Digite os " + n + " números inteiros:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }


        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                vetor[i] = vetor[i] * 2;
            } else {
                vetor[i] = Math.pow(vetor[i], 2);
            }
        }


        System.out.println("\nNovo vetor após aplicar a regra:");
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print((int) vetor[i]);
            if (i < n - 1) System.out.print(", ");
        }
        System.out.println("]");

        scanner.close();
    }
}