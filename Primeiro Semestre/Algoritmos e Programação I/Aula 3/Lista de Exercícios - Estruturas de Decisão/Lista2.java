import java.util.Scanner;

public class Lista2 {
    public static void main(String[] args) {
        int opcao;

        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("\n=== LISTA DE EXERCÍCIOS ===");
                System.out.println("Digite o número do exercício (1 a 25) ou 0 para sair:");
                System.out.print("Opção: ");
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1 -> ex1(sc);
                    case 2 -> ex2(sc);
                    case 3 -> ex3(sc);
                    case 4 -> ex4(sc);
                    case 5 -> ex5(sc);
                    case 6 -> ex6(sc);
                    case 7 -> ex7(sc);
                    case 8 -> ex8(sc);
                    case 9 -> ex9(sc);
                    case 10 -> ex10(sc);
                    case 11 -> ex11(sc);
                    case 12 -> ex12(sc);
                    case 13 -> ex13(sc);
                    case 14 -> ex14(sc);
                    case 15 -> ex15(sc);
                    case 16 -> ex16(sc);
                    case 17 -> ex17(sc);
                    case 18 -> ex18(sc);
                    case 19 -> ex19(sc);
                    case 20 -> ex20(sc);
                    case 21 -> ex21(sc);
                    case 22 -> ex22(sc);
                    case 23 -> ex23(sc);
                    case 24 -> ex24(sc);
                    case 25 -> ex25(sc);
                    case 0 -> System.out.println("Encerrando programa...");
                    default -> System.out.println("Opção inválida!");
                }
            } while (opcao != 0);
        }
    }

    // Peça um número inteiro e informe se ele é par ou ímpar. 
    public static void ex1(Scanner sc) {
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }

    // Leia um número e informe se ele é positivo, negativo ou zero. 
    public static void ex2(Scanner sc) {
        System.out.print("Digite um número qualquer: ");
        double numero = sc.nextDouble();
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("o número é zero.");
        }
    }

    // Peça dois números e informe qual é o maior. 
    public static void ex3(Scanner sc) {
        System.out.println("Digite dois números inteiros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("O primeiro número é maior.");
        } else if (num1 == num2){
            System.out.println("Os número são iguais!");
        } else {
        System.out.println("O segundo número é maior.");
        }
    }

    // Solicite três números e mostre qual é o maior. 
    public static void ex4(Scanner sc) {
        System.out.println("Digite três números: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        if (num1 > num2 && num1 > num3) {
            System.out.println("O primeiro número é maior.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O segundo número é maior.");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("O terceiro número é maior.");
        } else {
            System.out.println("Existem números iguais entre os maiores!");
        }
    }

    // Peça a nota final do aluno e informe se foi aprovado (nota ≥ 7) ou reprovado. 
    public static void ex5(Scanner sc) {
        System.out.println("Digite a nota final do aluno: ");
        double nota = sc.nextDouble();
        if (nota >= 7) {
            System.out.println("Esse aluno passou de ano!");
        } else {
            System.out.println("Esse aluno está reprovado...");
        }
    }

    // Solicite a idade de uma pessoa e diga se ela pode se aposentar (idade ≥ 65). 
    public static void ex6(Scanner sc) {
        System.out.println("Digite a idade da pessoa: ");
        int idade = sc.nextInt();
        if (idade >= 65) {
            System.out.println("Essa pessoa já pode se aposentar!");
        } else {
            System.out.println("Infelizmente, essa pessoa ainda não pode se aposentar...");
        }
    }

    // Leia um número e informe se ele é múltiplo de 5. 
    public static void ex7(Scanner sc) {
        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();
        if (numero % 5 == 0) {
            System.out.println("O número é múltiplo de 5.");
        } else {
            System.out.println("O número não é múltiplo de 5.");
        }
    }

    // Verifique se um número é divisível ao mesmo tempo por 3 e por 4. 
    public static void ex8(Scanner sc) {
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        if (numero % 3 == 0 && numero % 4 == 0) {
        System.out.println("O número é divisível por 3 e por 4!");
        } else if (numero % 3 == 0) {
            System.out.println("O número é apenas divisível por 3.");
        } else if (numero % 4 == 0) {
            System.out.println("O número é apenas divisível por 4.");
        } else {
        System.out.println("O número não é divisível nem por 3 nem por 4...");
        }
    }

    // Peça a idade de uma pessoa e diga se o voto é obrigatório (entre 18 e 70 anos). 
    public static void ex9(Scanner sc) {
        System.out.println("Digite a idade da pessoa: ");
        int numero = sc.nextInt();
        if (numero >= 18 && numero <= 70) {
            System.out.println("Seu voto é obrigatório!");
        } else {
            System.out.println("Não precisa votar.");
        }
    }

    // Solicite três lados e verifique se formam um triângulo válido. (Soma de dois lados deve ser maior que o terceiro) 
    public static void ex10(Scanner sc) {
        System.out.println("Digite a medida em cm (n° inteiro) dos três lados do triângulo: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("É um triângulo!");
        } else {
            System.out.println("Não é um triângulo...");
        }
    }

    // Se for triângulo válido, diga se é equilátero, isósceles ou escaleno. 
    public static void ex11(Scanner sc) {
        System.out.println("Digite a medida em cm (n° inteiro) dos três lados do triângulo: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            if ( a == b && b == c && a == c) {
                System.out.println("É um triângulo equilátero!");
            } else if (a == b || b == c || c == a) {
                System.out.println("É um triângulo isósceles!");
            } else {
                System.out.println("É um triângulo escaleno!");
            }
        } else {
            System.out.println("Não é um triângulo...");
        }
    }

    // Dado o valor da compra, aplique: 10% de desconto se for maior que R$500, 5% se for entre R$200 e R$500, nenhum desconto se for abaixo de R$200. 
    public static void ex12(Scanner sc) {
        System.out.println("Digite o valor da compra: ");
        double valor = sc.nextDouble();
        if (valor > 500) {
            double desconto10 = valor * 0.9;
            System.out.printf("O preço da compra será de R$%.2f.", desconto10);
        } else if (valor >= 200) {
            double desconto5 = valor * 0.95 ;
            System.out.printf("O preço da compra será de R$%.2f.", desconto5);
        } else {
            System.out.printf("O preço da compra será de R$%.2f.", valor);
        }
    }

    // Leia três números e mostre-os em ordem crescente (sem usar sort). 
    public static void ex13(Scanner sc) {
        System.out.println("Digite três números: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        // Sem usar sort é sacanagem...
        if (num1 < num2 && num2 < num3) {
            System.out.printf("A ordem crescente é: %.2f, %.2f, %.2f", num1, num2, num3);
        } else if (num1 < num3 && num3 < num2) {
            System.out.printf("A ordem crescente é: %.2f, %.2f, %.2f", num1, num3, num2);
        } else if (num2 < num1 && num1 < num3) {
            System.out.printf("A ordem crescente é: %.2f, %.2f, %.2f", num2, num1, num3);
        } else if (num2 < num3 && num3 < num1) {
            System.out.printf("A ordem crescente é: %.2f, %.2f, %.2f", num2, num3, num1);
        } else if (num3 < num1 && num1 < num2) {
            System.out.printf("A ordem crescente é: %.2f, %.2f, %.2f", num3, num1, num2);
        } else {
            System.out.printf("A ordem crescente é: %.2f, %.2f, %.2f", num3, num2, num1);
        }
    }

    // Converta uma nota numérica (0 a 10) para conceitos: A (≥9), B (≥8), C (≥7), D (≥6), E (<6). 
    public static void ex14(Scanner sc) {
        System.out.println("Digite a nota do aluno: ");
        double nota = sc.nextDouble();
        if (nota >= 9) {
            System.out.println("A nota deste aluno é A!");
        } else if (nota >= 8) {
            System.out.println("A nota deste aluno é B!");
        } else if (nota >= 7) {
            System.out.println("A nota deste aluno é C.");
        } else if (nota >= 6) {
            System.out.println("A nota deste aluno é D.");
        } else {
            System.out.println("A nota deste aluno é E...");
        }
    }

    // Peça dois números e uma operação (+, -, *, /). Execute a operação. 
    public static void ex15(Scanner sc) {

    }

    // Peça três números e informe se o terceiro é igual ao primeiro ou ao segundo.
    public static void ex16(Scanner sc) {

    }

    // Informe se dois números têm a mesma paridade (ambos pares ou ambos ímpares). 
    public static void ex17(Scanner sc) {

    }

    // Verifique se um ano é bissexto (divisível por 4, mas não por 100, exceto se divisível por 400). 
    public static void ex18(Scanner sc) {

    }

    // Leia peso e altura e classifique o IMC como: Abaixo do peso (<18.5), Normal (18.5 a 24.9), Sobrepeso (25 a 29.9), Obesidade (30 ou mais).
    public static void ex19(Scanner sc) {

    }

    // Classifique um número em positivo ou negativo, par ou ímpar, e inteiro ou decimal. 
    public static void ex20(Scanner sc) {

    }

    // Implemente um programa que exiba um menu com opções de café da manhã e o usuário deve escolher uma opção 
    // (1 - Pão com manteiga, 2 - Café com leite, 3 - Suco de laranja, 4 - Omelete). O programa deve exibir a escolha feita. 
    public static void ex21(Scanner sc) {

    }

    // Crie uma calculadora simples que permite ao usuário escolher entre soma, subtração, multiplicação ou divisão. 
    // O programa deve pedir dois números e realizar a operação escolhida. 
    public static void ex22(Scanner sc) {

    }

    // Crie um programa onde o usuário deve escolher um tipo de transporte 
    // (1 - Carro, 2 - Bicicleta, 3 - Ônibus, 4 - Avião) e o programa exibe a velocidade média do transporte escolhido. 
    public static void ex23(Scanner sc) {

    }

    // Crie um programa que converta um valor informado pelo usuário de uma moeda para outras moedas (por exemplo: 1 - Dólar, 2 - Euro, 3 - Real). 
    // O programa deve mostrar o valor convertido com base na cotação atual. 
    public static void ex24(Scanner sc) {

    }

    // Implemente um programa onde o usuário escolhe uma figura geométrica (1 - Círculo, 2 - Quadrado, 3 - Retângulo) 
    // e o programa pede as medidas necessárias para calcular a área da figura escolhida.      
    public static void ex25(Scanner sc) {
        
    }

}