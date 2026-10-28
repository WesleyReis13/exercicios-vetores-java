import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Leitura do vetor de números
        System.out.print("Digite a quantidade de números (n) para o vetor: ");
        int n = scanner.nextInt();
        int[] vetor = new int[n];

        System.out.println("Digite os " + n + " números inteiros:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Ordenando o vetor (podemos usar Arrays.sort ou implementar o Bubble Sort)
        // Usaremos Arrays.sort para simplicidade, mas o Bubble Sort também é válido.
        Arrays.sort(vetor);

        System.out.println("\nVetor ordenado: " + Arrays.toString(vetor));

        // 2. Leitura do nome e contagem de vogais
        scanner.nextLine(); // Limpar o buffer
        System.out.print("\nDigite um nome para contar as vogais: ");
        String nome = scanner.nextLine();

        // Convertendo a string para vetor de char e contando as vogais
        char[] letras = nome.toLowerCase().toCharArray();
        int contadorVogais = 0;

        for (char c : letras) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'á' || c == 'é' || c == 'í' || c == 'ó' || c == 'ú' ||
                    c == 'â' || c == 'ê' || c == 'ô' || c == 'ã' || c == 'õ') {
                contadorVogais++;
            }
        }

        System.out.println("O nome \"" + nome + "\" possui " + contadorVogais + " vogais.");
        scanner.close();
    }
}