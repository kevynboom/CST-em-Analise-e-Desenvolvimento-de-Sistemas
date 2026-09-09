import java.util.Scanner;
// 6) Receba um valor em metros e converta para centímetros, milímetros e quilômetros.

public class ex6 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite um valor em metros");
            double m = sc.nextDouble();

            double cm = m*100;
            double mm = m*1000;
            double km = m/1000;
            
            System.out.println(m+" metros é equivalente à:");
            System.out.println("-> "+cm+" centímetros;");
            System.out.println("-> "+mm+" milímetros;");
            System.out.println("-> "+km+" quilômetros.");
        }
    }
}