import java.util.Scanner;

public class EgFundamentos {

    public static void main(String[] args) {
        // O try-with-resources gerencia o ciclo de vida do Scanner, fechando-o automaticamente ao final
        try (Scanner sc = new Scanner(System.in)) {
            int opcao;

            do {
                System.out.println("\n=== FUNDAMENTOS DE JAVA: MENU DE EXEMPLOS ===");
                System.out.println("1 - Saída de Dados e Caracteres de Escape (Hello World)");
                System.out.println("2 - Tipos Primitivos, Textos, ASCII e Unicode (Variáveis)");
                System.out.println("3 - Entrada de Dados Textuais via Console (Scanner e nextLine)");
                System.out.println("4 - Leitura Numérica e Operação Aritmética (Soma de Decimais)");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção didática: ");

                opcao = sc.nextInt();
                sc.nextLine(); // Limpa o buffer do teclado após ler número

                switch (opcao) {
                    case 1:
                        exemploSaidaEEscapes();
                        break;
                    case 2:
                        exemploTiposVariaveis();
                        break;
                    case 3:
                        exemploEntradaTexto(sc);
                        break;
                    case 4:
                        exemploSomaNumeros(sc);
                        break;
                    case 0:
                        System.out.println("\nEncerrando o programa de fundamentos...");
                        break;
                    default:
                        System.out.println("\nOpção inválida! Tente novamente.");
                }

            } while (opcao != 0);
        }
    }

    // =========================================================================
    // 1. SAÍDA DE DADOS E CARACTERES DE ESCAPE
    // =========================================================================
    /**
     * Apresenta os comandos básicos de impressão no console e o uso
     * de sequências de escape como o '\n' para quebras de linha manuais.
     */
    public static void exemploSaidaEEscapes() {
        System.out.println("\n--- [1] Saída Básica e Caracteres de Escape ---");
        
        // System.out.println imprime o texto e pula para a próxima linha automaticamente
        System.out.println("Hello World!");
        System.out.println("I am learning Java!");
        
        // O escape '\n' insere uma quebra de linha explícita dentro da própria String
        System.out.println("Look at this\n line break!");
    }

    // =========================================================================
    // 2. TIPOS DE VARIÁVEIS, TABELA ASCII E UNICODE
    // =========================================================================
    /**
     * Demonstra declaração e inicialização de tipos de dados primitivos e referências:
     * - int: números inteiros
     * - double: números reais (ponto flutuante)
     * - String: texto (objeto de referência)
     * - char: caractere único por literal, código ASCII decimal ou escape Unicode
     */
    public static void exemploTiposVariaveis() {
        System.out.println("\n--- [2] Declaração e Utilização de Variáveis ---");

        // Declaração de tipos de dados comuns
        int idade = 20;              // Armazena inteiros de 32 bits
        String turma = "Turma A";    // Cadeia de caracteres (classe/objeto)
        double preco = 9.99;         // Ponto flutuante de dupla precisão

        // Formas de atribuir valores ao tipo primitivo char:
        char letra = 'a';            // 1. Literal direto entre aspas simples
        char letra2 = 66;            // 2. Valor decimal na tabela ASCII (66 corresponde à letra 'B')
        char letra3 = '\uA78D';      // 3. Código hexadecimal no padrão Unicode

        // Concatenação de texto com caractere Unicode (código '\u30C4' = 'ツ')
        System.out.println("Variáveis " + '\u30C4');
        System.out.println("Idade (int): " + idade);
        System.out.println("Turma (String): " + turma);
        System.out.println("Preço (double): " + preco);
        System.out.println("Caractere literal (char): " + letra);
        System.out.println("Caractere por código ASCII (char 66): " + letra2);
        System.out.println("Caractere Unicode (\\uA78D): " + letra3);
    }

    // =========================================================================
    // 3. ENTRADA DE DADOS TEXTUAIS VIA SCANNER
    // =========================================================================
    /**
     * Mostra como capturar entradas do teclado via System.in usando o método
     * nextLine() da classe Scanner, além da concatenação com mensagens de saída.
     */
    public static void exemploEntradaTexto(Scanner sc) {
        System.out.println("\n--- [3] Leitura de Texto via Scanner ---");
        System.out.print("Insira seu nome: ");
        
        // nextLine() captura toda a linha digitada pelo usuário até o Enter
        String nome = sc.nextLine();

        // Concatenação da mensagem com a variável lida
        System.out.println("Olá " + nome + "!");
    }

    // =========================================================================
    // 4. LEITURA NUMÉRICA E CÁLCULO ARITMÉTICO
    // =========================================================================
    /**
     * Demonstra a captura de números decimais com nextDouble(), declaração de
     * variáveis de mesmo tipo em linha única e execução de operação de soma (+).
     */
    public static void exemploSomaNumeros(Scanner sc) {
        System.out.println("\n--- [4] Leitura Numérica e Soma ---");
        
        // Declaração múltipla de variáveis do mesmo tipo
        double num1, num2, soma;

        System.out.print("Informe o primeiro número: ");
        num1 = sc.nextDouble(); // Lê o primeiro valor double

        System.out.print("Informe o segundo número: ");
        num2 = sc.nextDouble(); // Lê o segundo valor double

        // Processamento aritmético
        soma = num1 + num2;

        // Exibição do resultado final
        System.out.println("A soma dos dois números deu: " + soma);
    }
}