import java.text.DecimalFormat;
import java.util.Scanner;

public class maior {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat ftd = new DecimalFormat("0");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        double maiorab = (num1 + num2 + Math.abs(num1 - num2)) / 2;
        if (maiorab > num3) {
            System.out.println(ftd.format(maiorab)+" eh o maior");
        }
        if (maiorab < num3) {
            System.out.println(num3+" eh o maior");
        }
        s.close();
    }
}
