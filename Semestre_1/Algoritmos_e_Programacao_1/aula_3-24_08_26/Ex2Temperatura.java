import java.util.Scanner;
/*2. Crie um código em JAVA para realizar a conversão de temperatura em graus 
    Celsius para Kelvin. Exibir na tela as duas temperaturas. */
public class Ex2Temperatura {
    public static void main(String[] args) {
    double celsius, kelvin = 273.15; // Já atribuindo valor para Kelvin para facilitar conversão mais pra frente
    try (Scanner sc = new Scanner(System.in)) {
    System.out.println("Insira a temperatura em Celsius");
        celsius = sc.nextDouble ();
    }
    kelvin += celsius; // Escrever assim funciona pois o valor de Kelvin já foi definido anteriormente, isso fará: kelvin = kelvin + celsius (sendo kelvin = 273.15)
    System.out.println(celsius + "°C é " + kelvin + "°K");
    }
}