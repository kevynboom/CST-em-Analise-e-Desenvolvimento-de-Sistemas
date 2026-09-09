import java.util.Scanner;
// 11) Peça um número inteiro e exiba seu antecessor e sucessor.

public class ex11 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite um número inteiro");
            int numero = sc.nextInt();

            int antecessor = numero-1;
            int sucessor = numero+1;
            
            System.out.println("Dado o número: "+numero+";");
            System.out.println("Seu antecessor é: "+antecessor+";");
            System.out.println("E seu sucessor é: "+sucessor+".");
        }
    }
}