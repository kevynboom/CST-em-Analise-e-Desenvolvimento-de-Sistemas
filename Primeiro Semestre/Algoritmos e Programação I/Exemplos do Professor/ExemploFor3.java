import java.util.Random;
import java.util.Scanner;

public class ExemploFor3 {
    // Descobrir a idade média em 5000 visitantes
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int idade, qtd, qtdMenor, qtdMaior = 0, media = 0;

        System.out.println("Quantos visitantes respoderão a pesquisa?");
        qtd = sc.nextInt();
        for (int i = 1; i < qtd; i++) {
            System.out.println("Informe a idade do visitante " + i);
            idade = rand.nextInt(0,131);
            if (idade >= 18) {
                qtdMaior++;
            }
            media += idade;  
        }
        media /= qtd;
        qtdMenor = qtd - qtdMaior;
        System.out.printf("A média de idade dos visitantes é de %d.", media);
        System.out.printf("%d dos visitantes são maiores de idade.", qtdMaior);
        System.out.printf("%d dos visitantes são menores de idade.", qtdMenor);
    }
}