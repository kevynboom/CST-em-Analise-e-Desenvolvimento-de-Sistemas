import java.util.Scanner;
// 9) Peça a distância percorrida e o tempo gasto. Calcule a velocidade média da viagem (Velocidade = distância / tempo).
public class ex9 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite a distância da sua viagem em km");
            double distancia = sc.nextDouble();
            System.out.println("Digite o tempo gasto na viagem em h");
            double tempo = sc.nextDouble();
            double velocidade = distancia/tempo;
            System.out.println("A velocidade média feita na viagem foi de "+velocidade+"km/h");
        }
    }
}