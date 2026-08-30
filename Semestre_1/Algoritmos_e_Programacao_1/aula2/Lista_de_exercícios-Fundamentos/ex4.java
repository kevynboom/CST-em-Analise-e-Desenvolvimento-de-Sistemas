import java.util.Scanner;
// 4) Solicite o valor da hora trabalhada e o total de horas no mês. Calcule o salário mensal. 
public class ex4 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Insira o valor da hora trabalhada em R$");
            double valor = sc.nextDouble();
            System.out.println("Insira a quantidade de horas trabalhadas na semana");
            double quantidade = sc.nextDouble();
            double salario = valor*quantidade;
            System.out.println("Seu salário mensal é de R$"+salario+".");
        }
    }
}
