import java.util.Arrays;
import java.util.Scanner;

public class EgStrings {

    public static void main(String[] args) {
        // try-with-resources para garantir o fecho do Scanner
        try (Scanner sc = new Scanner(System.in)) {
            int opcao;

            do {
                System.out.println("\n=== MENU: MANIPULAÇÃO DE STRINGS ===");
                System.out.println("1 - Limpeza e Formatação (trim, toUpperCase, toLowerCase, length)");
                System.out.println("2 - Extração de Trechos (substring)");
                System.out.println("3 - Buscas e Substituições (contains, startsWith, replace)");
                System.out.println("4 - Separação de Textos em Arrays (split)");
                System.out.println("5 - Alta Performance de Concatenação (StringBuilder)");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = sc.nextInt();
                sc.nextLine(); // Limpeza do buffer do teclado

                switch (opcao) {
                    case 1 -> exemploFormatacaoELimpeza(sc);
                    case 2 -> exemploExtracao();
                    case 3 -> exemploBuscaSubstituicao(sc);
                    case 4 -> exemploDivisaoSplit();
                    case 5 -> exemploStringBuilder();
                    case 0 -> System.out.println("\nEncerrando o módulo de Strings...");
                    default -> System.out.println("\nOpção inválida! Tente novamente.");
                }

            } while (opcao != 0);
        }
    }

    // =========================================================================
    // 1. LIMPEZA E FORMATAÇÃO BÁSICA
    // =========================================================================
    /**
     * Demonstra como limpar espaços acidentais e padronizar o tamanho da fonte.
     * Fundamental antes de guardar dados numa base de dados.
     */
    public static void exemploFormatacaoELimpeza(Scanner sc) {
        System.out.println("\n--- [1] Limpeza e Formatação ---");
        System.out.print("Digite o seu nome com vários espaços no início e no fim: ");
        String entradaBruta = sc.nextLine();

        // .trim() remove os espaços em branco das extremidades (mas não do meio)
        String textoLimpo = entradaBruta.trim();

        System.out.println("\nEntrada original: [" + entradaBruta + "]");
        System.out.println("Após o .trim()  : [" + textoLimpo + "]");
        
        System.out.println("Total de caracteres (com espaços) : " + entradaBruta.length());
        System.out.println("Total de caracteres (texto limpo) : " + textoLimpo.length());

        // Padronização útil para comparações de texto
        System.out.println("Tudo MAIÚSCULO (.toUpperCase): " + textoLimpo.toUpperCase());
        System.out.println("Tudo minúsculo (.toLowerCase): " + textoLimpo.toLowerCase());
    }

    // =========================================================================
    // 2. EXTRAÇÃO DE TRECHOS COM SUBSTRING
    // =========================================================================
    /**
     * O método .substring() serve para "recortar" partes de um texto.
     * Recebe um índice inicial (inclusivo) e, opcionalmente, um índice final (exclusivo).
     * Os índices em Java começam no 0.
     */
    public static void exemploExtracao() {
        System.out.println("\n--- [2] Extração de Trechos (substring) ---");
        String dataNascimento = "15/10/2026";
        System.out.println("Texto original: " + dataNascimento);
        System.out.println("Índices:        0123456789");

        // .substring(inicio) -> Do índice indicado até ao final da String
        String ano = dataNascimento.substring(6); 
        System.out.println("Extraindo o Ano (índice 6 em diante): " + ano);

        // .substring(inicio, fim) -> O fim é EXCLUSIVO (recorta até ao índice fim - 1)
        String dia = dataNascimento.substring(0, 2); 
        String mes = dataNascimento.substring(3, 5);
        
        System.out.println("Extraindo o Dia (índice 0 a 2): " + dia);
        System.out.println("Extraindo o Mês (índice 3 a 5): " + mes);
    }

    // =========================================================================
    // 3. BUSCAS E SUBSTITUIÇÕES (VERIFICAÇÕES BOOLEANAS E REPLACE)
    // =========================================================================
    /**
     * Mostra como pesquisar palavras dentro de um texto e como substituir
     * partes específicas por outras.
     */
    public static void exemploBuscaSubstituicao(Scanner sc) {
        System.out.println("\n--- [3] Buscas e Substituições ---");
        
        String fraseOriginal = "O Java é uma linguagem difícil, mas o Java recompensa.";
        System.out.println("Frase: " + fraseOriginal);

        // Buscas devolvem true ou false
        System.out.println("\nA frase contém a palavra 'linguagem'? " + fraseOriginal.contains("linguagem"));
        System.out.println("A frase começa com 'A'? " + fraseOriginal.startsWith("A"));
        System.out.println("A frase termina com '.'? " + fraseOriginal.endsWith("."));

        // Substituição de textos (Cria sempre uma String nova, pois Strings são imutáveis)
        String fraseModificada = fraseOriginal.replace("difícil", "poderosa")
                                              .replace("o Java", "o esforço"); 
                                              // (Encadeamento de métodos é permitido)

        System.out.println("\nFrase após o .replace():");
        System.out.println(fraseModificada);
    }

    // =========================================================================
    // 4. DIVISÃO DE TEXTOS EM ARRAYS COM SPLIT
    // =========================================================================
    /**
     * O método .split(delimitador) parte uma String em vários pedaços,
     * devolvendo um Array (vetor) de Strings. Muito usado para processar ficheiros CSV.
     */
    public static void exemploDivisaoSplit() {
        System.out.println("\n--- [4] Divisão de Textos (split) ---");

        String listaCompras = "Maçã,Banana,Leite,Café,Pão";
        System.out.println("String original (formato CSV): " + listaCompras);

        // O texto será dividido sempre que encontrar a vírgula (",")
        String[] itens = listaCompras.split(",");

        System.out.println("\nTotal de itens extraídos: " + itens.length);
        System.out.println("Vetor resultante: " + Arrays.toString(itens));

        System.out.println("\nImprimindo item a item no laço for-each:");
        for (String item : itens) {
            System.out.println(" - " + item);
        }
    }

    // =========================================================================
    // 5. ALTA PERFORMANCE E OTIMIZAÇÃO (STRINGBUILDER)
    // =========================================================================
    /**
     * Strings no Java são IMUTÁVEIS. Toda vez que se usa += para juntar textos,
     * o Java destrói o texto antigo na memória e cria um novo. Para laços longos,
     * isso destrói a performance. A solução é o StringBuilder.
     */
    public static void exemploStringBuilder() {
        System.out.println("\n--- [5] Alta Performance com StringBuilder ---");

        // Objeto projetado para sofrer mutações e concatenações em massa
        StringBuilder sb = new StringBuilder();

        sb.append("Início do Relatório...\n");
        
        System.out.println("Gerando linhas usando um for...");
        for (int i = 1; i <= 5; i++) {
            // .append() adiciona ao final sem criar novas Strings no fundo da memória
            sb.append("Linha registada número: ").append(i).append("\n");
        }
        
        sb.append("Fim do Relatório.");

        // No fim, converte-se o StringBuilder resultante de volta para String normal
        String relatorioFinal = sb.toString();

        System.out.println("\nConteúdo gerado de forma otimizada:");
        System.out.println("------------------------------------");
        System.out.println(relatorioFinal);
        System.out.println("------------------------------------");
        
        System.out.println("[Dica] Se tiver que concatenar textos dentro de um 'for' ou 'while', USE StringBuilder. Nunca use +=.");
    }
}