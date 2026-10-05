import java.util.InputMismatchException;
import java.util.Scanner;

public class EgExcecoes {

    public static void main(String[] args) {
        // O Scanner é inicializado no main
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("\n=== MENU: TRATAMENTO DE EXCEÇÕES E ERROS ===");
            System.out.println("1 - Try-Catch Básico (InputMismatchException - Letras ao invés de números)");
            System.out.println("2 - Prevenção de Falhas Matemáticas (ArithmeticException)");
            System.out.println("3 - O Bloco Finally (Execução garantida, com ou sem erro)");
            System.out.println("4 - Lançamento Manual de Erros (Palavra-chave 'throw')");
            System.out.println("5 - A Falha do Bilhão de Dólares (NullPointerException)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine(); // Limpeza do buffer após a leitura do inteiro

                switch (opcao) {
                    case 1 -> exemploInputInvalido(sc);
                    case 2 -> exemploErroMatematico(sc);
                    case 3 -> exemploBlocoFinally();
                    case 4 -> exemploLancarExcecao(sc);
                    case 5 -> exemploNullPointer();
                    case 0 -> System.out.println("\nA encerrar o módulo de exceções...");
                    default -> System.out.println("\nOpção inválida! Tente novamente.");
                }
            } catch (InputMismatchException e) {
                // Se o utilizador digitar "ABC" na escolha do menu, o programa cairá aqui em vez de explodir!
                System.out.println("\n❌ ERRO CRÍTICO EVITADO: Por favor, digite apenas NÚMEROS no menu.");
                sc.nextLine(); // IMPORTANTÍSSIMO: Limpar o "lixo" (texto) que ficou preso no buffer do Scanner
            } catch (Exception e) {
                // Catch genérico de segurança (polimorfismo: captura qualquer outro erro imprevisto)
                System.out.println("\n❌ Ocorreu um erro inesperado: " + e.getMessage());
            }

        } while (opcao != 0);
        
