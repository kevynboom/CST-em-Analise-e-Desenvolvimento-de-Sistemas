import static java.lang.Math.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class EgMetodos {

    // Scanner global para leitura via console
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            String menu = """
                    === MENU DE EXEMPLOS DIDÁTICOS ===
                    1 - Soma e Verificação de Paridade (Sobrecarga de Inteiros)
                    2 - Calculadora Simples (Operações com Double e Switch)
                    3 - Cálculo e Classificação de IMC (Math e Condicionais)
                    0 - Sair
                    Escolha uma opção:
                    """;

            opcao = lerInteiro(menu);

            switch (opcao) {
                case 1:
                    executarExemploParidade();
                    break;
                case 2:
                    executarExemploCalculadora();
                    break;
                case 3:
                    executarExemploIMC();
                    break;
                case 0:
                    exibir("Encerrando a aplicação...", "yellow");
                    break;
                default:
                    exibir("Opção inválida! Tente novamente.", "red");
            }

        } while (opcao != 0);

        sc.close(); // Fechando o Scanner global
    }

    // =========================================================================
    // FLUXOS DIDÁTICOS DE DEMONSTRAÇÃO
    // =========================================================================

    /**
     * Demonstra leitura, sobrecarga de métodos com inteiros e validação de paridade.
     */
    public static void executarExemploParidade() {
        int n1 = lerInteiro("Informe o primeiro número inteiro:");
        int n2 = lerInteiro("Informe o segundo número inteiro:");

        // Uso do somar com 2 inteiros
        int soma2 = somar(n1, n2);
        boolean par = verificarParidade(soma2);

        exibir("A soma de " + n1 + " + " + n2 + " é: " + soma2, "green");
        exibir("O resultado é par? " + (par ? "Sim (par)" : "Não (ímpar)"), "yellow");

        // Demonstração da sobrecarga somando 3 valores
        int n3 = lerInteiro("Informe um terceiro número para somar:");
        int soma3 = somar(n1, n2, n3);
        exibir("A soma dos 3 números é: " + soma3, "green");
    }

    /**
     * Demonstra operações aritméticas com double e controle de fluxo via switch-case.
     */
    public static void executarExemploCalculadora() {
        double num1 = lerDouble("Calculadora: informe o primeiro número:");
        double num2 = lerDouble("Calculadora: informe o segundo número:");
        String operacao = lerString("Informe a operação desejada (+, -, *, /):");
        double resultado;

        switch (operacao) {
            case "+":
                resultado = somar(num1, num2); // Sobrecarga: invoca a versão double
                break;
            case "-":
                resultado = subtrair(num1, num2);
                break;
            case "*":
                resultado = multiplicar(num1, num2);
                break;
            case "/":
                if (num2 == 0) {
                    exibir("Erro: Divisão por zero não é permitida.", "red");
                    return;
                }
                resultado = dividir(num1, num2);
                break;
            default:
                exibir("Operação inválida!", "red");
                return;
        }

        exibir("Resultado da operação (" + operacao + "): " + resultado, "green");
    }

    /**
     * Demonstra validação de parâmetros, uso de funções matemáticas e encadeamento lógico.
     */
    public static void executarExemploIMC() {
        double peso = lerDouble("Informe o peso (kg):");
        double altura = lerDouble("Informe a altura (m, ex: 1.75):");

        // Validação básica dos dados de entrada
        if (peso <= 0 || altura <= 0 || peso > 400 || altura > 2.5) {
            exibir("Dados inválidos para peso ou altura.", "red");
            return;
        }

        double imc = calcularIMC(peso, altura);
        String classificacao = classificarIMC(imc);

        exibir(String.format("Seu IMC é: %.2f\nClassificação: %s", imc, classificacao), "green");
    }

    // =========================================================================
    // MÉTODOS ARITMÉTICOS E SOBRECARGA (OVERLOADING)
    // =========================================================================

    /**
     * Soma dois números inteiros.
     * 
     * @param n1 primeiro operando
     * @param n2 segundo operando
     * @return soma dos inteiros
     */
    public static int somar(int n1, int n2) {
        return n1 + n2;
    }

    /**
     * Sobrecarga por quantidade: soma três números inteiros.
     * 
     * @param n1 primeiro operando
     * @param n2 segundo operando
     * @param n3 terceiro operando
     * @return soma dos três inteiros
     */
    public static int somar(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    /**
     * Sobrecarga por tipo: soma dois valores em ponto flutuante (double).
     * 
     * @param n1 primeiro número
     * @param n2 segundo número
     * @return soma decimal
     */
    public static double somar(double n1, double n2) {
        return n1 + n2;
    }

    /**
     * Subtrai dois números reais.
     */
    public static double subtrair(double n1, double n2) {
        return n1 - n2;
    }

    /**
     * Multiplica dois números reais.
     */
    public static double multiplicar(double n1, double n2) {
        return n1 * n2;
    }

    /**
     * Divide dois números reais.
     */
    public static double dividir(double n1, double n2) {
        return n1 / n2;
    }

    /**
     * Verifica se um número inteiro é par usando o operador de módulo (%).
     * 
     * @param numero valor a testar
     * @return true se for par, false se for ímpar
     */
    public static boolean verificarParidade(int numero) {
        return numero % 2 == 0;
    }

    // =========================================================================
    // MÉTODOS DE CÁLCULO E CLASSIFICAÇÃO (REGRAS DE NEGÓCIO)
    // =========================================================================

    /**
     * Calcula o IMC utilizando a fórmula peso / (altura^2).
     * Usa o método estático pow() da classe Math.
     * 
     * @param peso peso em quilogramas
     * @param altura altura em metros
     * @return valor calculado do IMC
     */
    public static double calcularIMC(double peso, double altura) {
        return peso / pow(altura, 2);
    }

    /**
     * Classifica a faixa corporal com base no valor do IMC calculado.
     * 
     * @param imc índice de massa corpórea
     * @return descrição da faixa de peso
     */
    public static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 24.9) {
            return "Normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    // =========================================================================
    // MÉTODOS DE ENTRADA E SAÍDA (I/O) E FORMATAÇÃO VISUAL
    // =========================================================================

    /**
     * Lê uma String via janela de diálogo gráfica (JOptionPane).
     * 
     * @param texto mensagem descritiva
     * @return texto digitado pelo usuário
     */
    public static String lerString(String texto) {
        return JOptionPane.showInputDialog(texto);
    }

    /**
     * Lê um valor inteiro via janela de diálogo com conversão de tipo (parse).
     * 
     * @param texto mensagem descritiva
     * @return inteiro digitado
     */
    public static int lerInteiro(String texto) {
        return Integer.parseInt(JOptionPane.showInputDialog(texto));
    }

    /**
     * Lê um valor decimal (double) via janela de diálogo com conversão de tipo (parse).
     * 
     * @param texto mensagem descritiva
     * @return double digitado
     */
    public static double lerDouble(String texto) {
        return Double.parseDouble(JOptionPane.showInputDialog(texto));
    }

    /**
     * Exibe a mensagem simultaneamente no console e em janela gráfica de diálogo.
     * 
     * @param texto conteúdo a ser mostrado
     */
    public static void exibir(String texto) {
        System.out.println(texto);
        JOptionPane.showMessageDialog(null, texto);
    }

    /**
     * Exibe o texto colorido no console utilizando códigos de escape ANSI e
     * também exibe em janela de diálogo.
     * 
     * @param texto conteúdo a ser exibido
     * @param cor nome da cor ("red", "green", "yellow")
     */
    public static void exibir(String texto, String cor) {
        String vermelho = "\u001B[31m";
        String verde = "\u001B[32m";
        String amarelo = "\u001B[33m";
        String reset = "\u001B[0m"; // Restaura a cor padrão do terminal

        switch (cor.toLowerCase()) {
            case "red":
                System.out.println(vermelho + texto + reset);
                break;
            case "green":
                System.out.println(verde + texto + reset);
                break;
            case "yellow":
                System.out.println(amarelo + texto + reset);
                break;
            default:
                System.out.println(texto);
        }

        JOptionPane.showMessageDialog(null, texto);
    }
}