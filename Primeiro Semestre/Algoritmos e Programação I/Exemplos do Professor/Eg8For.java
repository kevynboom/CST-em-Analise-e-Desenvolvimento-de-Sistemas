import java.util.Random;
import java.util.Scanner;

public class Eg8For {

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
    public static void exibirPares() {
        for (int num = 100; num <= 1000; num += 2) {
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

    // Desenhar quadrados cheios e vazios
    public static void desenhaQuadradoCheio(int tamanho) {
        for (int linha = 1; linha <= tamanho; linha++) {
            for (int coluna = 1; coluna <= tamanho; coluna++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void desenhaQuadradoVazio(int tamanho) {
        for (int linha = 1; linha <= tamanho; linha++) {
            for (int coluna = 1; coluna <= tamanho; coluna++) {
                if (linha == 1 || linha == tamanho || coluna == 1 || coluna == tamanho) {
                    System.out.print("*");
                } else {
                    System.out.print("");
                }
            }
            System.out.println("");
        }
    }

    // Exemplo de utilização dos métodos de desenho
    public static void exemploQuadrados() {
        int tamanho = 5;

        desenhaQuadradoCheio(tamanho);
        System.out.println("");
        desenhaQuadradoVazio(tamanho);
    }

    // Descobrir a idade média em uma pesquisa com visitantes
    public static void exemploIdades() {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int idade, qtd, qtdMenor, qtdMaior = 0, media = 0;

        System.out.println("Quantos visitantes responderão à pesquisa?");
        qtd = sc.nextInt();

        for (int i = 1; i < qtd; i++) {
            System.out.println("Informe a idade do visitante " + i);

            idade = rand.nextInt(0, 131);

            if (idade >= 18) {
                qtdMaior++;
            }

            media += idade;
        }

        media /= qtd;
        qtdMenor = qtd - qtdMaior;

        System.out.printf("A média de idade dos visitantes é de %d.%n", media);
        System.out.printf("%d dos visitantes são maiores de idade.%n", qtdMaior);
        System.out.printf("%d dos visitantes são menores de idade.%n", qtdMenor);
    }
}