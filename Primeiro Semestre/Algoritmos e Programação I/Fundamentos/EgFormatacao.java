import java.util.Scanner;

public class EgFormatacao {

    public static void main(String[] args) {
        // Bloco try-with-resources garante o fecho do Scanner
        try (Scanner sc = new Scanner(System.in)) {
            int opcao;

            do {
                System.out.println("\n=== MENU: FORMATAÇÃO DE SAÍDA (PRINTF) ===");
                System.out.println("1 - Formatação Básica (Textos, Caracteres e Inteiros)");
                System.out.println("2 - Formatação de Decimais (Arredondamento e Moeda)");
                System.out.println("3 - Alinhamento e Preenchimento (Zeros à esquerda e Espaçamento)");
                System.out.println("4 - Exemplo Prático: Gerador de Tabela Formatada");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = sc.nextInt();
                sc.nextLine(); // Limpeza do buffer

                switch (opcao) {
                    case 1 -> exemploBasico();
                    case 2 -> exemploDecimais();
                    case 3 -> exemploAlinhamentoEPadding();
                    case 4 -> exemploTabelaPratica();
                    case 0 -> System.out.println("\nEncerrando o módulo de formatação...");
                    default -> System.out.println("\nOpção inválida! Tente novamente.");
                }

            } while (opcao != 0);
        }
    }

    // =========================================================================
    // 1. FORMATAÇÃO BÁSICA (STRING, CHAR, INT)
    // =========================================================================
    /**
     * Demonstra os especificadores de formato mais simples:
     * %s -> String (Texto)
     * %d -> Decimal Integer (Números Inteiros)
     * %c -> Character (Caractere único)
     * %n -> Quebra de linha independente do Sistema Operacional (melhor que \n no printf)
     */
    public static void exemploBasico() {
        System.out.println("\n--- [1] Formatação Básica ---");
        
        String linguagem = "Java";
        int versao = 21;
        char nota = 'A';

        // Usando println com concatenação (+) - Modo tradicional e verboso
        System.out.println("Com println: A linguagem " + linguagem + " na versão " + versao + " é nota " + nota);

        // Usando printf - Modo elegante usando marcadores (placeholders)
        System.out.print("Com printf : ");
        System.out.printf("A linguagem %s na versão %d é nota %c%n", linguagem, versao, nota);
        
        System.out.println("[Dica] A ordem das variáveis no final deve corresponder exatamente à ordem dos marcadores (%) na frase.");
    }

    // =========================================================================
    // 2. FORMATAÇÃO DE DECIMAIS (PONTO FLUTUANTE)
    // =========================================================================
    /**
     * Demonstra o especificador %f para números com casas decimais (float e double).
     * Ensina como limitar o número de casas decimais (ex: %.2f para duas casas).
     */
    public static void exemploDecimais() {
        System.out.println("\n--- [2] Formatação de Decimais (%.xf) ---");
        
        double pi = Math.PI; // 3.141592653589793...
        double precoProduto = 199.9;

        System.out.printf("Valor original de PI: %f%n", pi); // Padrão imprime muitas casas
        
        // %.2f restringe a 2 casas e FAZ O ARREDONDAMENTO matemático automático
        System.out.printf("PI formatado (2 casas): %.2f%n", pi); 
        System.out.printf("PI formatado (4 casas): %.4f%n", pi);

        // Exemplo aplicado a moeda
        System.out.printf("Preço do produto: R$ %.2f%n", precoProduto); // Preenche o zero final (199.90)

        System.out.println("\n[Atenção] O printf usa o idioma do seu Sistema Operacional.");
        System.out.println("Se o seu Windows/Linux estiver em Português, ele imprimirá VÍRGULA (10,50).");
        System.out.println("Se estiver em Inglês, imprimirá PONTO (10.50).");
    }

    // =========================================================================
    // 3. ALINHAMENTO E PREENCHIMENTO (PADDING)
    // =========================================================================
    /**
     * Demonstra como reservar espaços físicos na tela para alinhar textos.
     * %10s  -> Reserva 10 espaços, alinhando à DIREITA.
     * %-10s -> Reserva 10 espaços, alinhando à ESQUERDA (sinal de menos).
     * %05d  -> Preenche números inteiros com zeros à esquerda.
     */
    public static void exemploAlinhamentoEPadding() {
        System.out.println("\n--- [3] Alinhamento e Preenchimento com Zeros ---");

        String palavra = "Code";
        int numeroId = 42;

        System.out.println("123456789012345 (Régua de espaços)"); // Régua visual
        
        // Alinhamento à direita (empurra o texto para o fim de um bloco de 15 caracteres)
        System.out.printf("%15s (Alinhado à direita)%n", palavra);
        
        // Alinhamento à esquerda (escreve o texto e preenche o resto com espaço vazio)
        System.out.printf("%-15s (Alinhado à esquerda)%n", palavra);

        // Preenchimento com zeros (Zero-padding) muito útil para IDs, CPFs, e boletos
        System.out.printf("ID Original: %d%n", numeroId);
        System.out.printf("ID Formatado: %05d (Preenchido com zeros para ter 5 dígitos)%n", numeroId);
    }

    // =========================================================================
    // 4. EXEMPLO PRÁTICO: TABELA FORMATADA
    // =========================================================================
    /**
     * Aplica todos os conceitos anteriores combinados para criar uma saída 
     * no terminal limpa, alinhada e com cara de sistema profissional.
     */
    public static void exemploTabelaPratica() {
        System.out.println("\n--- [4] Tabela Prática com printf ---");

        // Vetores de dados para popular a tabela
        String[] nomes = {"Ana Silva", "Carlos Eduardo", "Bia"};
        int[] matriculas = {7, 1024, 42};
        double[] notas = {9.5, 7.0, 10.0};

        // Cabeçalho da tabela: 
        // %-6s (6 espaços esq), %-20s (20 espaços esq), %-6s (6 espaços esq)
        System.out.println("----------------------------------------");
        System.out.printf("%-6s | %-20s | %-6s%n", "MAT", "NOME DO ALUNO", "NOTA");
        System.out.println("----------------------------------------");

        // Corpo da tabela
        for (int i = 0; i < nomes.length; i++) {
            // %04d   -> Matrícula com 4 dígitos (ex: 0007)
            // %-20s  -> Nome alinhado à esquerda ocupando 20 espaços
            // %05.2f -> Nota totalizando 5 espaços, com 2 casas decimais (ex: 09.50)
            System.out.printf("%04d   | %-20s | %05.2f%n", matriculas[i], nomes[i], notas[i]);
        }
        System.out.println("----------------------------------------");
    }
}