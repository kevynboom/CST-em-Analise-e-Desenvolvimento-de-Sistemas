import java.util.Scanner;
import javax.swing.JOptionPane;

public class Metodos {
    static Scanner sc = new Scanner(System.in); // Criando scanner de forma global
    public static void main(String[] args) {

        exibir("Digite dois números inteiros:");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int resultado = somar(num1, num2);
        boolean paridade = verificarParidade(resultado);

        exibir("O resultado foi: " + resultado, "green");
        exibir("O resultado é par? " + paridade, "yellow");

        sc.close(); // Fechando Scanner
    }

    // Soma dois números inteiros
    public static int somar(int n1, int n2) {
        return n1 + n2;
    }

    // Sobrecarga do método somar: soma três números inteiros
    public static int somar(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    // Exibe um texto no console
    public static void exibir(String texto) {
        System.out.println(texto);
        // Exibe uma caixa de mensagem
        JOptionPane.showMessageDialog(null, texto);
    }

    // Exibe um texto no console com a cor especificada
    public static void exibir(String texto, String cor) {
        String vermelho = "\u001B[31m";
        String verde = "\u001B[32m";
        String amarelo = "\u001B[33m";
        String reset = "\u001B[0m"; // Volta a cor pro padrão após imprimir a linha colorida

        switch (cor) {
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
    }

    // Verifica se um número é par ou ímpar
    public static boolean verificarParidade(int resultado) {
        return resultado % 2 == 0;
    }

    
    public static int lerInteiro(String texto) {
        return Integer.parseInt(JOptionPane.showInputDialog(texto));
    }
}

