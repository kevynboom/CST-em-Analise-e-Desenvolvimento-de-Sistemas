import java.text.DecimalFormat;
import java.util.Scanner;
// 7) Solicite o valor de um produto e calcule o preço com 10% de desconto.
public class ex7 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite o valor do produto");
            double valor = sc.nextDouble();
            double desconto = valor*0.9;
            DecimalFormat df = new DecimalFormat("0.00"); // Define 2 casas decimais
            String valorFormatado = df.format(desconto);
            System.out.println("O produto com 10% de desconto saíra por R$"+valorFormatado);
        }
    }
}