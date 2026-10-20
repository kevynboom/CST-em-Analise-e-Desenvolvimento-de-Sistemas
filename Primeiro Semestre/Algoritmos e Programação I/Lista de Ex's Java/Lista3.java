import java.util.Random;
import java.util.Scanner;

public class Lista3 {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    public static void main(String[] args) {
        int opcao;
        do {
                System.out.println("\n=== LISTA DE EXERCÍCIOS ===");
                System.out.println("Digite o número do exercício (1 a 23) ou 0 para sair:");
                System.out.print("Opção: ");
                opcao = sc.nextInt();
                switch (opcao) {
                    case 1 -> repetirExercicio(Lista3::ex01);
                    case 2 -> repetirExercicio(Lista3::ex02);
                    case 3 -> repetirExercicio(Lista3::ex03);
                    case 4 -> repetirExercicio(Lista3::ex04);
                    case 5 -> repetirExercicio(Lista3::ex05);
                    case 6 -> repetirExercicio(Lista3::ex06);
                    case 7 -> repetirExercicio(Lista3::ex07);
                    case 8 -> repetirExercicio(Lista3::ex08);
                    case 9 -> repetirExercicio(Lista3::ex09);
                    case 10 -> repetirExercicio(Lista3::ex10);
                    case 11 -> repetirExercicio(Lista3::ex11);
                    case 12 -> repetirExercicio(Lista3::ex12);
                    case 13 -> repetirExercicio(Lista3::ex13);
                    case 14 -> repetirExercicio(Lista3::ex14);
                    case 15 -> repetirExercicio(Lista3::ex15);
                    case 16 -> repetirExercicio(Lista3::ex16);
                    case 17 -> repetirExercicio(Lista3::ex17);
                    case 18 -> repetirExercicio(Lista3::ex18);
                    case 19 -> repetirExercicio(Lista3::ex19);
                    case 20 -> repetirExercicio(Lista3::ex20);
                    case 21 -> repetirExercicio(Lista3::ex21);
                    case 22 -> repetirExercicio(Lista3::ex22);
                    case 23 -> repetirExercicio(Lista3::ex23);
                    case 0 -> System.out.println("Encerrando programa...");
                    default -> System.out.println("Opção inválida!");
                }
            } while (opcao != 0);
    }

    // Método auxiliar para repetir os exercícios.
    // Sim eu pesquisei como uar o Runnable aqui pois não queria fazer a lógica de repetição em CADA metódo/exercício
    public static void repetirExercicio(Runnable exercicio) {
    int opcao;
    do {
        exercicio.run(); // Executa o exercício em questão, depois mostra a mesagem abaixo:
        System.out.println("\n--- FIM DO EXERCÍCIO ---");
        System.out.println("1 - Repetir o exercício");
        System.out.println("0 - Voltar para o menu");
        System.out.print("Opção: ");
        opcao = sc.nextInt();
    } while (opcao == 1); // Se for 1, começa de novo.
}

    // Peça ao usuário para digitar caracteres um a um. 
    // Quando ele digitar um ponto final (.), pare a leitura e informe quantos caracteres foram digitados.
    public static void ex01() {
    char caractere;
        int contador = 0;
        do { 
            System.out.print("Digite apenas um caracter (\".\" para encerrar o programa): ");
            caractere = sc.next().charAt(0);
            contador++;
        } while (caractere != '.');
        System.out.printf("Foram digitados %d caracteres", --contador);
        // Eu tinha achado estranho essa correção pq se digitasse vários caracteres num input, ele só ia contar um,
        // aí quebrei a cabeça pra fazer o código abaixo pra só depois ler que o ex. pede pra digitar caracter um a um apenas...
        // Fica aí como lembrança: 
        //
        // String caracteres;
        // int contador = 0;
        // do {
        //     System.out.print("Digite caracteres (ou '.' para parar): ");
        //     caracteres = sc.next();
        //     for (int i = 0; i < caracteres.length(); i++) {
        //         if (caracteres.charAt(i) == '.') {
        //             System.out.printf("Foram digitados %d caracteres%n", contador);
        //             return;
        //         }
        //         contador++;
        //     }
        // } while (true);
    }

