import java.util.Scanner;

public class EgCondicionais {

    public static void main(String[] args) {
        // O uso do try-with-resources garante o fechamento automático do Scanner ao final[cite: 15]
        try (Scanner sc = new Scanner(System.in)) {
            int opcao;

            do {
                System.out.println("\n=== MENU DE ESTRUTURAS CONDICIONAIS ===");
                System.out.println("1 - Estrutura básica if-else (Cálculo de média)");
                System.out.println("2 - Operador Ternário (Condicional simplificada)");
                System.out.println("3 - Encadeamento if - else if - else (Nota e frequência)");
                System.out.println("4 - Comparação de Strings (equals vs. equalsIgnoreCase)");
                System.out.println("5 - Switch-Case Tradicional (Instrução clássica com break e fall-through)");
                System.out.println("6 - Switch Expression Moderno (Sintaxe com seta ->, múltiplos rótulos e yield)");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        exemploIfElseBasico(sc);
                        break;
                    case 2:
                        exemploOperadorTernario(sc);
                        break;
                    case 3:
                        exemploEncadeamentoMultiplo(sc);
                        break;
                    case 4:
                        exemploComparacaoString(sc);
                        break;
                    case 5:
                        exemploSwitchTradicional(sc);
                        break;
                    case 6:
                        exemploSwitchModerno(sc);
                        break;
                    case 0:
                        System.out.println("\nEncerrando o programa...");
                        break;
                    default:
                        System.out.println("\nOpção inválida! Tente novamente.");
                }

            } while (opcao != 0);
        }
    }

    // =========================================================================
    // 1. ESTRUTURA BÁSICA IF-ELSE
    // =========================================================================
    /**
     * Demonstra a estrutura condicional padrão if-else[cite: 15].
     * Avalia uma condição booleana: se verdadeira, executa o bloco 'if';
     * caso contrário, desvia o fluxo para o bloco 'else'[cite: 15].
     */
    public static void exemploIfElseBasico(Scanner sc) {
        System.out.println("\n--- [1] Exemplo: if-else Básico ---");
        System.out.print("Informe a primeira nota: ");
        double n1 = sc.nextDouble(); //[cite: 15]

        System.out.print("Informe a segunda nota: ");
        double n2 = sc.nextDouble(); //[cite: 15]

        double media = (n1 + n2) / 2.0; //[cite: 15]
        System.out.println("Média calculada: " + media); //[cite: 15]

        // Bloco condicional simples de duas vias[cite: 15]
        if (media >= 6.0) { //[cite: 15]
            System.out.println("Aluno aprovado! ✅"); //[cite: 15]
        } else {
            System.out.println("Aluno reprovado! ❌"); //[cite: 15]
        }
    }

    // =========================================================================
    // 2. OPERADOR TERNÁRIO
    // =========================================================================
    /**
     * Demonstra o operador ternário ( ?: )[cite: 15].
     * Atua como uma forma concisa de if-else para atribuições ou retornos[cite: 15].
     * Sintaxe: (condição) ? expressaoSeVerdadeiro : expressaoSeFalso[cite: 15]
     */
    public static void exemploOperadorTernario(Scanner sc) {
        System.out.println("\n--- [2] Exemplo: Operador Ternário ---");
        System.out.print("Informe a primeira nota: ");
        double n1 = sc.nextDouble(); //[cite: 15]

        System.out.print("Informe a segunda nota: ");
        double n2 = sc.nextDouble(); //[cite: 15]

        double media = (n1 + n2) / 2.0; //[cite: 15]
        System.out.println("Média calculada: " + media); //[cite: 15]

        // O resultado da condição decide qual string será retornada e impressa[cite: 15]
        String status = (media >= 6.0) ? "Aluno aprovado! ✅" : "Aluno reprovado! ❌"; //[cite: 15]
        System.out.println(status); //[cite: 15]
    }

    // =========================================================================
    // 3. ENCADEAMENTO IF - ELSE IF - ELSE
    // =========================================================================
    /**
     * Demonstra múltiplas condições em cascata avaliando mais de uma variável
     * (nota e frequência escolar). As condições são testadas em ordem hierárquica[cite: 15].
     */
    public static void exemploEncadeamentoMultiplo(Scanner sc) {
        System.out.println("\n--- [3] Exemplo: if-else Encadeado ---");
        System.out.print("Informe a nota (0 a 10): ");
        double nota = sc.nextDouble(); //[cite: 15]

        System.out.print("Informe a frequência percentual (0 a 100): ");
        double frequencia = sc.nextDouble(); //[cite: 15]

        String mensagem; //[cite: 15]

        // 1ª Validação eliminatória: frequência insuficiente reprova direto[cite: 15]
        if (frequencia < 75.0) { //[cite: 15]
            mensagem = "Aluno reprovado por infrequência! ❌"; //[cite: 15]
        } else if (nota >= 6.0) { //[cite: 15]
            mensagem = "Aluno aprovado! ✅"; //[cite: 15]
        } else if (nota >= 3.0) { //[cite: 15]
            mensagem = "Aluno de recuperação... 🟡"; //[cite: 15]
        } else if (nota >= 2.0) { //[cite: 15]
            mensagem = "Aluno no REA... 🟡"; //[cite: 15]
        } else {
            // Nota abaixo de 2.0[cite: 15]
            mensagem = "Aluno reprovado por nota! ❌"; //[cite: 15]
        }

        System.out.println(mensagem); //[cite: 15]
    }

    // =========================================================================
    // 4. COMPARAÇÃO DE STRINGS
    // =========================================================================
    /**
     * Demonstra a comparação correta de objetos/tipos não primitivos em Java[cite: 15].
     * Nunca se deve usar o operador '==' para comparar conteúdo textual de Strings,
     * pois ele compara posições de memória (referências), e não o valor literal[cite: 15].
     */
    public static void exemploComparacaoString(Scanner sc) {
        System.out.println("\n--- [4] Exemplo: Comparação de Strings ---");
        System.out.print("Informe a sua turma (ex: A, B ou C): ");
        String turma = sc.next(); //[cite: 15]

        // .equals(): Compara o valor textual exato (diferencia maiúsculas/minúsculas)[cite: 15]
        if (turma.equals("A")) { //[cite: 15]
            System.out.println("Bem-vindo à turma A!"); //[cite: 15]
        } else {
            System.out.println("Você não é da turma A."); //[cite: 15]
        }

        // Alternativa com .equalsIgnoreCase(): ignora 'a' minúsculo ou 'A' maiúsculo[cite: 15]
        if (turma.equalsIgnoreCase("A")) { //[cite: 15]
            System.out.println("[Dica didática] Com equalsIgnoreCase(), aceitamos 'a' ou 'A'."); //[cite: 15]
        }
    }

    // =========================================================================
    // 5. SWITCH-CASE TRADICIONAL (STATEMENT CLÁSSICO)
    // =========================================================================
    /**
     * Demonstra a sintaxe tradicional de switch (Java legada e padrão clássico):
     * - Exige o comando 'break' explicitamente após cada caso para evitar o 'fall-through'
     *   (quando a execução "vaza" para os casos seguintes sem testar a condição).
     * - O agrupamento de casos exige empilhar múltiplos 'case' sucessivos.
     */
    public static void exemploSwitchTradicional(Scanner sc) {
        System.out.println("\n--- [5] Exemplo: Switch-Case Tradicional ---");
        System.out.print("Digite um dia da semana (1 a 7, onde 1 = Domingo): ");
        int dia = sc.nextInt();

        String nomeDia;

        // 1. Exemplo de mapeamento convencional com 'break' obrigatório
        switch (dia) {
            case 1:
                nomeDia = "Domingo";
                break; // Sem este break, o programa executaria o case 2 acidentalmente
            case 2:
                nomeDia = "Segunda-feira";
                break;
            case 3:
                nomeDia = "Terça-feira";
                break;
            case 4:
                nomeDia = "Quarta-feira";
                break;
            case 5:
                nomeDia = "Quinta-feira";
                break;
            case 6:
                nomeDia = "Sexta-feira";
                break;
            case 7:
                nomeDia = "Sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }

        System.out.println("Dia selecionado: " + nomeDia);

        // 2. Demonstração didática do 'fall-through' intencional (agrupamento clássico)
        System.out.print("Classificação do dia (fall-through tradicional): ");
        switch (dia) {
            case 1:
            case 7:
                // Ambos os casos 1 e 7 desaguam aqui
                System.out.println("Fim de semana! 🏖️");
                break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                // Casos de 2 a 6 caem em cascata até encontrar o break
                System.out.println("Dia útil de trabalho/estudo. 💼");
                break;

            default:
                System.out.println("Número fora da faixa de 1 a 7.");
                break;
        }
    }

    // =========================================================================
    // 6. SWITCH MODERNO (SWITCH EXPRESSIONS - JAVA 14+)
    // =========================================================================
    /**
     * Demonstra a sintaxe moderna (Switch Expressions):
     * - Usa rótulos com flecha (->): elimina completamente a necessidade do 'break' e o risco de fall-through acidental.
     * - Permite múltiplos valores por rótulo separados por vírgula (ex: case 1, 7 -> ...).
     * - Pode funcionar como uma EXPRESSÃO: retorna um valor diretamente para atribuição de variáveis.
     * - Palavra-chave 'yield': usada quando um bloco de chaves precisa executar lógica e devolver um valor.
     */
    public static void exemploSwitchModerno(Scanner sc) {
        System.out.println("\n--- [6] Exemplo: Switch Expression Moderno (Java 14+) ---");
        System.out.print("Digite um dia da semana (1 a 7, onde 1 = Domingo): ");
        int dia = sc.nextInt();

        // 1. O switch atua diretamente como uma expressão de retorno atribuída à variável
        String classificacao = switch (dia) {
            case 1, 7 -> "Fim de semana! 🏖️"; // Rótulos múltiplos em linha única
            case 2, 3, 4, 5, 6 -> "Dia útil de trabalho/estudo. 💼";
            default -> {
                // Bloco de código com mais instruções usando 'yield' para entregar o valor
                System.out.println("[Log] Valor inesperado detectado: " + dia);
                yield "Dia inválido! ❌"; // 'yield' funciona como o 'return' do switch
            }
        };

        System.out.println("Resultado via Switch Expression: " + classificacao);

        // 2. Switch moderno como instrução (sem retorno de valor), apenas executando ação
        System.out.print("Mensagem motivacional: ");
        switch (dia) {
            case 1, 7 -> System.out.println("Aproveite para descansar!");
            case 2 -> System.out.println("Início de semana com foco!");
            case 6 -> System.out.println("Sextou!");
            case 3, 4, 5 -> System.out.println("Mantenha o ritmo!");
            default -> System.out.println("Sem mensagem para dia inválido.");
        }
    }
}