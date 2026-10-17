import java.util.Scanner;

public class Eg3Somando {

    public static void main(String[] args) {

        // variáveis
        double num1, num2, soma;
        Scanner leitor = new Scanner(System.in);

        // entrada de dados
        System.out.println("Informe o primeiro número");
        num1 = leitor.nextDouble();

        System.out.println("Informe o segundo número");
        num2 = leitor.nextDouble();

        // processamento (somar os valores)
        soma = num1 + num2;

        // saída
        System.out.println("O resultado da soma é: " + soma + "!");
    }
}