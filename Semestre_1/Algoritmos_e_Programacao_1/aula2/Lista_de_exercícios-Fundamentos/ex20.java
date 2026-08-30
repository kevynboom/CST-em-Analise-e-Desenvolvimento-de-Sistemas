import java.util.Scanner;
// 20) Peça ao usuário um valor inteiro representando uma quantidade de segundos. Converta esse valor para o formato horas, minutos e segundos e exiba o resultado. 
// Exemplo: Entrada: 3672 Saída: 1 hora(s), 1 minuto(s) e 12 segundo(s)

public class ex20 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Informe a quantidade de segundos:");
            int totalSegundos = sc.nextInt();

            int horas = totalSegundos / 3600;
            int resto = totalSegundos % 3600;
            int minutos = resto / 60;
            int segundos = resto % 60;
            
            System.out.printf("%d hora(s), %d minuto(s) e %d segundo(s)\n", horas, minutos, segundos);
        }
    }
}
