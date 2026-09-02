import java.util.Scanner;
// 2) Peça a base e a altura de um retângulo e calcule sua área.

public class ex2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Insira a base do retângulo em cm");
            double base = sc.nextDouble();

            System.out.println("Insira a altura do retângulo em cm");
            double altura = sc.nextDouble();

            double area = base*altura;
            
            System.out.println("A área do seu retângulo é de "+area+" cm².");
        }
    }
}