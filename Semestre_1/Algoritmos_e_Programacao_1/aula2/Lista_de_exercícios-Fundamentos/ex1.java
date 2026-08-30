import java.util.Scanner;
// 1) Peça ao usuário seu nome e idade. Mostre uma mensagem como: "Olá, João! Você tem 25 anos".

public class ex1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Insira o seu nome");
            String nome = sc.nextLine();

            System.out.println("Insira a sua idade");
            int idade = sc.nextInt();
            
            System.out.println("Olá " + nome +"! Você tem " + idade + " anos de idade!");
        }      
    }
}
