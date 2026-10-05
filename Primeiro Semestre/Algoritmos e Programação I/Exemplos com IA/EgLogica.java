import java.util.Scanner;

public class EgLogica {

    // Constantes para demonstração de Clean Code (Evitando "Números Mágicos")
    private static final double DESCONTO_ESTUDANTE = 0.20;
    private static final int IDADE_MINIMA_CNH = 18;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int opcao;

            do {
                System.out.println("\n=== MENU: LÓGICA DE PROGRAMAÇÃO E CLEAN CODE ===");
                System.out.println("1 - Simplificação de Booleanos (Redução de if/else redundante)");
                System.out.println("2 - Cláusulas de Guarda / Early Return (Evitando aninhamento)");
                System.out.println("3 - Avaliação em Curto-Circuito (Prevenção de NullPointerException)");
                System.out.println("4 - Evitando 'Números Mágicos' (Uso de Constantes)");
                System.out.println("5 - Extração de Métodos (Responsabilidade Única)");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção de refatoração: ");

                opcao = sc.nextInt();
                sc.nextLine(); // Limpeza de buffer

                switch (opcao) {
                    case 1 -> exemploSimplificacaoBooleana(sc);
                    case 2 -> exemploClausulasDeGuarda(sc);
                    case 3 -> exemploCurtoCircuito();
                    case 4 -> exemploNumerosMagicos(sc);
                    case 5 -> exemploExtracaoMetodos();
                    case 0 -> System.out.println("\nEncerrando o módulo de lógica avançada...");
                    default -> System.out.println("\nOpção inválida! Tente novamente.");
                }
            } while (opcao != 0);
        }
    }

    // =========================================================================
    // 1. SIMPLIFICAÇÃO DE RETORNOS BOOLEANOS E CONDICIONAIS
    // =========================================================================
    /**
     * Demonstra como reduzir estruturas if/else redundantes que retornam true/false,
     * devolvendo a expressão lógica diretamente.
     */
    public static void exemploSimplificacaoBooleana(Scanner sc) {
        System.out.println("\n--- [1] Simplificação Booleana ---");
        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();

        // ❌ LÓGICA REDUNDANTE (Antipadrão)
        boolean maiorDeIdadeRuim;
        if (idade >= IDADE_MINIMA_CNH) {
            maiorDeIdadeRuim = true;
        } else {
            maiorDeIdadeRuim = false;
        }

        // ✅ CÓDIGO LIMPO (Clean Code)
        // A expressão (idade >= 18) já resulta em um booleano por si só.
        boolean maiorDeIdadeBom = (idade >= IDADE_MINIMA_CNH);

        System.out.println("Pode tirar CNH? " + (maiorDeIdadeBom ? "Sim" : "Não"));

        // Outro antipadrão comum: if (variavel == true)
        // O correto é testar a variável diretamente: if (variavel)
        if (maiorDeIdadeBom) {
            System.out.println("[Dica] Nunca escreva 'if (condicao == true)'. Use 'if (condicao)'.");
        }
    }

    // =========================================================================
    // 2. CLÁUSULAS DE GUARDA (EARLY RETURN)
    // =========================================================================
    /**
     * Demonstra a técnica "Bouncer Pattern" ou "Guard Clauses".
     * Em vez de aninhar múltiplos 'ifs' (criando o "Anti-padrão Arrow" / código em flecha),
     * invertemos a lógica para falhar o mais rápido possível e sair do método.
     */
    public static void exemploClausulasDeGuarda(Scanner sc) {
        System.out.println("\n--- [2] Cláusulas de Guarda (Early Return) ---");
        System.out.print("Digite seu nome de usuário (deixe vazio para simular erro): ");
        String usuario = sc.nextLine();

        System.out.print("Digite sua senha (menos de 6 caracteres para simular erro): ");
        String senha = sc.nextLine();

        // ❌ LÓGICA ANINHADA (Difícil de ler)
        /*
        if (!usuario.isEmpty()) {
            if (senha.length() >= 6) {
                System.out.println("Login efetuado com sucesso!");
            } else {
                System.out.println("Erro: Senha muito curta.");
            }
        } else {
            System.out.println("Erro: Usuário em branco.");
        }
        */

        // ✅ CÓDIGO LIMPO (Early Return)
        // Validamos e abortamos rapidamente. O caminho feliz fica no final, sem indentação profunda.
        if (usuario.isEmpty() || usuario.isBlank()) {
            System.out.println("❌ Erro: Usuário não pode ficar em branco.");
            return; // Encerra a execução deste método imediatamente
        }

        if (senha.length() < 6) {
            System.out.println("❌ Erro: A senha deve ter pelo menos 6 caracteres.");
            return; // Encerra imediatamente
        }

        System.out.println("✅ Login efetuado com sucesso para o usuário: " + usuario);
        System.out.println("[Dica] O 'caminho feliz' do código nunca deve ficar preso dentro de vários 'ifs'.");
    }

    // =========================================================================
    // 3. AVALIAÇÃO DE CURTO-CIRCUITO (SHORT-CIRCUIT EVALUATION)
    // =========================================================================
    /**
     * Mostra a importância da ordem das expressões lógicas.
     * Em (A && B), se A for falso, o Java nem sequer lê o B.
     * Isso é vital para proteger o código contra NullPointerException.
     */
    public static void exemploCurtoCircuito() {
        System.out.println("\n--- [3] Avaliação em Curto-Circuito ---");

        String textoNulo = null;

        // Se invertêssemos a ordem para (textoNulo.length() > 0 && textoNulo != null),
        // o programa quebraria (Crash/Exception) ao tentar ler o tamanho de algo nulo.
        
        // Com o curto-circuito (&&), como a primeira verificação (!= null) falha, 
        // a segunda (.length) é totalmente ignorada, salvando o programa.
        if (textoNulo != null && textoNulo.length() > 0) {
            System.out.println("Temos um texto válido: " + textoNulo);
        } else {
            System.out.println("Variável é nula ou vazia. O programa sobreviveu graças ao && na ordem certa!");
        }
    }

    // =========================================================================
    // 4. EVITANDO NÚMEROS MÁGICOS (MAGIC NUMBERS)
    // =========================================================================
    /**
     * Ensina a não espalhar números literais não explicados pelo código.
     * Devem ser substituídos por constantes nomeadas (final).
     */
    public static void exemploNumerosMagicos(Scanner sc) {
        System.out.println("\n--- [4] Evitando Números Mágicos ---");
        System.out.print("Informe o valor da mensalidade: ");
        double valorMensalidade = sc.nextDouble();

        // ❌ CÓDIGO RUIM (O que é 0.20? De onde veio? O que significa?)
        // double totalRuim = valorMensalidade - (valorMensalidade * 0.20);

        // ✅ CÓDIGO LIMPO (Usando a constante DESCONTO_ESTUDANTE definida no topo da classe)
        double totalBom = valorMensalidade - (valorMensalidade * DESCONTO_ESTUDANTE);

        System.out.printf("Valor original: R$ %.2f\n", valorMensalidade);
        System.out.printf("Com desconto de estudante (%.0f%%): R$ %.2f\n", (DESCONTO_ESTUDANTE * 100), totalBom);
    }

    // =========================================================================
    // 5. EXTRAÇÃO DE MÉTODOS (SINGLE RESPONSIBILITY)
    // =========================================================================
    /**
     * Demonstra como um método "gordo" que faz várias coisas deve ser quebrado
     * em métodos menores, cujos próprios nomes servem como comentários do que o código faz.
     */
    public static void exemploExtracaoMetodos() {
        System.out.println("\n--- [5] Extração de Métodos ---");
        
        // Em vez de colocar 50 linhas aqui para gerar relatório, formatar dados e enviar e-mail,
        // nós chamamos métodos autoexplicativos (Mockados para o exemplo).
        
        String dados = buscarDadosSistema();
        String relatorio = formatarRelatorioFinanceiro(dados);
        enviarEmail("diretoria@empresa.com", relatorio);

        System.out.println("[Dica] Seu método main/principal deve ser apenas um maestro regendo os outros métodos.");
    }

    // --- Sub-métodos auxiliares para o exemplo 5 ---
    
    private static String buscarDadosSistema() {
        System.out.println("  -> [Etapa 1] Buscando dados brutos...");
        return "lucro: 5000";
    }

    private static String formatarRelatorioFinanceiro(String dadosBrutos) {
        System.out.println("  -> [Etapa 2] Transformando dados em relatório...");
        return "Relatório Oficial - " + dadosBrutos.toUpperCase();
    }

    private static void enviarEmail(String destinatario, String corpoMensagem) {
        System.out.println("  -> [Etapa 3] E-mail enviado para " + destinatario + " com sucesso!");
    }
}