import java.util.Scanner;
// Comparação de String (var. não primitiva)
public class ExemploSe4 {
    public static void main(String[] args) {
        String turma;

        try(Scanner sc = new Scanner(System.in)) {
        System.out.println("Informe a sua turma");    
        turma = sc.next();
        if (turma.equals("A")) { // ou turma.equalsIgnoreCase (caso NÃO queira diferenciar maiúscula de minúscula)
            System.out.println("Bem-vindo à turma A");
        } else {
            System.out.println("Você não é da turma A");
        }
        }
    }
}
