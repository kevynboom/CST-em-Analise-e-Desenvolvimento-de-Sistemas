import java.util.Scanner;
// 16) Solicite a duração de uma viagem em horas e minutos. Exiba o total em minutos.

public class ex16 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Informe a duração da sua viagem em horas e minutos (separados por espaço)");
            double horas = sc.nextDouble();
            double minutos = sc.nextDouble();

            double horasConvertidas = horas*60;
            double duracaoTotal = horasConvertidas+minutos;
            
            System.out.println("Sua viagem durará (ou durou) "+duracaoTotal+" minutos.");
        }
    }
}
