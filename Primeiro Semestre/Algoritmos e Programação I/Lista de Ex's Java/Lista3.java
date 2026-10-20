import java.text.Normalizer;
import java.util.Random;
import java.util.Scanner;
// Salve professor! Essa lista eu quis fazer bem mais completinha pois eu queria treinar mais, 
// então cheguei até pesquisar certas funções diferentes que o java tem para fazer certas coisas que
// será possível observar ao longo da lista, como o uso do Runnable :D
public class Lista3 {
    // Váriaveis Globais
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    // ---------- MÉTODOS PRINCIPAL (MENU) ----------
    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("========== LISTA DE EXERCÍCIOS 3 ==========");
            System.out.println("Digite o número do exercício desejado (1 a 23) ou 0 para sair:");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1 -> loopEx(Lista3::ex01);
                case 2 -> loopEx(Lista3::ex02);
                case 3 -> loopEx(Lista3::ex03);
                case 4 -> loopEx(Lista3::ex04);
                case 5 -> loopEx(Lista3::ex05);
                case 6 -> loopEx(Lista3::ex06);
                case 7 -> loopEx(Lista3::ex07);
                case 8 -> loopEx(Lista3::ex08);
                case 9 -> loopEx(Lista3::ex09);
                case 10 -> loopEx(Lista3::ex10);
                case 11 -> loopEx(Lista3::ex11);
                case 12 -> loopEx(Lista3::ex12);
                case 13 -> loopEx(Lista3::ex13);
                case 14 -> loopEx(Lista3::ex14);
                case 15 -> loopEx(Lista3::ex15);
                case 16 -> loopEx(Lista3::ex16);
                case 17 -> loopEx(Lista3::ex17);
                case 18 -> loopEx(Lista3::ex18);
                case 19 -> loopEx(Lista3::ex19);
                case 20 -> loopEx(Lista3::ex20);
                case 21 -> loopEx(Lista3::ex21);
                case 22 -> loopEx(Lista3::ex22);
                case 23 -> loopEx(Lista3::ex23);
                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.print("Opção inválida!");
            }
        } while (opcao != 0);
    }

    // ---------- MÉTODOS AUXILIARES ----------
    // Método auxiliar para repetir os exercícios
    // e não precisar fazer essa lógica de repetição em CADA metódo/exercício
    public static void loopEx(Runnable exercicio) {
        int opcao;
        do {
            exercicio.run(); // Executa o exercício em questão, depois mostra a messagem abaixo:
            System.out.println("\n---------- FIM DO EXERCÍCIO ----------");
            System.out.println("O que deseja fazer agora?");
            System.out.println("1 - Repetir o último exercício escolhido");
            System.out.println("2 - Escolher outro exercício para testar"); // Redundante pois qualquer número sem ser 1 ou 3 vai fazer isso mas ok
            System.out.println("3 - Encerrar o programa");
            // Seria loucura colocar uma quarta opção pra crashar o pc?
            System.out.print("Resposta: ");
            opcao = sc.nextInt();
            if (opcao == 3) {
                System.out.println("Encerrando o programa...");
                System.exit(0); // Para o programa todo normalmente
            }
        } while (opcao == 1); // Se for 1, começa tudo de novo.
    }

    // ---------- QUESTÕES ----------
    // Peça ao usuário para digitar caracteres um a um. 
    // Quando ele digitar um ponto final (.), pare a leitura e informe quantos caracteres foram digitados.
    public static void ex01() {
        char caractere;
        int contador = 0;
        System.out.println("---------- EXERCÍCIO 01 ----------");
        System.out.println("Digite caracteres mas apenas um por vez.");
        System.out.println("Ou digite apenas \".\" para parar e contar os caracteres digitados): ");
        do { 
            caractere = sc.next().charAt(0);
            contador++;
        } while (caractere != '.');
        System.out.printf("Foram digitados %d caracteres", --contador);
    }

    // Peça uma palavra e conte quantas vogais ela contém (sem usar array, apenas com repetição e charAt).
    public static void ex02 () {
        String palavra;
        int qtdVogais = 0;
        sc.nextLine(); // Limpando buffer
        System.out.println("---------- EXERCÍCIO 02 ----------");
        System.out.print("Digite uma palavra: ");
        palavra = sc.nextLine().toLowerCase();
        palavra = Normalizer.normalize(palavra, Normalizer.Form.NFD).replaceAll("\\p{M}", ""); // Para tranformar letras com acentos em normais
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
        System.out.println("---------- EXERCÍCIO 03 ----------");
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
        System.out.println("Quantas vezes você quer que essa palavra seja repetida?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(palavra);
        } 
    }

    // Leia frases do usuário em loop. Quando ele digitar "sair", o programa termina.   
    public static void ex04 () {
        sc.nextLine(); // Limpando buffer
        System.out.println("---------- EXERCÍCIO 04 ----------");
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        while (!frase.equalsIgnoreCase("sair")) { 
            System.out.printf("Você disse: \"%s\"\n", frase);
            System.out.print("Digite outra frase (ou \"sair\" para parar o ex.): ");
            frase = sc.nextLine();
        }
        System.out.println("Você digitou \"sair\", até logo!");
    }

    // Continue pedindo um nome até que o usuário digite algo com pelo menos 3 letras.  
    public static void ex05 () {
        sc.nextLine(); // Limpando buffer
        System.out.println("---------- EXERCÍCIO 05 ----------");
        System.out.print("Digite um nome: ");
        String nome = sc.nextLine();
        int tamanho = nome.length();
        while (tamanho < 3) { 
            System.out.print("O nome precisa ter pelo menos 3 letras, digite novamente: ");
            nome = sc.nextLine();
            tamanho = nome.length();
        }
        System.out.printf("O nome digitado foi: \"%s\"", nome);
    }

    // Solicite uma senha e peça confirmação até que ambas coincidam.
    public static void ex06 () {
        sc.nextLine(); // Limpando buffer
        System.out.println("---------- EXERCÍCIO 06 ----------");
        System.out.print("Digite uma senha: ");
        String senha = sc.nextLine();
        System.out.printf("Confirme a senha: ");
        String confirmarSenha = sc.nextLine();
        while (!confirmarSenha.equals(senha)) { 
            System.out.println("Acesso negado!");
            System.out.print("Confirme a senha novamente: ");
            confirmarSenha = sc.nextLine();
        }
        System.out.println("Acesso liberado!");
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