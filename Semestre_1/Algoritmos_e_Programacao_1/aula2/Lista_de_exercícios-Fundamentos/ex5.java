import java.util.Scanner;
// 5) Solicite a idade em anos e converta para dias (desconsidere anos bissextos).
public class ex5 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite sua idade");
            int idade = sc.nextInt();
            int dias = idade*365;
            System.out.println("Sua idade em dias é de aproximadamente "+dias+".");
        }
    }
}