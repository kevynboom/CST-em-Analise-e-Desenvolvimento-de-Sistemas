import java.util.Scanner;

public class ExemplosSe {
    public static void main(String[] args) {
        double n1,n2,media;

        try(Scanner ler = new Scanner(System.in)) {
            System.out.println("Informe as notas");
            n1 = ler.nextDouble();
            n2 = ler.nextDouble();

            media = (n1+n2)/2;

            if (media>6) {
                System.out.println("Aluno aprovado!");
                System.out.println("Parabéns!");
        }
    }
}
