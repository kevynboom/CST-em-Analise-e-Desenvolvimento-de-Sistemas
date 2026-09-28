import java.util.Scanner;

public class Prova1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Criação do Scanner (não conta para o fluxograma, mas se for contar, então é o 'círculo' vermelho INÍCIO)

        System.out.println("Hoje tem prova! De 1 a 100, qual a porcentagem do seu nervosismo?"); // Display
        int nervoso = sc.nextInt(); // Entrada de dados
        System.out.println("Vamos validar seu nervosismo..."); // Display
        // Ponto de decisão 
        if (nervoso <= 1 || nervoso > 100) { // Lado esquerdo
            System.out.println("INVÁLIDA! Digite seu nervosismo novamente:"); // Display
            nervoso = sc.nextInt(); // Entrada de dados
        } else { // Lado direito
            System.out.println("VÁLIDA!"); // Display
            System.out.println("Nervosismo validado com sucesso!"); // Display
        }
        System.out.printf("Quanto ao seu nervosismo, você está %d%% nervoso. Agora digite a sua idade:\n", nervoso); // Display
        int idade = sc.nextInt(); // Entrada de dados
        System.out.println("Vamos verificar sua maioridade..."); // Display
        // Ponto de decisão                                
        if (idade >= 18) { // Lado esquerdo
            System.out.println("Você é maior de idade! (Ou é imortal)"); // Display
        } else { // Lado direito
            System.out.println("Você é menor de idade... (Ou é um bebê ou nem sequer nasceu)"); // Display
        }
        System.out.println("Para finalizar essa primeira parte da prova, digite um número inteiro qualquer:"); // Display
        int numero = sc.nextInt(); // Entrada de dados
        // Ponto de decisão 
        if (numero == 67) { // Lado direito                                                        
            System.out.println("Nunca mais digite esse número..."); // Display
        }
        sc.close(); // Fechando o Scanner (não conta para o fluxograma, mas se for contar, então é o 'círculo' vermelho FIM)
    }
}