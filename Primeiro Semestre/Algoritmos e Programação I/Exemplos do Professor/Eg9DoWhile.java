import java.util.Random;
import java.util.Scanner;

public class Eg9DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Digite o número correspondente ao método desejado: ");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1, 2 -> tabuada1(sc);
            case 3 -> adivinhando1(rand);
            case 4 -> adivinhando2(sc, rand);
            case 5 -> exemploContinue();
            case 6 -> questaoRea1();
            case 7 -> questaoRea2();
        }
    }

    public static void tabuada1(Scanner sc) {
        System.out.println("Digite um número e um limite");
        int numero = sc.nextInt();
        int limite = sc.nextInt();
        int m = 1;
        while (m <= limite) { 
            System.out.printf("%2d x %2d = %3d%n", numero, m, numero * m);
            m++;
        }
    }

    public static void tabuada2 (Scanner sc) {
        System.out.println("Digite um número e um limite");
        int numero = sc.nextInt();
        int limite = sc.nextInt();
        int m = 1;
        do { 
            System.out.printf("%2d x %2d = %3d%n", numero, m, numero * m);
            m++;
        } while (m <= limite);
    }

    public static void adivinhando1 (Random rand) {
        int segredo, palpite = 0, tentativa = 0;

        // Gera um valor aleatório entre 1 e 1000
        segredo = rand.nextInt(1, 1001);
        while (palpite != segredo) { 
            System.out.println("Tentativa: " + tentativa);
            palpite = rand.nextInt();
            System.out.println("Palpite da vez: " + palpite);
            tentativa++;

            // Usando Runtime para abrir um notepad a cada tentativa (vai travar o pc, não descomente o trecho abaixo kkkkk)
            // Runtime.getRuntime().exec("notepad");
        }
        System.out.printf("%d tentativa(s)%n", tentativa);
        System.out.println("O número era " + segredo);
    }

    public static void adivinhando2 (Scanner sc, Random rand) {
        int numero;
        do { 
            System.out.println("Informe um número de 1 a 100");
            numero = sc.nextInt();
        } while (numero < 1 || numero > 100);
    }

    public static void exemploContinue() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void questaoRea1 () {
        int valor = 10, i = 0;
        while (valor !=25) { 
            valor += 2;
            valor--;
            i--;
        }
        System.out.println(valor);
        System.out.println(i);
    }

    public static void questaoRea2 () {
        int cont = 0;
        for (int i = 0; i < 10; i+=2) 
            for (int j = i; j < 10; j+=3) 
                cont++;
        System.out.println(cont);
        
    }
}