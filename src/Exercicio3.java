import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome para inverter: ");
        String nome = scanner.nextLine();


        char[] caracteres = nome.toCharArray();


        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            char auxiliar = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = auxiliar;

            inicio++;
            fim--;
        }


        String nomeInvertido = new String(caracteres);
        System.out.println("Nome invertido: " + nomeInvertido);

        scanner.close();
    }
}