    // Peça uma palavra e conte quantas vogais ela contém (sem usar array, apenas com repetição e charAt).
    public static void ex02 () {
        String palavra;
        int qtdVogais = 0;
        sc.nextLine(); // Limpando buffer
        System.out.print("Digite uma palavra: ");
        palavra = sc.nextLine().toLowerCase();
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                qtdVogais++;
            } 
        }
        System.out.printf("Quantidade de vogais na palavra \"%s\": %d", palavra, qtdVogais);
        
    }

    // Peça uma palavra e um número n. Mostre a palavra repetida n vezes, uma por linha.
    public static void ex03 () {
        sc.nextLine(); // Limpando buffer
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
        System.out.println("Quantas vezes você quer que essa palavra seja repetida?");
        int n = sc.nextInt();
        System.out.printf("Repetindo a palavra %d vezes:\n", n);
        for (int i = 0; i < n; i++) {
            System.out.println(palavra);
        }
        
    }

    // Leia frases do usuário em loop. Quando ele digitar "sair", o programa termina.   
    public static void ex04 () {
        sc.nextLine(); // Limpando buffer
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        while (!frase.equalsIgnoreCase("sair")) { 
            System.out.println("\nVocê disse " + frase);
            System.out.println("\nDigite outra frase: ");
            frase = sc.nextLine();
        }
        System.out.println("Você digitou \"sair\", até logo!");
        
    }

    // Continue pedindo um nome até que o usuário digite algo com pelo menos 3 letras.  
    public static void ex05 () {
        sc.nextLine(); // Limpando buffer
        System.out.print("Digite um nome: ");
        String nome = sc.nextLine();
        int tamanho = nome.length();
        while (tamanho < 3) { 
            System.out.println("\nNome precisa ter pelo menos 3 letras, digite novamente: ");
            nome = sc.nextLine();
            tamanho = nome.length();
        }
        System.out.printf("\nO nome é \"%s\"", nome);
        
    }

    // Solicite uma senha e peça confirmação até que ambas coincidam.
    public static void ex06 () {
        
    }

    // Número fixo oculto. O usuário tem até 5 tentativas para adivinhar.
    public static void ex07 () {

    }

    // Permita votar em três candidatos até que a palavra "\nfim" seja digitada. Conte os votos.
    public static void ex08 () {

    }

    // Simule um caixa eletrônico que permite vários saques até o saldo acabar ou o usuário sair.
    public static void ex09 () {

    }

    // Faça uma pergunta (ex: "Qual a capital do Brasil?") até que o usuário acerte.
    public static void ex10 () {

    }

    // Peça CPF até que seja digitado com exatamente 11 dígitos.
    public static void ex11 () {

    }

    // Faça 5 perguntas em sequência. Conte quantas foram respondidas corretamente.
    public static void ex12 () {

    }

    // Peça uma letra e um número n. Mostre n vezes essa letra em uma mesma linha.
    public static void ex13 () {

    }

    // Simule o lançamento de um dado 10 vezes, mostrando os resultados (use um gerador de números aleatórios).
    public static void ex14 () {

    }

    // Mostre um menu com 3 opções. Repita até o usuário escolher "Sair".
    public static void ex15 () {

    }

    // Peça letras uma a uma até que o usuário digite a letra "x". Conte quantas vezes digitou vogais.
    public static void ex16 () {

    }

    // Permita o cadastro de nome e preço de produtos até que "\nfim" seja digitado. Calcule o total geral.
    public static void ex17 () {

    }

    // Peça uma frase e conte quantas palavras tem (com base nos espaços).
    public static void ex18 () {

    }

    // Repetir senha até ter maiúscula, número e mínimo de 8 caracteres. Use repetição até uma senha válida ser digitada.
    public static void ex19 () {

    }

    // Peça uma palavra e um caractere. Conte quantas vezes o caractere aparece.
    public static void ex20 () {

    }

    // Peça um número entre 1 e 100. Repita enquanto estiver fora do intervalo.
    public static void ex21 () {

    }

    // Peça uma String e some os dígitos presentes (ex: "a2c4" → 6).
    public static void ex22 () {

    }

    // Peça a digitação de um número inteiro até que seja digitado um valor negativo. 
    // Ao digitar um valor negativo, deverão ser exibidos a média dos números digitados, o menor número, o maior número, 
    // quantidade de números pares e quantidade de números ímpares.
    public static void ex23 () {

    }

    
}