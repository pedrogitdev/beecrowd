import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class tempojogo {
 
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int hora = s.nextInt();
        int hora2 = s.nextInt();
        if (hora < hora2) {
            int tempoDecorrido = hora2 - hora;
            System.out.println(	"O JOGO DUROU "+tempoDecorrido+" HORA(S)");
        } else {
            int dia2 = (24 - hora) + hora2;
            System.out.println("O JOGO DUROU "+dia2+" HORA(S)");
        }
        s.close();
    }
 
}