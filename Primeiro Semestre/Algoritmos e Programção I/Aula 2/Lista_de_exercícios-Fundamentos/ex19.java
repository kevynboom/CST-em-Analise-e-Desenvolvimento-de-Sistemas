import java.util.Scanner;
// 19) Solicite o valor de um produto e a taxa de imposto (%) a ser aplicada. Calcule o valor final.

public class ex19 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Informe o valor do produto (R$) e a taxa de imposto (%) separados por um espaço");
            double produto = sc.nextDouble();
            double imposto = sc.nextDouble();

            double valorFinal = produto + (produto * (imposto / 100)); // Calcula o valor final somando o produto com o imposto

            System.out.printf("O valor final do produto será de R$%.2f\n", valorFinal);
        }
    }
}
