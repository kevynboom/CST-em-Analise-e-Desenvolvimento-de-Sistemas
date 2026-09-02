import java.util.Scanner;

public class Lista2 {

    public static void main(String[] args) {
        // O try-with-resources mantém o Scanner aberto durante todo o ciclo do menu
        // e satisfaz a verificação do VS Code sem vazamento de memória.
        try (Scanner sc = new Scanner(System.in)) {
            int opcao;

            do {
                exibirMenu();
                
                // Validação básica para evitar crash caso o usuário digite texto em vez de número
                if (sc.hasNextInt()) {
                    opcao = sc.nextInt();
                    sc.nextLine(); // Limpa o buffer de quebra de linha
                } else {
                    System.out.println("\n[Erro] Digite apenas números válidos!");
                    sc.next(); // Descarta a entrada inválida
                    opcao = -1; // Garante que o loop continue
                    continue;
                }

                // Bloco switch para direcionar a execução
                switch (opcao) {
                    case 1 -> executarExercicio1(sc);
                    case 2 -> executarExercicio2(sc);
                    case 3 -> executarExercicio3(sc);
                    case 0 -> System.out.println("\nEncerrando o programa. Até logo!");
                    default -> System.out.println("\n[Aviso] Opção inválida! Escolha uma opção do menu.");
                }

                // Pausa antes de redesenhar o menu (se não for para sair)
                if (opcao != 0) {
                    pausar(sc);
                }

            } while (opcao != 0);
        }
    }

    private static void exibirMenu() {
        System.out.println("\n==============================");
        System.out.println("       MENU DE EXERCÍCIOS     ");
        System.out.println("==============================");
        System.out.println("1. Exercício 1 (Descrição)");
        System.out.println("2. Exercício 2 (Descrição)");
        System.out.println("3. Exercício 3 (Descrição)");
        System.out.println("0. Sair");
        System.out.println("==============================");
        System.out.print("Escolha sua opção: ");
    }

    private static void executarExercicio1(Scanner sc) {
        System.out.println("\n--- Executando Exercício 1 ---");
        // Escreva o código do seu primeiro programa aqui
        System.out.println("Exercício 1 concluído.");
    }

    private static void executarExercicio2(Scanner sc) {
        System.out.println("\n--- Executando Exercício 2 ---");
        // Escreva o código do seu segundo programa aqui
        System.out.println("Exercício 2 concluído.");
    }

    private static void executarExercicio3(Scanner sc) {
        System.out.println("\n--- Executando Exercício 3 ---");
        // Escreva o código do seu terceiro programa aqui
        System.out.println("Exercício 3 concluído.");
    }

    private static void pausar(Scanner sc) {
        System.out.println("\nPressione Enter para voltar ao menu...");
        sc.nextLine();
    }
}