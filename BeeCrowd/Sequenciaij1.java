
public class Sequenciaij1 {
    public static void main(String[] args) {
        int i = 1;
        int j = 60;
        while (true) {
            System.out.println("I="+i+" J="+j);
            i += 3;
            j -= 5;
            if (j == -5) {
                break;
            }
        }
    }
}