        sc.close();
    }

    // =========================================================================
    // 1. TRY-CATCH BÁSICO E ERRO DE TIPAGEM NO SCANNER
    // =========================================================================
    /**
     * Demonstra como proteger o programa quando esperamos um tipo de dado (int)
     * e o utilizador insere outro completamente diferente (String).
     */
    public static void exemploInputInvalido(Scanner sc) {
        System.out.println("\n--- [1] Captura de Erro de Input ---");
        System.out.print("Digite a sua idade (tente digitar uma palavra para forçar o erro): ");

        try {
            // O código "arriscado" fica dentro do bloco try
            int idade = sc.nextInt();
            System.out.println("✅ Sucesso! Idade registada: " + idade);
            
        } catch (InputMismatchException e) {
            // Se falhar, o fluxo salta imediatamente para aqui
            System.out.println("❌ Exceção Capturada! Você não digitou um número inteiro válido.");
            
        } finally {
            // A limpeza do buffer aqui garante que a próxima leitura não sofra com o lixo deixado,
            // independentemente de ter havido erro ou sucesso (pois o nextInt não consome o Enter).
            // NOTA: Num cenário real mais complexo, geriríamos o buffer no catch ou noutro fluxo,
            // mas aqui deixamos vazio caso o erro aconteça para o programa não entrar em loop.
            if (sc.hasNextLine()) sc.nextLine();
        }
    }

    // =========================================================================
    // 2. ERROS MATEMÁTICOS (ARITHMETIC EXCEPTION) E MULTI-CATCH
    // =========================================================================
    /**
     * Demonstra a captura de uma operação ilegal na matemática clássica (divisão por zero),
     * utilizando múltiplos blocos catch para tratar erros diferentes.
     */
    public static void exemploErroMatematico(Scanner sc) {
        System.out.println("\n--- [2] Prevenção de Falha Matemática ---");
        System.out.println("Vamos dividir 100 por um número à sua escolha.");
        System.out.print("Digite o divisor (tente digitar 0): ");

        try {
            int divisor = sc.nextInt();
            int resultado = 100 / divisor; // O Java lança erro se o divisor for zero
            
            System.out.println("✅ Resultado exato da divisão: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("❌ Erro Matemático (ArithmeticException): É impossível dividir por zero!");
        } catch (InputMismatchException e) {
            System.out.println("❌ Erro de Input: Você não digitou um número numérico.");
            sc.nextLine(); // Limpeza em caso de texto
        }
    }

    // =========================================================================
    // 3. O BLOCO FINALLY (GARANTIA DE EXECUÇÃO)
    // =========================================================================
    /**
     * O bloco 'finally' executa SEMPRE, quer tenha havido uma exceção ou não.
     * É crucial para fechar ficheiros, conexões de base de dados ou libertar memória.
     */
    public static void exemploBlocoFinally() {
        System.out.println("\n--- [3] O Bloco Finally ---");
        System.out.println("A tentar abrir ligação ao 'Banco de Dados'...");

        try {
            System.out.println("Ligação aberta. A processar dados importantes...");
            
            // Simulando um erro crítico no sistema durante o processo
            boolean erroNoSistema = true;
            if (erroNoSistema) {
                throw new RuntimeException("Falha na rede durante o processamento!");
            }
            
            System.out.println("Processamento concluído com sucesso."); // Esta linha nunca será executada
            
        } catch (RuntimeException e) {
            System.out.println("❌ Exceção Capturada: " + e.getMessage());
            
        } finally {
            // Mesmo com o erro fatal acima, o Java obriga a passagem por aqui
            System.out.println("🔒 FINALLY: A fechar ligação ao 'Banco de Dados' de forma segura.");
            System.out.println("[Dica] Se não fechássemos a ligação, a base de dados ficaria travada.");
        }
    }

    // =========================================================================
    // 4. LANÇAMENTO MANUAL DE EXCEÇÕES (THROW)
    // =========================================================================
    /**
     * Não precisamos de esperar que o Java detete um erro. Nós próprios podemos
     * definir o que é um erro nas regras de negócio (ex: senha curta) e lançar
     * uma exceção propositada com a palavra-chave 'throw'.
     */
    public static void exemploLancarExcecao(Scanner sc) {
        System.out.println("\n--- [4] Lançamento de Erro de Negócio (throw) ---");
        System.out.print("Crie uma nova palavra-passe (Mínimo de 6 caracteres): ");
        String senha = sc.nextLine();

        try {
            // Chamamos um método que pode lançar (throws) uma exceção
            validarSenha(senha);
            System.out.println("✅ Palavra-passe validada e guardada com sucesso!");
            
        } catch (IllegalArgumentException e) {
            // Capturamos a mensagem exata que nós mesmos escrevemos no 'throw'
            System.out.println("❌ Validação Falhou: " + e.getMessage());
        }
    }

    /**
     * Método auxiliar que lança a exceção caso a regra seja violada.
     */
    private static void validarSenha(String senha) {
        if (senha == null || senha.length() < 6) {
            // 'throw' (lançar) interrompe o método imediatamente, como se fosse um 'return' de erro
            throw new IllegalArgumentException("A palavra-passe inserida é demasiado curta.");
        }
    }

    // =========================================================================
    // 5. O ERRO MAIS FAMOSO DO JAVA (NULLPOINTEREXCEPTION)
    // =========================================================================
    /**
     * A NullPointerException (NPE) ocorre quando tentamos invocar um método
     * ou aceder a uma propriedade de um objeto que ainda não existe na memória (null).
     */
    public static void exemploNullPointer() {
        System.out.println("\n--- [5] A Falha do Bilhão de Dólares (NullPointerException) ---");
        
        String textoVazio = "";
        String textoNulo = null; // A variável existe, mas não aponta para nenhum objeto na memória

        System.out.println("Tamanho do texto vazio: " + textoVazio.length()); // Funciona, imprime 0

        try {
            System.out.println("A tentar descobrir o tamanho do texto nulo...");
            
            // O programa vai tentar entrar na propriedade .length() do NADA. Vai explodir.
            int tamanho = textoNulo.length(); 
            System.out.println("Tamanho: " + tamanho); // Nunca chega aqui
            
        } catch (NullPointerException e) {
            System.out.println("❌ NullPointerException Capturada!");
            System.out.println("Motivo: Tentou interagir com um objeto que era 'null'.");
        }
    }
}