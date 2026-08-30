import java.util.Scanner;
// 8) Solicite o salário atual e calcule o novo salário com aumento de 15%. Informe também o valor monetário do aumento.

public class ex8 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite seu salário em R$");
            double salarioAtual = sc.nextDouble();

            double salarioNovo = salarioAtual*1.15;
            double aumento = salarioNovo-salarioAtual;
            
            System.out.println("Seu salário de R$"+salarioAtual+" irá para R$"+salarioNovo+" (+15%).");
            System.out.println("O aumento foi de R$"+aumento+".");
        }
    }
}