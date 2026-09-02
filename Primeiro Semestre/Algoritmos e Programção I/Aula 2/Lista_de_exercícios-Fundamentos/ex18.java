import java.util.Scanner;
// 18) Peça um valor em minutos e converta para horas e minutos. Ex: 130 minutos → 2 horas e 10 minutos

public class ex18 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Informe um valor em minutos");
            int minutos = sc.nextInt();

            int horas = minutos/60;
            int minutosRestantes = minutos%60;
            
            System.out.printf("%02dh e %02dm\n", horas, minutosRestantes); // Saída formatada
        }
    }
}
