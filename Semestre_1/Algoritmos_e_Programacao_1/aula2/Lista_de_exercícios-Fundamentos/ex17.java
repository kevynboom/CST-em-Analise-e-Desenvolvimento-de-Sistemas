import java.util.Scanner;
// 17) Peça o valor total da conta e o número de pessoas. Calcule quanto cada um deve pagar.

public class ex17 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Informe o valor da conta e para quantas pessoas a conta será divida (separados por espaço)");
            double conta = sc.nextDouble();
            double pessoas = sc.nextDouble();

            double divisao = conta/pessoas;
            
            System.out.println("A conta ficou R$"+divisao+" para cada pessoa.");
        }
    }
}
