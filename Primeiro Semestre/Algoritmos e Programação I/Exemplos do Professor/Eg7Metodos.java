import static java.lang.Math.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Eg7Metodos {

    // Scanner global para leitura de dados pelo console
    static Scanner leitor = new Scanner(System.in);

    // ==================================================
    // MÉTODOS DE SOMA
    // ==================================================

    /**
     * Soma dois valores inteiros recebidos via parâmetros.
     *
     * @param n1 primeiro número a ser somado
     * @param n2 segundo número a ser somado
     * @return soma dos dois números
     */
    public static int somar(int n1, int n2) {
        int soma;
        soma = n1 + n2;
        return soma;
    }

    /**
     * Soma três valores inteiros recebidos via parâmetros.
     *
     * @param n1 primeiro número a ser somado
     * @param n2 segundo número a ser somado
     * @param n3 terceiro número a ser somado
     * @return soma dos três números
     */
    public static int somar(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    /**
     * Soma dois valores decimais recebidos via parâmetros.
     *
     * @param n1 primeiro número a ser somado
     * @param n2 segundo número a ser somado
     * @return soma dos dois números
     */
    public static double somar(double n1, double n2) {
        return n1 + n2;
    }

    // ==================================================
    // MÉTODOS DE OPERAÇÕES MATEMÁTICAS
    // ==================================================

    /**
     * Subtrai o segundo número do primeiro.
     *
     * @param n1 primeiro número
     * @param n2 segundo número
     * @return resultado da subtração
     */
    public static double subtrair(double n1, double n2) {
        return n1 - n2;
    }

    /**
     * Multiplica dois números.
     *
     * @param n1 primeiro número
     * @param n2 segundo número
     * @return resultado da multiplicação
     */
    public static double multiplicar(double n1, double n2) {
        return n1 * n2;
    }

    /**
     * Divide o primeiro número pelo segundo.
     *
     * @param n1 dividendo
     * @param n2 divisor
     * @return resultado da divisão
     */
    public static double dividir(double n1, double n2) {
        return n1 / n2;
    }

    // ==================================================
    // MÉTODOS DE ENTRADA DE DADOS
    // ==================================================

    /**
     * Exibe uma caixa de diálogo para inserir um número inteiro.
     *
     * @param texto texto exibido na caixa de diálogo
     * @return valor inteiro digitado
     */
    public static int lerInteiro(String texto) {
        return Integer.parseInt(JOptionPane.showInputDialog(texto));
    }

    /**
     * Exibe uma caixa de diálogo para inserir um número decimal.
     *
     * @param texto texto exibido na caixa de diálogo
     * @return valor decimal digitado
     */
    public static double lerDouble(String texto) {
        return Double.parseDouble(JOptionPane.showInputDialog(texto));
    }

    /**
     * Exibe uma caixa de diálogo para inserir um texto.
     *
     * @param texto texto exibido na caixa de diálogo
     * @return texto digitado
     */
    public static String lerString(String texto) {
        return JOptionPane.showInputDialog(texto);
    }

    // ==================================================
    // MÉTODOS DE SAÍDA DE DADOS
    // ==================================================

    /**
     * Exibe o texto recebido em uma caixa de mensagem.
     *
     * @param texto texto a ser exibido
     */
    public static void exibir(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }

    /**
     * Exibe um texto no console com a cor especificada.
     *
     * @param texto texto a ser exibido
     * @param cor red, green ou yellow; outras opções usam a cor padrão
     */
    public static void exibir(String texto, String cor) {
        switch (cor) {
            case "red":
                System.out.println("\u001B[31m" + texto);
                break;
            case "green":
                System.out.println("\u001B[32m" + texto);
                break;
            case "yellow":
                System.out.println("\u001B[33m" + texto);
                break;
            default:
                System.out.println(texto);
        }
    }

    // ==================================================
    // MÉTODOS DE VERIFICAÇÃO E CLASSIFICAÇÃO
    // ==================================================

    /**
     * Verifica se um número é par.
     *
     * @param numero número a ser verificado
     * @return true se for par ou false se for ímpar
     */
    public static boolean isPair(int numero) {
        return numero % 2 == 0;
    }

    /**
     * Calcula o Índice de Massa Corporal (IMC).
     *
     * @param peso peso em quilogramas
     * @param altura altura em metros
     * @return valor do IMC
     */
    public static double calcularIMC(double peso, double altura) {
        return peso / pow(altura, 2);
    }

    /**
     * Classifica o IMC recebido.
     *
     * @param imc valor do IMC a ser classificado
     * @return classificação do IMC
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

    // ==================================================
    // EXEMPLO 1: SOMA DE DOIS NÚMEROS INTEIROS
    // ==================================================

    public static void Exemplo1() {
        int num1, num2, resultado;

        exibir("Informe dois números");
        num1 = leitor.nextInt();
        num2 = leitor.nextInt();

        resultado = somar(num1, num2);

        exibir("A soma dos dois números é " + resultado, "yellow");
    }

    // ==================================================
    // EXEMPLO 2: VERIFICAÇÃO DE NÚMERO PAR OU ÍMPAR
    // ==================================================

    public static void Exemplo2() {
        int numero;
        String parOuImpar;

        numero = lerInteiro("Digite um número");

        if (isPair(numero)) {
            parOuImpar = "par";
        } else {
            parOuImpar = "ímpar";
        }

        exibir("O número é " + parOuImpar);
    }

    // ==================================================
    // EXEMPLO 3: CÁLCULO E CLASSIFICAÇÃO DO IMC
    // ==================================================

    public static void Exemplo3() {
        double peso, altura, imc;

        peso = lerDouble("Informe o peso");
        altura = lerDouble("Informe a altura");

        if (peso < 0 || altura < 0 || peso > 400 || altura > 2.5) {
            exibir("Dados inválidos. Encerrando...");
            return;
        }

        imc = calcularIMC(peso, altura);

        exibir(classificarIMC(imc));
    }

    // ==================================================
    // EXEMPLO 4: CALCULADORA COM OPERAÇÕES MATEMÁTICAS
    // ==================================================

    public static void Exemplo4() {
        double num1, num2, resultado;
        String operacao;

        num1 = lerDouble("Informe o primeiro número");
        num2 = lerDouble("Informe o segundo número");
        operacao = lerString("Informe a operação desejada");

        switch (operacao) {
            case "+":
                resultado = somar(num1, num2);
                break;
            case "-":
                resultado = subtrair(num1, num2);
                break;
            case "*":
                resultado = multiplicar(num1, num2);
                break;
            case "/":
                resultado = dividir(num1, num2);
                break;
            default:
                exibir("Opção inválida");
                return;
        }

        exibir("O resultado é: " + resultado);
    }

    // ==================================================
    // MÉTODO PRINCIPAL
    // ==================================================

    public static void main(String[] args) {
        Exemplo2();
    }
}