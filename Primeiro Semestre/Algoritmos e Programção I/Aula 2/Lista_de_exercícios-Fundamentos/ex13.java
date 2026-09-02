import java.text.DecimalFormat;
import java.util.Scanner;
// 13) Peça a cotação do dólar e um valor em dólar. Converta para reais.

public class ex13 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            DecimalFormat df = new DecimalFormat("#.00");
            
            System.out.println("Digite o valor da cotação do dólar e o valor em dólares a ser convertido, separados por espaço");
            double cotacao = sc.nextDouble();
            double reais = sc.nextDouble();

            double resultado = reais*cotacao;

            System.out.println("O valor correspondente é de R$ "+df.format(resultado)+".");
        }
    }
}
