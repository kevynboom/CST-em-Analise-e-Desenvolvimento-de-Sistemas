import java.util.Scanner;
// 20) Peça ao usuário um valor inteiro representando uma quantidade de segundos. Converta esse valor para o formato horas, minutos e segundos e exiba o resultado. 
// Exemplo: Entrada: 3672 Saída: 1 hora(s), 1 minuto(s) e 12 segundo(s)

public class ex20 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Informe a quantidade de segundos:");
            int segundos = sc.nextInt();

            int horas = segundos / 3600;
            segundos = segundos % 3600;
            int minutos = segundos / 60;
            segundos = segundos % 60;
            
            System.out.printf("%d hora(s), %d minuto(s) e %d segundo(s)\n", horas, minutos, segundos);
        }
    }
}
