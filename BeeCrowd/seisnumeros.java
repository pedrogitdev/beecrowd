import java.util.Scanner;

public class seisnumeros {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for (int i = 0; i < 6; i++) {
            if (num % 2 == 0) {
                num++;
                System.out.println(num);
            }
            if (num % 2 != 0) {
                System.out.println(num);
                num += 2;
            }
        }
    }
}
