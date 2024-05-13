import java.util.Scanner;

public class TestedeSelecao {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite 4 valores: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        if (b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0) {
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");
        }
        s.close();
    }
}
