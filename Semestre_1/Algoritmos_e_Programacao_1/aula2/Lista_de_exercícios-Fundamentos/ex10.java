import java.util.Scanner;
// 10) Solicite o capital, o tempo (t) (em meses) e a taxa de juros mensal (i). Calcule o montante usando juros simples: M = C * (1 + i * t)
public class ex10 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o capital, o tempo (em meses) e a taxa de juros, separados por espaço:");
            double c = sc.nextDouble();
            double t = sc.nextDouble();
            double i = sc.nextDouble();
            double m = c * (1 + i * t);
            System.out.println("O montante será de " + m + ".");
        }
    }
}