import java.util.Scanner;
// 3) Solicite o raio de um círculo e calcule a área. (Use Área = π * raio² — considere π como 3.14)

public class ex3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Insira o raio do círculo em cm");
            double raio = sc.nextDouble();

            double pi = 3.14;
            double area = pi*(raio*raio); // Ou "Math.PI*Math.pow(raio,2);"

            System.out.println("A área do seu círculo é de "+area+" cm².");
        }
    }
}