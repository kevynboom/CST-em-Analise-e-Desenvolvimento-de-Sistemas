import java.util.Random;
import java.util.Scanner;

public class Eg9While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int segredo, palpite = 0, tentativa = 0;

        // Gera um valor aleatório entre 1 e 1000
        segredo = rand.nextInt(1, 1000);
        while (palpite != segredo) { 
            System.out.println("Tentativa: " + tentativa);
            palpite = rand.nextInt();
            System.out.println("Palpite da vez: " + palpite);
            tentativa++;
        }
        System.out.printf("%d tentativa(s)%n", tentativa);
        System.out.println("O número era " + segredo);

    }

    public static void tabuada(int numero, int limite) {
        int m = 1;
        while (m <= limite) { 
            System.out.printf("%2d x %2d = %3d%n", numero, m, numero * m);
            m++;
        }
    }

}