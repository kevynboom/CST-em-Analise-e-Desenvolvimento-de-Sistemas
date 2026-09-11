import java.util.Scanner;
/* 1. Crie um código em JAVA para calcular a média de um determinado aluno, 
    através de 4 notas informadas via teclado, juntamente com o nome do aluno. 
    Exibir a média e o nome do aluno na tela. */
public class Ex1Media {
    public static void main(String[] args) {
        // Declarando variaveis para uso:
        String nomeAluno; // Texto
        double num1, num2, num3, num4, media; // Numeros reais e variavel dos numeros a receber e da operação

        try(Scanner sc = new Scanner(System.in)) { // Atribuindo scanner (entrada de dados via teclado) a variavel "sc" para uso

            System.out.println("Insira o nome do aluno"); // texto para usuario pelo console
            nomeAluno = sc.nextLine (); // Recebendo entrada e atribuindo dentro da variavel respectiva

            System.out.println("Insira as 4 notas do aluno (Separadas por espaço)");
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();
            num3 = sc.nextDouble();
            num4 = sc.nextDouble();

            media = (num1 + num2 + num3 + num4)/4; // Processamento da media

            System.out.println("A média do aluno " + nomeAluno + " é de " + media + " pontos");
        }
    } 
}