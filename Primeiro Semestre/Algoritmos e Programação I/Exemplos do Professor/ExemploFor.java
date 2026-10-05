import java.util.Scanner;

public class ExemploFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int num = sc.nextInt(); 
        if (verificarPrimo(num)) {
            System.out.println("O número é primo!");
        } else {
            System.out.println("O número não é primo...");
        }
    }

    // Exibir somente números pares entre 100 e 1000
    public static void exibirPares () {
        for (int num = 100; num <= 1000; num+=2) {
            System.out.println(num);
        }
    }

    // Verificar se um número é primo
    public static boolean verificarPrimo(int n) {
        int qtdDiv = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                qtdDiv++;
            }
        }
        return qtdDiv <= 2;
    }
}

