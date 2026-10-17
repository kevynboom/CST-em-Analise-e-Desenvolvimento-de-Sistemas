import java.util.Scanner;

public class Eg4IfElse {

    public static void main(String[] args) {

        // Exemplo 1: Estrutura if
        {
            // variáveis
            double n1, n2, media;
            Scanner ler = new Scanner(System.in);

            // entrada
            System.out.println("Informe as notas");
            n1 = ler.nextDouble();
            n2 = ler.nextDouble();

            // cálculo da média
            media = (n1 + n2) / 2;

            // decidir sobre a média
            if (media >= 6) {
                System.out.println("Aluno Aprovado!!");
                System.out.println("Parabéns");
            }
        }

        // Exemplo 2: Operador ternário
        {
            // variáveis
            double n1, n2, media;
            Scanner ler = new Scanner(System.in);

            // entrada
            System.out.println("Informe as notas");
            n1 = ler.nextDouble();
            n2 = ler.nextDouble();

            // cálculo da média
            media = (n1 + n2) / 2;

            // operador ternário
            System.out.println(media >= 6 ? "Aprovado" : "Reprovado");
        }

        // Exemplo 3: Estrutura if-else
        {
            // variáveis
            double n1, n2, media;
            Scanner ler = new Scanner(System.in);

            // entrada
            System.out.println("Informe as notas");
            n1 = ler.nextDouble();
            n2 = ler.nextDouble();

            // cálculo da média
            media = (n1 + n2) / 2;

            // decidir sobre a média
            if (media >= 6) {
                System.out.println("Aluno Aprovado!!");
                System.out.println("Parabéns");
            } else {
                System.out.println("Aluno reprovado");
            }
        }

        // Exemplo 4: Estrutura if-else-if-else
        {
            // variáveis
            double nota, frequencia;
            String resultado;
            Scanner sc = new Scanner(System.in);

            // entrada
            System.out.println("Informe a nota (0 a 10)");
            nota = sc.nextDouble();

            System.out.println("Informe a frequência (0 a 100)");
            frequencia = sc.nextDouble();

            if (frequencia < 75) {
                resultado = "Aluno reprovado";
            } else if (nota > 5.6) {
                resultado = "Aluno aprovado";
            } else if (nota >= 3) {
                resultado = "Aluno de recuperação";
            } else if (nota >= 2) {
                resultado = "Aluno no REA";
            } else {
                resultado = "Aluno reprovado";
            }

            System.out.println(resultado);
        }

        // Exemplo 5: Comparando Strings
        {
            String turma;
            Scanner ler = new Scanner(System.in);
            System.out.println("Informe a sua turma");
            turma = ler.next();

            // String se compara com equals
            if (turma.equals("A")) {
                System.out.println("Bem-vindo à turma A");
            } else {
                System.out.println("Você não é da turma A");
            }
        }
    }
}