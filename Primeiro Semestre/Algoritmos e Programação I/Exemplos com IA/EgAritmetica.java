import java.util.Scanner;

public class EgAritmetica {

    public static void main(String[] args) {
        // Bloco try-with-resources para garantir o fechamento seguro do Scanner
        try (Scanner sc = new Scanner(System.in)) {
            int opcao;

            do {
                System.out.println("\n=== MENU: OPERADORES ARITMÉTICOS ===");
                System.out.println("1 - Operadores Básicos (+, -, *, /) e a Pegadinha da Divisão");
                System.out.println("2 - Operador de Módulo (%) e suas aplicações");
                System.out.println("3 - Operadores de Atribuição Composta (+=, -=, *=, /=)");
                System.out.println("4 - Incremento e Decremento (Pré-fixado vs Pós-fixado)");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = sc.nextInt();
                sc.nextLine(); // Limpeza do buffer do teclado

                switch (opcao) {
                    case 1 -> exemploOperacoesBasicas(sc);
                    case 2 -> exemploModulo(sc);
                    case 3 -> exemploAtribuicaoComposta();
                    case 4 -> exemploIncrementoDecremento();
                    case 0 -> System.out.println("\nEncerrando o módulo de aritmética...");
                    default -> System.out.println("\nOpção inválida! Tente novamente.");
                }

            } while (opcao != 0);
        }
    }

    // =========================================================================
    // 1. OPERADORES BÁSICOS E DIVISÃO INTEIRA VS DECIMAL
    // =========================================================================
    /**
     * Demonstra as 4 operações matemáticas fundamentais.
     * Foco especial na divisão: no Java, dividir dois inteiros sempre resulta 
     * em um inteiro, truncando as casas decimais. É necessário fazer o "cast"
     * ou usar tipos decimais para obter o resultado exato.
     */
    public static void exemploOperacoesBasicas(Scanner sc) {
        System.out.println("\n--- [1] Operações Básicas e Divisão ---");
        System.out.print("Digite o primeiro número inteiro (ex: 10): ");
        int a = sc.nextInt();
        
        System.out.print("Digite o segundo número inteiro (ex: 3): ");
        int b = sc.nextInt();

        System.out.println("\nAdição (a + b): " + (a + b));
        System.out.println("Subtração (a - b): " + (a - b));
        System.out.println("Multiplicação (a * b): " + (a * b));

        // ❌ Divisão Inteira (Trunca os decimais)
        int divisaoInteira = a / b;
        System.out.println("Divisão Inteira (a / b): " + divisaoInteira + " (As casas decimais foram perdidas!)");

        // ✅ Divisão Decimal (Usando cast para converter temporariamente para double)
        double divisaoExata = (double) a / b;
        System.out.println("Divisão Exata ((double) a / b): " + divisaoExata);
    }

    // =========================================================================
    // 2. OPERADOR DE MÓDULO (RESTO DA DIVISÃO)
    // =========================================================================
    /**
     * O operador % (módulo) não calcula porcentagem, mas sim o RESTO de uma 
     * divisão inteira. Muito utilizado para descobrir se um número é par/ímpar,
     * ou para criar ciclos de repetição de valores (ex: relógios).
     */
    public static void exemploModulo(Scanner sc) {
        System.out.println("\n--- [2] Operador Módulo (%) ---");
        System.out.print("Digite um número para verificar se é Par ou Ímpar: ");
        int numero = sc.nextInt();

        // Se o resto da divisão por 2 for 0, é par.
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }

        // Outro exemplo: Resto da divisão
        System.out.println("\n[Didático] O que sobra se dividirmos 10 por 3?");
        System.out.println("Cálculo: 10 / 3 = 3 (inteiro). Sobra 1.");
        System.out.println("Resultado de 10 % 3 em Java: " + (10 % 3));
    }

    // =========================================================================
    // 3. OPERADORES DE ATRIBUIÇÃO COMPOSTA
    // =========================================================================
    /**
     * Demonstra como encurtar expressões onde a mesma variável é atualizada.
     * Em vez de escrever 'saldo = saldo + 50', escrevemos 'saldo += 50'.
     */
    public static void exemploAtribuicaoComposta() {
        System.out.println("\n--- [3] Atribuição Composta ---");
        
        int saldo = 100;
        System.out.println("Saldo inicial: R$ " + saldo);

        saldo += 50; // Equivalente a: saldo = saldo + 50
        System.out.println("Após depósito de 50 (saldo += 50): R$ " + saldo);

        saldo -= 30; // Equivalente a: saldo = saldo - 30
        System.out.println("Após saque de 30 (saldo -= 30): R$ " + saldo);

        saldo *= 2;  // Equivalente a: saldo = saldo * 2
        System.out.println("Após rendimento dobrar (saldo *= 2): R$ " + saldo);

        saldo /= 4;  // Equivalente a: saldo = saldo / 4
        System.out.println("Após dividir com 4 pessoas (saldo /= 4): R$ " + saldo);
    }

    // =========================================================================
    // 4. INCREMENTO E DECREMENTO (PRÉ VS PÓS)
    // =========================================================================
    /**
     * Operadores unários (++) e (--) que adicionam ou subtraem 1 da variável.
     * A posição do operador (antes ou depois) muda completamente a lógica se
     * usado no meio de uma atribuição ou impressão.
     */
    public static void exemploIncrementoDecremento() {
        System.out.println("\n--- [4] Incremento (++) e Decremento (--) ---");

        int x = 5;
        System.out.println("Valor inicial de x: " + x);

        // PÓS-FIXADO (x++): Usa o valor atual da variável e SÓ DEPOIS soma 1.
        System.out.println("\nTestando PÓS-fixado (x++)...");
        System.out.println("Imprimindo (x++): " + (x++)); // Imprime 5, depois vira 6
        System.out.println("Valor de x agora: " + x);     // Imprime 6

        int y = 5;
        System.out.println("\nValor inicial de y: " + y);

        // PRÉ-FIXADO (++y): Soma 1 ANTES de usar o valor da variável.
        System.out.println("\nTestando PRÉ-fixado (++y)...");
        System.out.println("Imprimindo (++y): " + (++y)); // Vira 6, depois imprime 6
        System.out.println("Valor de y agora: " + y);     // Imprime 6
        
        // Decremento funciona exatamente da mesma forma, mas subtraindo 1.
        System.out.println("\nDecremento simples (y--):");
        y--; 
        System.out.println("Valor final de y: " + y); // Volta para 5
    }
}