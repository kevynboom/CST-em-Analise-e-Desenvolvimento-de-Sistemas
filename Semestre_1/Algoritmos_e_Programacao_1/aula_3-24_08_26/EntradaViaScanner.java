import java.util.Scanner; // Importação da ferramenta de entrada de dados do Java

public class EntradaViaScanner {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { // Recebendo entradas via teclado, declarando "sc" como variavel para Scanner
            System.out.println("Insira seu nome"); // Saida de texto no terminal
            String nome = sc.nextLine(); // Recebendo nome digitado no teclado e atribuindo-o na variavel "nome"
            System.out.println("Ola " + nome +"!"); // Saida da frase de saudação concatenada com o nome recebido (atribuido na variavel "nome")
        }
    }
}