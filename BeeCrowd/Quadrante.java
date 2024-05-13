import java.util.Scanner;

public class Quadrante {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            int numero1 = s.nextInt();
            int numero2 = s.nextInt();
            if (numero1 > 0 && numero2 > 0) {
                System.out.println("Pprimeiro");
            }
            if (numero1 < 0 && numero2 > 0) {
                System.out.println("segundo");
            }
            if (numero1 < 0 && numero2 < 0) {
                System.out.println("terceiro");
            }
            if (numero1 > 0 && numero2 < 0) {
                System.out.println("quarto");
            }
            if (numero1 == 0 || numero2 == 0) {
                break;
            }
        }
    }
}
