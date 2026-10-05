import java.util.Scanner;

public class EgRepeticao {

    public static void main(String[] args) {
        // try-with-resources garante o fecho seguro do Scanner ao terminar
        try (Scanner sc = new Scanner(System.in)) {
            int opcao;

            do {
                System.out.println("\n=== MENU DE ESTRUTURAS DE REPETIÇÃO ===");
                System.out.println("1 - Laço while (Estrutura pré-testada: acumulador)");
                System.out.println("2 - Laço do-while (Estrutura pós-testada: validação de entrada)");
                System.out.println("3 - Laço for clássico (Controle determinado: tabuada)");
                System.out.println("4 - Desvios de fluxo: break e continue");
                System.out.println("5 - Laço for-each (Iteração sobre arrays)");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = sc.nextInt();
                sc.nextLine(); // Limpeza do buffer de entrada

                switch (opcao) {
                    case 1:
                        exemploWhile(sc);
                        break;
                    case 2:
                        exemploDoWhile(sc);
                        break;
                    case 3:
                        exemploFor(sc);
                        break;
                    case 4:
                        exemploBreakContinue();
                        break;
                    case 5:
                        exemploForEach();
                        break;
                    case 0:
                        System.out.println("\nA encerrar o programa de repetição...");
                        break;
                    default:
                        System.out.println("\nOpção inválida! Tente novamente.");
                }

            } while (opcao != 0);
        }
    }

    // =========================================================================
    // 1. ESTRUTURA WHILE (PRÉ-TESTADA)
    // =========================================================================
    /**
     * Demonstra o funcionamento do laço 'while'.
     * A condição lógica é testada no início da iteração.
     * Se a condição for falsa logo na primeira verificação, o bloco nunca é executado.
     * 
     * @param sc Scanner para captura das entradas do utilizador
     */
    public static void exemploWhile(Scanner sc) {
        System.out.println("\n--- [1] Exemplo: while (Soma até digitar zero) ---");
        System.out.println("Digite números inteiros para somar (digite 0 para encerrar):");

        int soma = 0;
        int contador = 0;
        int numero = sc.nextInt();

        // O laço continuará a executar enquanto 'numero' for diferente de 0
        while (numero != 0) {
            soma += numero;
            contador++;
            System.out.print("Subtotal: " + soma + " | Próximo número (0 para parar): ");
            numero = sc.nextInt();
        }

        System.out.println("Laço finalizado!");
        System.out.println("Total de números somados: " + contador);
        System.out.println("Soma total acumulada: " + soma);
    }

    // =========================================================================
    // 2. ESTRUTURA DO-WHILE (PÓS-TESTADA)
    // =========================================================================
    /**
     * Demonstra o laço 'do-while'.
     * O bloco de código é executado obrigatoriamente pelo menos uma vez antes da verificação.
     * É a estrutura ideal para validações de entradas do utilizador e criação de menus.
     * 
     * @param sc Scanner para captura das notas
     */
    public static void exemploDoWhile(Scanner sc) {
        System.out.println("\n--- [2] Exemplo: do-while (Validação de Nota) ---");
        double nota;

        // Executa a solicitação e apenas depois verifica se o valor está no intervalo aceitável
        do {
            System.out.print("Insira uma nota válida entre 0.0 e 10.0: ");
            nota = sc.nextDouble();

            if (nota < 0.0 || nota > 10.0) {
                System.out.println("Nota inválida! Tente novamente.");
            }
        } while (nota < 0.0 || nota > 10.0);

        System.out.println("Nota registada com sucesso: " + nota);
    }

    // =========================================================================
    // 3. ESTRUTURA FOR CLÁSSICA
    // =========================================================================
    /**
     * Demonstra o laço 'for' tradicional.
     * Agrupa três componentes na mesma declaração:
     * - Inicialização de variável de controle
     * - Condição de permanência
     * - Passo de incremento ou decremento
     * 
     * @param sc Scanner para ler o fator da tabuada
     */
    public static void exemploFor(Scanner sc) {
        System.out.println("\n--- [3] Exemplo: for (Tabuada) ---");
        System.out.print("Informe um número inteiro para ver a tabuada: ");
        int fator = sc.nextInt();

        System.out.println("Tabuada do " + fator + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(fator + " x " + i + " = " + (fator * i));
        }

        // Demonstração adicional de contagem decrescente com passo 2
        System.out.println("\nContagem regressiva de pares (10 até 0):");
        for (int i = 10; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // =========================================================================
    // 4. CONTROLE DE FLUXO: BREAK E CONTINUE
    // =========================================================================
    /**
     * Apresenta os comandos de interrupção e salto em repetições:
     * - 'continue': interrompe a iteração atual e salta imediatamente para a próxima.
     * - 'break': interrompe e finaliza o laço por completo, saindo do bloco.
     */
    public static void exemploBreakContinue() {
        System.out.println("\n--- [4] Exemplo: Interrupções com break e continue ---");
        System.out.println("Iterando de 1 a 10 (com continue no 4 e break no 8):");

        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                System.out.println("-> Número " + i + " ignorado pelo comando 'continue'.");
                continue; // Pula o restante do bloco e vai direto para i = 5
            }

            if (i == 8) {
                System.out.println("-> Número " + i + " acionou o 'break'. Encerrando o laço!");
                break; // Encerra o laço completamente
            }

            System.out.println("Valor atual de i: " + i);
        }
    }

    // =========================================================================
    // 5. LAÇO FOR-EACH (ENHANCED FOR)
    // =========================================================================
    /**
     * Demonstra o for aprimorado (for-each), utilizado para percorrer
     * vetores (arrays) ou coleções de forma direta, sem a necessidade de índices.
     */
    public static void exemploForEach() {
        System.out.println("\n--- [5] Exemplo: for-each (Percorrendo Coleções/Arrays) ---");

        String[] linguagens = { "Java", "Python", "C#", "JavaScript", "Go" };

        System.out.println("Linguagens de programação no vetor:");
        // Para cada elemento 'ling' do tipo String contido no array 'linguagens'
        for (String ling : linguagens) {
            System.out.println("- " + ling);
        }

        int[] valores = { 15, 25, 40, 60 };
        int acumulador = 0;

        for (int v : valores) {
            acumulador += v;
        }
        System.out.println("Soma dos valores do array: " + acumulador);
    }
}