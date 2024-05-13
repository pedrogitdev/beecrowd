import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int resultado1 = num1 * 2;
        int resultado2 = num1 * 3;
        int resultado3 = num1 * 4;
        int resultado4 = num1 * 5;
        int resultado5 = num1 * 6;
        int resultado6 = num1 * 7;
        int resultado7 = num1 * 8;
        int resultado8 = num1 * 9;
        int resultado9 = num1 * 10;
        System.out.println("1 X "+num1+" = 1");
        System.out.println("2 X "+num1+" = "+resultado1);
        System.out.println("3 X "+num1+" = "+resultado2);
        System.out.println("4 X "+num1+" = "+resultado3);
        System.out.println("5 X "+num1+" = "+resultado4);
        System.out.println("6 X "+num1+" = "+resultado5);
        System.out.println("7 X "+num1+" = "+resultado6);
        System.out.println("8 X "+num1+" = "+resultado7);
        System.out.println("9 X "+num1+" = "+resultado8);
        System.out.println("10 X "+num1+" = "+resultado9);
        s.close();
    }
}
