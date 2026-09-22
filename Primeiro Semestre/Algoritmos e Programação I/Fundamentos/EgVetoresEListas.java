import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EgVetoresEListas {

    public static void main(String[] args) {
        // try-with-resources para encerramento seguro do Scanner
        try (Scanner sc = new Scanner(System.in)) {
            int opcao;

            do {
                System.out.println("\n=== MENU: VETORES, MATRIZES E ARRAYLIST ===");
                System.out.println("1 - Vetor Básico (Array unidimensional de tamanho fixo)");
                System.out.println("2 - Operações com Vetores (Média, maior e menor elemento)");
                System.out.println("3 - Matrizes (Arrays bidimensionais)");
                System.out.println("4 - ArrayList Dinâmico (CRUD: add, get, set, remove)");
                System.out.println("5 - Comparativo Direto: Array Fixo vs. ArrayList");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = sc.nextInt();
                sc.nextLine(); // Limpeza do buffer do teclado

                switch (opcao) {
                    case 1 -> exemploVetorBasico();
                    case 2 -> exemploOperacoesVetor(sc);
                    case 3 -> exemploMatriz();
                    case 4 -> exemploArrayList(sc);
                    case 5 -> exemploComparativo();
                    case 0 -> System.out.println("\nEncerrando o programa de vetores e listas...");
                    default -> System.out.println("\nOpção inválida! Tente novamente.");
                }

            } while (opcao != 0);
        }
    }

    // =========================================================================
    // 1. VETOR BÁSICO (ARRAY UNIDIMENSIONAL DE TAMANHO FIXO)
    // =========================================================================
    /**
     * Demonstra declaração, inicialização estática e dinâmica de arrays.
     * Características essenciais do Array em Java:
     * - Tamanho imutável após a instanciação na memória.
     * - Índices baseados em zero (o primeiro elemento fica no índice 0).
     * - A propriedade '.length' armazena o tamanho total alocado.
     */
    public static void exemploVetorBasico() {
        System.out.println("\n--- [1] Vetor Básico (Array de Tamanho Fixo) ---");

        // Forma 1: Declaração com alocação de tamanho sem valores iniciais (padrão 0)
        int[] numeros = new int[4];
        numeros[0] = 10;
        numeros[1] = 25;
        numeros[2] = 40;
        numeros[3] = 55;

        // Forma 2: Inicialização direta por chaves (inferência automática do tamanho)
        String[] frutas = { "Maçã", "Banana", "Laranja", "Uva" };

        System.out.println("Tamanho do array 'numeros': " + numeros.length);
        System.out.println("Primeiro elemento de 'numeros': " + numeros[0]);
        System.out.println("Último elemento de 'numeros': " + numeros[numeros.length - 1]);

        System.out.println("\nPercorrendo array de frutas com laço for tradicional:");
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Posição [" + i + "]: " + frutas[i]);
        }

        // Impressão legível de arrays usando a classe utilitária java.util.Arrays
        System.out.println("\nRepresentação em String via Arrays.toString(): " + Arrays.toString(frutas));
    }

    // =========================================================================
    // 2. PROCESSAMENTO E BUSCA EM ARRAYS
    // =========================================================================
    /**
     * Demonstra a leitura de dados do usuário para preencher um array,
     * cálculo de média aritmética e algoritmos de identificação de maior e menor valor.
     */
    public static void exemploOperacoesVetor(Scanner sc) {
        System.out.println("\n--- [2] Operações com Vetores (Notas e Estatísticas) ---");
        System.out.print("Quantas notas deseja registrar? ");
        int total = sc.nextInt();

        if (total <= 0) {
            System.out.println("Quantidade deve ser maior que zero!");
            return;
        }

        double[] notas = new double[total];

        // Preenchimento do array via console
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota [" + (i + 1) + "]: ");
            notas[i] = sc.nextDouble();
        }

        // Inicializamos maior, menor e acumulador com base no primeiro elemento
        double soma = 0;
        double maior = notas[0];
        double menor = notas[0];

        for (double nota : notas) {
            soma += nota;
            if (nota > maior) maior = nota;
            if (nota < menor) menor = nota;
        }

        double media = soma / notas.length;

        System.out.println("\n--- Resultados Estatísticos ---");
        System.out.println("Notas registradas: " + Arrays.toString(notas));
        System.out.println("Média da turma: " + String.format("%.2f", media));
        System.out.println("Maior nota registrada: " + maior);
        System.out.println("Menor nota registrada: " + menor);
    }

    // =========================================================================
    // 3. MATRIZES (ARRAYS BIDIMENSIONAIS)
    // =========================================================================
    /**
     * Apresenta matrizes (vetores de vetores).
     * Cada elemento é indexado por um par de coordenadas: [linha][coluna].
     */
    public static void exemploMatriz() {
        System.out.println("\n--- [3] Matrizes (Arrays Multidimensionais) ---");

        // Declaração de matriz 3x3 já populada (grade de jogo da velha / tabuleiro)
        char[][] tabuleiro = {
            { 'X', 'O', 'X' },
            { ' ', 'X', 'O' },
            { 'O', ' ', 'X' }
        };

        System.out.println("Exibição da matriz linha por linha (laços aninhados):");
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
                System.out.print("[" + tabuleiro[linha][coluna] + "] ");
            }
            System.out.println(); // Pula linha após imprimir todas as colunas
        }

        // Acessando coordenada específica
        System.out.println("\nElemento no centro (linha 1, coluna 1): " + tabuleiro[1][1]);
    }

    // =========================================================================
    // 4. ARRAYLIST DINÂMICO (COLLECTIONS FRAMEWORK)
    // =========================================================================
    /**
     * Demonstra a classe ArrayList:
     * - Tamanho dinâmico (expande e reduz conforme elementos são inseridos/removidos).
     * - Suporta apenas tipos de referência (Classes Wrapper como Integer, Double, String).
     * - Principais métodos do ciclo de vida (CRUD):
     *     .add(valor)           -> Insere elemento ao final
     *     .get(indice)          -> Obtém elemento da posição
     *     .set(indice, valor)   -> Atualiza valor na posição
     *     .remove(indice/valor) -> Remove elemento
     *     .size()               -> Retorna a quantidade de itens presentes
     *     .contains(valor)      -> Verifica existência do item
     */
    public static void exemploArrayList(Scanner sc) {
        System.out.println("\n--- [4] ArrayList (Coleção Dinâmica de Objetos) ---");

        // Instanciação: tipo entre diamantes <String> (Generics)
        ArrayList<String> tarefas = new ArrayList<>();

        // CREATE: Inserindo elementos dinamicamente
        tarefas.add("Estudar métodos em Java");
        tarefas.add("Fazer exercícios de repetição");
        tarefas.add("Comprar café");

        System.out.println("Lista inicial (tamanho: " + tarefas.size() + "):");
        exibirLista(tarefas);

        // READ: Leitura por índice com .get()
        System.out.println("\nPrimeira tarefa: " + tarefas.get(0));

        // UPDATE: Atualização de registro com .set()
        tarefas.set(2, "Comprar chá verde");
        System.out.println("\nApós atualização da tarefa no índice 2:");
        exibirLista(tarefas);

        // BUSCA: Verificação com .contains()
        boolean existe = tarefas.contains("Comprar chá verde");
        System.out.println("\nExiste 'Comprar chá verde' na lista? " + (existe ? "Sim" : "Não"));

        // DELETE: Remoção de item por índice com .remove()
        tarefas.remove(1); // Remove "Fazer exercícios de repetição"
        System.out.println("\nApós remover a tarefa no índice 1:");
        exibirLista(tarefas);
    }

    /**
     * Método auxiliar para percorrer e imprimir qualquer ArrayList de Strings.
     */
    public static void exibirLista(ArrayList<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("  " + i + ". " + lista.get(i));
        }
    }

    // =========================================================================
    // 5. COMPARATIVO DIRETO: ARRAY FIXO VS. ARRAYLIST
    // =========================================================================
    /**
     * Quadro comparativo prático para consolidar quando escolher cada um:
     * 
     * Critério        | Array Convencional (`tipo[]`) | ArrayList (`ArrayList<T>`)
     * ----------------|-------------------------------|----------------------------
     * Redimensionamento | Fixo após alocação          | Dinâmico e automático
     * Tipos suportados| Primitivos e Objetos          | Apenas Objetos (Wrappers)
     * Desempenho      | Máxima velocidade/baixo custo | Leve sobrecarga de memória
     * Sintaxe de tam. | .length (atributo público)    | .size() (método)
     * Acesso a dados  | colchetes [índice]            | métodos .get() / .set()
     */
    public static void exemploComparativo() {
        System.out.println("\n--- [5] Comparativo Sintático Direto ---");

        // Array tradicional de inteiros primitivos
        int[] arrayFixo = new int[2];
        arrayFixo[0] = 100;
        arrayFixo[1] = 200;
        // arrayFixo[2] = 300; // Geraria ArrayIndexOutOfBoundsException em tempo de execução

        // ArrayList com classe Wrapper Integer
        ArrayList<Integer> listaDinamica = new ArrayList<>();
        listaDinamica.add(100); // Autoboxing: converte int primitivo em objeto Integer
        listaDinamica.add(200);
        listaDinamica.add(300); // Cresce sem erro

        System.out.println("Array fixo: tamanho " + arrayFixo.length + " | elemento 0: " + arrayFixo[0]);
        System.out.println("ArrayList : tamanho " + listaDinamica.size() + " | elemento 0: " + listaDinamica.get(0));
        System.out.println("ArrayList após crescer dinamicamente: " + listaDinamica);
    }
}