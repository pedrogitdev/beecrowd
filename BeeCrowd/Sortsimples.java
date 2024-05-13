import java.util.Scanner;
import java.util.Arrays;

public class Sortsimples{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê os três valores inteiros
        int[] numeros = new int[3];
        for (int i = 0; i < 3; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Ordena os números em ordem crescente
        Arrays.sort(numeros);

        // Imprime os números em ordem crescente
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Imprime uma linha em branco
        System.out.println();

        // Imprime os números na sequência em que foram lidos
        for (int numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}
