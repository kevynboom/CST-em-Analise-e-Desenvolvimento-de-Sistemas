import java.util.Scanner;

public class EgExerciciosPraticos {

    public static void main(String[] args) {
        // Gestão de recursos com try-with-resources para fechar automaticamente o Scanner
        try (Scanner sc = new Scanner(System.in)) {
            int opcao;

            do {
                System.out.println("\n=== MENU DE EXERCÍCIOS PRÁTICOS ===");
                System.out.println("1 - Cálculo da Média Escolar (4 notas e nome do aluno)");
                System.out.println("2 - Conversão de Temperatura (Celsius para Kelvin)");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = sc.nextInt();
                sc.nextLine(); // Limpeza do buffer do teclado após a leitura do número inteiro

                switch (opcao) {
                    case 1:
                        calcularMediaAluno(sc);
                        break;
                    case 2:
                        converterCelsiusParaKelvin(sc);
                        break;
                    case 0:
                        System.out.println("\nA encerrar o programa...");
                        break;
                    default:
                        System.out.println("\nOpção inválida! Tente novamente.");
                }

            } while (opcao != 0);
        }
    }

    // =========================================================================
    // 1. CÁLCULO DA MÉDIA DO ALUNO
    // =========================================================================
    /**
     * Recolhe o nome e quatro notas de um aluno via consola e calcula a sua média aritmética.
     */
    public static void calcularMediaAluno(Scanner sc) {
        System.out.println("\n--- [1] Cálculo da Média Escolar ---");

        // Leitura de texto com sc.nextLine()
        System.out.print("Insira o nome do aluno: ");
        String nomeAluno = sc.nextLine();

        // Leitura de múltiplos valores em vírgula flutuante (double)
        System.out.println("Insira as 4 notas do aluno (separadas por espaço ou Enter):");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();

        // Cálculo da média aritmética simples
        double media = (num1 + num2 + num3 + num4) / 4.0;

        // Exibição dos resultados no ecrã
        System.out.println("A média do aluno " + nomeAluno + " é de " + media + " pontos.");
    }

    // =========================================================================
    // 2. CONVERSÃO DE TEMPERATURA (CELSIUS -> KELVIN)
    // =========================================================================
    /**
     * Efetua a conversão de graus Celsius para Kelvin através da constante 273.15.
     */
    public static void converterCelsiusParaKelvin(Scanner sc) {
        System.out.println("\n--- [2] Conversão de Temperatura ---");

        System.out.print("Insira a temperatura em graus Celsius (°C): ");
        double celsius = sc.nextDouble();

        // Inicialização da constante base da escala Kelvin
        double kelvin = 273.15;
        kelvin += celsius; // Operador de atribuição cumulativa equivalente a: kelvin = kelvin + celsius

        // Apresentação de ambas as escalas térmicas no ecrã
        System.out.println(celsius + "°C equivalem a " + kelvin + " K");
    }
}