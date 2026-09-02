import java.util.Scanner;
// 12) Peça um número e mostre o dobro, o triplo e a raiz quadrada.

public class ex12 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite um número");
            double numero = sc.nextDouble();

            double dobro = numero*2;
            double triplo = numero*3;
            double raiz = Math.sqrt(numero);
            
            System.out.println("Dado "+numero+";");
            System.out.println("O dobro dele é: "+dobro+";");
            System.out.println("O triplo dele é: "+triplo+";");
            System.out.println("E sua raiz quadrada é: "+raiz+".");
        }
    }
}
