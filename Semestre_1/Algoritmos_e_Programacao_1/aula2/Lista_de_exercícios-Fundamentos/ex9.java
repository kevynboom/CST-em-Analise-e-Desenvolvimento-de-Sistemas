import java.util.Scanner;
// 9) Peça a distância percorrida e o tempo gasto. Calcule a velocidade média da viagem (Velocidade = distância / tempo).
public class ex9 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite a distância (em km) e o tempo gasto (em minutos) da sua viagem, separe os valores com um espaço");
            double distancia = sc.nextDouble();
            double minutos = sc.nextDouble();
            double horas = minutos/60;
            double velocidade = distancia/horas;
            System.out.println("A velocidade média feita na viagem foi de "+velocidade+"km/h");
        }
    }
}