import java.util.Scanner;
// 15) Peça a altura e a largura de uma parede e calcule quantos litros de tinta são necessários (Considere que 1 litro pinta 2 m²).

public class ex15 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Informe a altura e largura (em metros) da parede, separe as medidas com um espaço");
            double altura = sc.nextDouble();
            double largura = sc.nextDouble();

            double area = altura*largura;
            double rendimento = 2;
            double tinta = area/rendimento;
            
            System.out.println("Para pintar sua parede serão necessários "+tinta+" litros de tinta.");
        }
    }
}
