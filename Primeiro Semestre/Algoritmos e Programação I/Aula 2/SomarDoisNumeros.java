// Lógica de programação JAVA - 24/08/26
import java.util.Scanner; // Importação da ferramenta de entrada de dados do Java

public class SomarDoisNumeros {
    public static void main(String[] args) {
        double num1, num2, soma; // Declarando as variaveis para podermos usar-las
        
        try(Scanner leitor = new Scanner(System.in)) {
            // Entrada de dados
            System.out.println("Informe o primeiro número");
            num1 = leitor.nextDouble(); // Recebendo primeiro numero
            
            System.out.println("Informe o segundo número");
            num2 = leitor.nextDouble(); // Recebendo segundo numero
           
            soma = num1 + num2; //Realizando a soma com o valor atribuido nas variaveis anteriormente
           
            System.out.println("A soma dos dois números deu: " + soma);
        }
    }
}