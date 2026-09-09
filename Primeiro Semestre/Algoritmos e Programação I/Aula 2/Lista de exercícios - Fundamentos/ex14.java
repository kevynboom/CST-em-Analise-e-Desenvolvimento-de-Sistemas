import java.util.Scanner;
// 14) Solicite dois números inteiros e exiba o quociente inteiro e o resto da divisão entre eles.

public class ex14 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite um dividendo e um divisor (n°s inteiros) separados por um espaço");
            int dividendo = sc.nextInt();
            int divisor = sc.nextInt();

            int quociente = dividendo/divisor;
            int resto = dividendo%divisor;
            
            System.out.println("O quociente deles é de "+quociente+" e o resto da divisão é de "+resto+".");
        }
    }
}
