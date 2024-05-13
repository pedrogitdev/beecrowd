public class SequenciaIj2 {
    public static void main(String[] args) {
        float i = 0;
        float j = 1;
        while (i < 2.1) {
            for (int k = 0; k < 3; k++) {
                if (i != 0 || j != 0) {
                    System.out.printf("I=%.1f J=%.1f%n", i, j);
                } else {
                    System.out.printf("I=%.0f J=%.0f%n", i, j); // Saída formatada para 0, se i e j forem 0
                }
                j++;
            }
            i += 0.2;
            j -= 2.8;
        }
    }
}
