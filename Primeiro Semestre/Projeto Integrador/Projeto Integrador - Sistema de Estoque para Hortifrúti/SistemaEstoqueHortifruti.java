// import java.util.Scanner;

// public class Projeto {
//     public static void main(String[] args) {
//         try(Scanner sc = new Scanner(System.in)) {
        
//         }
//     }
// }

// --- O CÓDIGO ABAIXO É TEMPORÁRIO E ESTÁ SENDO USADO APENAS PARA TESTES ---
import java.util.Scanner;
public class SistemaEstoqueHortifruti {

    static Scanner scanner = new Scanner(System.in);

    static String[] nomes = new String[100];
    static String[] categorias = new String[100];
    static double[] precos = new double[100];
    static int[] quantidades = new int[100];

    static int totalProdutos = 0;

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> cadastrarProduto();

                case 2 -> listarProdutos();

                case 3 -> consultarProduto();

                case 4 -> editarProduto();

                case 5 -> removerProduto();

                case 6 -> calcularValorEstoque();

                case 0 -> System.out.println("Encerrando o sistema...");

                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }

    // Exibe o menu principal
    public static void exibirMenu() {
        System.out.println("\n===== HORTIFRÚTI =====");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listar produtos");
        System.out.println("3 - Consultar produto");
        System.out.println("4 - Editar produto");
        System.out.println("5 - Remover produto");
        System.out.println("6 - Valor total do estoque");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    // Cadastra um novo produto
    public static void cadastrarProduto() {
        if (totalProdutos >= nomes.length) {
            System.out.println("Limite de produtos atingido!");
            return;
        }

        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        // Impede cadastro de nomes duplicados
        if (buscarProduto(nome) != -1) {
            System.out.println("Esse produto já está cadastrado!");
            return;
        }

        String categoria = lerCategoria();

        if (categoria == null) {
            System.out.println("Categoria inválida!");
            return;
        }

        System.out.print("Preço unitário (R$): ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade em estoque: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        if (preco < 0 || quantidade < 0) {
            System.out.println("Valores inválidos!");
            return;
        }

        nomes[totalProdutos] = nome;
        categorias[totalProdutos] = categoria;
        precos[totalProdutos] = preco;
        quantidades[totalProdutos] = quantidade;

        totalProdutos++;

        System.out.println("Produto cadastrado com sucesso!");
    }

    // Lê e valida a categoria do produto
    public static String lerCategoria() {
        System.out.println("\nCategoria do produto:");
        System.out.println("1 - Fruta");
        System.out.println("2 - Legume");
        System.out.println("3 - Verdura");
        System.out.print("Escolha: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        return switch (opcao) {
            case 1 -> "Fruta";
            case 2 -> "Legume";
            case 3 -> "Verdura";
            default -> null;
        };
    }

    // Lista todos os produtos cadastrados
    public static void listarProdutos() {
        if (totalProdutos == 0) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        System.out.println("\n===== ESTOQUE =====");

        for (int i = 0; i < totalProdutos; i++) {
            System.out.printf(
                "%d - %s | Categoria: %s | Preço: R$ %.2f"
                + " | Quantidade: %d%n",
                i + 1,
                nomes[i],
                categorias[i],
                precos[i],
                quantidades[i]
            );
        }
    }

    // Consulta os dados de um produto
    public static void consultarProduto() {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        int indice = buscarProduto(nome);

        if (indice == -1) {
            System.out.println("Produto não encontrado.");
            return;
        }

        System.out.println("\n===== PRODUTO =====");
        System.out.println("Nome: " + nomes[indice]);
        System.out.println("Categoria: " + categorias[indice]);
        System.out.printf("Preço: R$ %.2f%n", precos[indice]);
        System.out.println("Quantidade: " + quantidades[indice]);
    }

    // Edita os dados de um produto
    public static void editarProduto() {
        System.out.print("Nome do produto a editar: ");
        String nome = scanner.nextLine();

        int indice = buscarProduto(nome);

        if (indice == -1) {
            System.out.println("Produto não encontrado.");
            return;
        }

        System.out.print("Novo nome: ");
        String novoNome = scanner.nextLine();

        int produtoExistente = buscarProduto(novoNome);

        if (produtoExistente != -1 && produtoExistente != indice) {
            System.out.println("Já existe outro produto com esse nome!");
            return;
        }

        String novaCategoria = lerCategoria();

        if (novaCategoria == null) {
            System.out.println("Categoria inválida!");
            return;
        }

        System.out.print("Novo preço (R$): ");
        double novoPreco = scanner.nextDouble();

        System.out.print("Nova quantidade: ");
        int novaQuantidade = scanner.nextInt();
        scanner.nextLine();

        if (novoPreco < 0 || novaQuantidade < 0) {
            System.out.println("Valores inválidos!");
            return;
        }

        nomes[indice] = novoNome;
        categorias[indice] = novaCategoria;
        precos[indice] = novoPreco;
        quantidades[indice] = novaQuantidade;

        System.out.println("Produto atualizado com sucesso!");
    }

    // Remove um produto e reorganiza os arrays
    public static void removerProduto() {
        System.out.print("Nome do produto a remover: ");
        String nome = scanner.nextLine();

        int indice = buscarProduto(nome);

        if (indice == -1) {
            System.out.println("Produto não encontrado.");
            return;
        }

        for (int i = indice; i < totalProdutos - 1; i++) {
            nomes[i] = nomes[i + 1];
            categorias[i] = categorias[i + 1];
            precos[i] = precos[i + 1];
            quantidades[i] = quantidades[i + 1];
        }

        totalProdutos--;

        nomes[totalProdutos] = null;
        categorias[totalProdutos] = null;
        precos[totalProdutos] = 0;
        quantidades[totalProdutos] = 0;

        System.out.println("Produto removido com sucesso!");
    }

    // Calcula o valor financeiro total do estoque
    public static void calcularValorEstoque() {
        double valorTotal = 0;

        for (int i = 0; i < totalProdutos; i++) {
            valorTotal += precos[i] * quantidades[i];
        }

        System.out.printf(
            "Valor total do estoque: R$ %.2f%n",
            valorTotal
        );
    }

    // Busca um produto pelo nome e retorna sua posição
    public static int buscarProduto(String nome) {
        for (int i = 0; i < totalProdutos; i++) {
            if (nomes[i].equalsIgnoreCase(nome)) {
                return i;
            }
        }

        return -1;
    }
}
