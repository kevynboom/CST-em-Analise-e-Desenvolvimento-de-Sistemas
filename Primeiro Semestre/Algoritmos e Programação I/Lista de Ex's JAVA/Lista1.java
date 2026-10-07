import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista1 {
    public static void main(String[] args) {
        int opcao;

        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("\n=== LISTA DE EXERCÍCIOS ===");
                System.out.println("Digite o número do exercício (1 a 20) ou 0 para sair:");
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
                    case 0 -> System.out.println("Encerrando programa...");
                    default -> System.out.println("Opção inválida!");
                }
            } while (opcao != 0);
        }
    }

    // 1) Peça ao usuário seu nome e idade. Mostre uma mensagem como: "Olá, João! Você tem 25 anos".
    public static void ex1(Scanner sc) {
        sc.nextLine(); // Limpa buffer do menu
        System.out.println("Insira o seu nome");
        String nome = sc.nextLine();

        System.out.println("Insira a sua idade");
        int idade = sc.nextInt();

        System.out.println("Olá, " + nome +"! Você tem " + idade + " anos de idade!");
        // System.out.printf("Olá, %s! Você tem %d anos de idade!", nome, idade); // Saída formatada
    }

    // 2) Peça a base e a altura de um retângulo e calcule sua área.
    public static void ex2(Scanner sc) {
        System.out.println("Insira a base do retângulo em cm");
        double base = sc.nextDouble();

        System.out.println("Insira a altura do retângulo em cm");
        double altura = sc.nextDouble();

        double area = base*altura;

        System.out.println("A área do seu retângulo é de "+area+" cm².");
    }

    // 3) Solicite o raio de um círculo e calcule a área. (Use Área = π * raio² — considere π como 3.14)
    public static void ex3(Scanner sc) {
        System.out.println("Insira o raio do círculo em cm");
        double raio = sc.nextDouble();

        double pi = 3.14;
        double area = pi*(raio*raio); // Ou "Math.PI*Math.pow(raio,2);"

        System.out.println("A área do seu círculo é de "+area+" cm².");
    }

    // 4) Solicite o valor da hora trabalhada e o total de horas no mês. Calcule o salário mensal. 
    public static void ex4(Scanner sc) {
        System.out.println("Insira o valor da hora trabalhada em R$");
        double valor = sc.nextDouble();

        System.out.println("Insira a quantidade de horas trabalhadas no mês");
        double quantidade = sc.nextDouble();

        double salario = valor*quantidade;

        System.out.println("Seu salário mensal é de R$"+salario+".");
    }

    // 5) Solicite a idade em anos e converta para dias (desconsidere anos bissextos).
    public static void ex5(Scanner sc) {
        System.out.println("Digite sua idade");
        int idade = sc.nextInt();

        int dias = idade*365;

        System.out.println("Sua idade em dias é de aproximadamente "+dias+".");
    }

    // 6) Receba um valor em metros e converta para centímetros, milímetros e quilômetros.
    public static void ex6(Scanner sc) {
        System.out.println("Digite um valor em metros");
        double m = sc.nextDouble();

        double cm = m*100;
        double mm = m*1000;
        double km = m/1000;

        System.out.println(m+" metros é equivalente à:");
        System.out.println("-> "+cm+" centímetros;");
        System.out.println("-> "+mm+" milímetros;");
        System.out.println("-> "+km+" quilômetros.");
    }

    // 7) Solicite o valor de um produto e calcule o preço com 10% de desconto.
    public static void ex7(Scanner sc) {
        System.out.println("Digite o valor do produto");
        double valor = sc.nextDouble();

        double desconto = valor*0.9;

        DecimalFormat df = new DecimalFormat("0.00"); // Define 2 casas decimais
        String valorFormatado = df.format(desconto);

        System.out.println("O produto com 10% de desconto saíra por R$"+valorFormatado+".");
    }

    // 8) Solicite o salário atual e calcule o novo salário com aumento de 15%. Informe também o valor monetário do aumento.
    public static void ex8(Scanner sc) {
        System.out.println("Digite seu salário em R$");
        double salarioAtual = sc.nextDouble();

        double salarioNovo = salarioAtual*1.15;
        double aumento = salarioNovo-salarioAtual;

        System.out.println("Seu salário de R$"+salarioAtual+" irá para R$"+salarioNovo+" (+15%).");
        System.out.println("O aumento foi de R$"+aumento+".");
    }

    // 9) Peça a distância percorrida e o tempo gasto. Calcule a velocidade média da viagem (Velocidade = distância / tempo).
    public static void ex9(Scanner sc) {
        System.out.println("Digite a distância (em km) e o tempo gasto (em minutos) da sua viagem, separe os valores com um espaço");
        double distancia = sc.nextDouble();
        double minutos = sc.nextDouble();

        double horas = minutos/60;
        double velocidade = distancia/horas;

        System.out.println("A velocidade média feita na viagem foi de "+velocidade+"km/h.");
    }

    // 10) Solicite o capital, o tempo (t) (em meses) e a taxa de juros mensal (i). Calcule o montante usando juros simples: M = C * (1 + i * t)
    public static void ex10(Scanner sc) {
        System.out.println("Digite o capital, o tempo (em meses) e a taxa de juros, separados por espaço");
        double c = sc.nextDouble();
        double t = sc.nextDouble();
        double i = sc.nextDouble();

        double m = c * (1 + i * t);

        System.out.println("O montante será de " + m + ".");
    }

    // 11) Peça um número inteiro e exiba seu antecessor e sucessor.
    public static void ex11(Scanner sc) {
        System.out.println("Digite um número inteiro");
        int numero = sc.nextInt();

        int antecessor = numero-1;
        int sucessor = numero+1;

        System.out.println("Dado o número: "+numero+";");
        System.out.println("Seu antecessor é: "+antecessor+";");
        System.out.println("E seu sucessor é: "+sucessor+".");
    }

    // 12) Peça um número e mostre o dobro, o triplo e a raiz quadrada.
    public static void ex12(Scanner sc) {
        System.out.println("Digite um número");
        double numero = sc.nextDouble();

        double dobro = numero*2;
        double triplo = numero*3;
        double raiz = Math.sqrt(numero);

        System.out.println("Dado "+numero+";");
        System.out.println("O dobro dele é: "+dobro+";");
        System.out.println("O triplo dele é: "+triplo+";");
        System.out.println("E sua raiz quadrada é: "+raiz+".");
    }

    // 13) Peça a cotação do dólar e um valor em dólar. Converta para reais.
    public static void ex13(Scanner sc) {
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Digite o valor da cotação do dólar e o valor em dólares a ser convertido, separados por espaço");
        double cotacao = sc.nextDouble();
        double reais = sc.nextDouble();

        double resultado = reais*cotacao;

        System.out.println("O valor correspondente é de R$ "+df.format(resultado)+".");
    }

    // 14) Solicite dois números inteiros e exiba o quociente inteiro e o resto da divisão entre eles.
    public static void ex14(Scanner sc) {
        System.out.println("Digite um dividendo e um divisor (n°s inteiros) separados por um espaço");
        int dividendo = sc.nextInt();
        int divisor = sc.nextInt();

        int quociente = dividendo/divisor;
        int resto = dividendo%divisor;

        System.out.println("O quociente deles é de "+quociente+" e o resto da divisão é de "+resto+".");
    }

    public static void ex15(Scanner sc) {
        System.out.println("Informe a altura e largura (em metros) da parede, separe as medidas com um espaço");
        double altura = sc.nextDouble();
        double largura = sc.nextDouble();

        double area = altura*largura;
        double rendimento = 2;
        double tinta = area/rendimento;
        
        System.out.println("Para pintar sua parede serão necessários "+tinta+" litros de tinta.");
    }

    public static void ex16(Scanner sc) {
        System.out.println("Informe a duração da sua viagem em horas e minutos (separados por espaço)");
        double horas = sc.nextDouble();
        double minutos = sc.nextDouble();

        double horasConvertidas = horas*60;
        double duracaoTotal = horasConvertidas+minutos;
        
        System.out.println("Sua viagem durará (ou durou) "+duracaoTotal+" minutos.");
    }

    public static void ex17(Scanner sc) {
        System.out.println("Informe o valor da conta e para quantas pessoas a conta será divida (separados por espaço)");
        double conta = sc.nextDouble();
        double pessoas = sc.nextDouble();

        double divisao = conta/pessoas;
        
        System.out.println("A conta ficou R$"+divisao+" para cada pessoa.");
    }

    public static void ex18(Scanner sc) {
        System.out.println("Informe um valor em minutos");
        int minutos = sc.nextInt();

        int horas = minutos/60;
        int minutosRestantes = minutos%60;
            
        System.out.printf("%02dh e %02dm\n", horas, minutosRestantes); // Saída formatada
    }

    public static void ex19(Scanner sc) {
        System.out.println("Informe o valor do produto (R$) e a taxa de imposto (%) separados por um espaço");
        double produto = sc.nextDouble();
        double imposto = sc.nextDouble();

        double valorFinal = produto + (produto * (imposto / 100)); // Calcula o valor final somando o produto com o imposto

        System.out.printf("O valor final do produto será de R$%.2f\n", valorFinal);
    }

    public static void ex20(Scanner sc) {
        System.out.println("Informe a quantidade de segundos:");
        int segundos = sc.nextInt();

        int horas = segundos / 3600;
        segundos = segundos % 3600;
        int minutos = segundos / 60;
        segundos = segundos % 60;
            
        System.out.printf("%d hora(s), %d minuto(s) e %d segundo(s)\n", horas, minutos, segundos);
    }
}