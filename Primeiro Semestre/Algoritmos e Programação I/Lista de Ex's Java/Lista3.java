import java.util.Scanner;

public class Lista3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao;
        do {
                System.out.println("\n=== LISTA DE EXERCÍCIOS ===");
                System.out.println("Digite o número do exercício (1 a 23) ou 0 para sair:");
                System.out.print("Opção: ");
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1 -> ex01();
                    case 2 -> ex02();
                    case 3 -> ex03();
                    case 4 -> ex04();
                    case 5 -> ex05();
                    case 6 -> ex06();
                    case 7 -> ex07();
                    case 8 -> ex08();
                    case 9 -> ex09();
                    case 10 -> ex10();
                    case 11 -> ex11();
                    case 12 -> ex12();
                    case 13 -> ex13();
                    case 14 -> ex14();
                    case 15 -> ex15();
                    case 16 -> ex16();
                    case 17 -> ex17();
                    case 18 -> ex18();
                    case 19 -> ex19();
                    case 20 -> ex20();
                    case 21 -> ex21();
                    case 22 -> ex22();
                    case 23 -> ex23();
                    case 0 -> System.out.println("Encerrando programa...");
                    default -> System.out.println("Opção inválida!");
                }
            } while (opcao != 0);
    }

    // Peça ao usuário para digitar caracteres um a um. Quando o mesmo digitar um ponto final (.)
    // o programa para a leitura e informe quantos caracteres foram digitados.
    public static void ex01 () {
        char caractere;
        int contador = 0;
        do { 
            System.out.println("Digite um ou vários caracteres: ");
            caractere = sc.next().charAt(0);
            contador++;
        } while (caractere != '.');
        System.out.printf("Foram digitados %d caracteres", --contador);
    }

    // Peça uma palavra e conte quantas cogais ela contém (sem usar array, apenas com repetição e charAt).
    public static void ex02 () {
        String palavra;
        int qtdVogais = 0;
        sc.nextLine(); // Limpando buffer
        System.out.println("Digite uma palavra: ");
        palavra = sc.nextLine().toLowerCase();
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                qtdVogais++;
            } 
        }
        System.out.printf("Quantidade de vogais da palavra \"%s\": %d", palavra, qtdVogais);
        System.out.println("\n\nAperte Enter para voltar para o menu...");
        sc.nextLine();
    }

    // placeholder
    public static void ex03 () {

    }

    // placeholder
    public static void ex04 () {

    }

    // placeholder
    public static void ex05 () {

    }

    // placeholder
    public static void ex06 () {

    }

    // placeholder
    public static void ex07 () {

    }

    // placeholder
    public static void ex08 () {

    }

    // placeholder
    public static void ex09 () {

    }

    // placeholder
    public static void ex10 () {

    }

    // placeholder
    public static void ex11 () {

    }

    // placeholder
    public static void ex12 () {

    }

    // placeholder
    public static void ex13 () {

    }

    // placeholder
    public static void ex14 () {

    }

    // placeholder
    public static void ex15 () {

    }

    // placeholder
    public static void ex16 () {

    }

    // placeholder
    public static void ex17 () {

    }

    // placeholder
    public static void ex18 () {

    }

    // placeholder
    public static void ex19 () {

    }

    // placeholder
    public static void ex20 () {

    }

    // placeholder
    public static void ex21 () {

    }

    // placeholder
    public static void ex22 () {

    }

    // placeholder
    public static void ex23 () {

    }

    
}