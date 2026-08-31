import java.util.Scanner;

public class ExemploSe3 {
    public static void main(String[] args) {
    double nota, frequencia;
    String mensagem;

    try(Scanner sc = new Scanner(System.in)) {
        System.out.println("Informe a nota de 0 a 10");
        nota = sc.nextDouble();

        System.out.println("Informe a frequência de 0 a 100");
        frequencia = sc.nextDouble();

        if (frequencia < 75) {
            mensagem = "Aluno reprovado!❌";
        }else if (nota > 5.6) {
            mensagem = "Aluno aprovado!✅";
        }else if (nota >= 3) {
            mensagem = "Aluno de recuperação...🟡";
        }else if (nota >= 2) {
            mensagem = "Aluno no REA...🟡";
        }else {
            mensagem = "Aluno aprovado!✅";
            }
            System.out.println(mensagem);
        }
    }
}