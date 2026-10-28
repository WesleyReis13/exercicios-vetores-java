import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome para inverter: ");
        String nome = scanner.nextLine();

        // Convertendo para vetor de caracteres
        char[] caracteres = nome.toCharArray();

        // Invertendo o vetor usando variável auxiliar
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            char auxiliar = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = auxiliar;

            inicio++;
            fim--;
        }

        // Exibindo o resultado convertido de volta para String
        String nomeInvertido = new String(caracteres);
        System.out.println("Nome invertido: " + nomeInvertido);

        scanner.close();
    }
}
