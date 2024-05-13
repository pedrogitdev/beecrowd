import java.util.Scanner;

public class Ex1101 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int soma = 0;
        while (true) {
            int num = s.nextInt();
            int num2 = s.nextInt();
            if (num2 < num) {
                System.out.println(num2);
                num2++;
            }
            if (num2 <= 0 || num <= 0) {
                break;
            }
            System.out.println(soma);
        }
    }
}
