import java.util.Scanner;

public class Ex117 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float media = 0;
        float media2 = 0;
        while (true) {
            float nota = s.nextFloat();
            float nota2 = s.nextFloat();
            if (nota < 0 || nota > 10 || nota2 < 0 || nota2 > 10) {
                System.out.println("nota invalida");
            } else{
                media = nota + nota2;
                media2 = media / 2;
                System.out.println("media = "+media2);
            }
        }
    }
}
