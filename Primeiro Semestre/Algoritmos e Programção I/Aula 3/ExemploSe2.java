import java.util.Scanner;

public class ExemploSe2 {
    public static void main(String[] args) {
    double n1,n2,media;

    try(Scanner ler = new Scanner(System.in)) {
        System.out.println("Informe as notas");
        n1 = ler.nextDouble();
        n2 = ler.nextDouble();

        media = (n1+n2)/2;

        System.out.println(media >= 6 ? "Aluno aprovado!✅" : "Aluno reprovado!❌"); // Operador Ternário
        }
    }
}
