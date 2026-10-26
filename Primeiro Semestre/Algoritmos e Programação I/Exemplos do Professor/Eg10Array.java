import java.util.Scanner;
// FINALMENTE ARRAY :D
public class Eg10Array {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite o número correspondente ao método desejado: ");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1 -> ArrayInt();
            case 2 -> ForEach();
            case 3 -> ArrayString();
            case 4 -> Exercicio();
        }
    }

    public static void ArrayInt() {
        int media = 0;
        int notas[] = new int[10]; // "[]"" no "int" = todas várivaeis aqui são vetores || "[]"" no "notas" = somente notas é vetor
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Informe a nota do aluno %d\n", i + 1); // +1 pois o primeiro índice de arrays é = 0
            notas[i]= sc.nextInt();
        }
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
            System.out.printf("Nota do aluno %2d = %3d\n", i + 1, notas[i]);
        }
        media = media / notas.length;
        System.out.printf("A média da turma é: %2d", media);
    }

    public static void ForEach() {
        int media = 0;
        int notas[] = new int[10];
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Informe a nota do aluno %d\n", i + 1);
            notas[i] = sc.nextInt();
        }
        int aluno = 1;
        for (int nota : notas) {
            media += nota;
            System.out.printf("Nota do aluno %2d = %3d\n", aluno, nota);
            aluno++;
        }
        media = media / notas.length;
        System.out.printf("A média da turma é: %2d", media);
    }

    public static void ArrayString() {
        // Crie um algoritmo que pergunte a quantidade de palavras que serão digitadas, armazene-as em um array de Strings e exiba-as.
        int qtd;
        String palavras[] ; // Declarando "palavras" como array de String mas sem criar ele
        System.out.print("Digite a quantidade de palavras que serão digitadas: ");
        qtd = sc.nextInt();
        palavras = new String[qtd]; // Criando o array com length da váriavel "qtd"
        for (int i = 0; i < palavras.length; i++) {
            System.out.print("Digite a palavra: ");
            palavras[i] = sc.next();
        }
        for (Object s : palavras) {
            System.out.println(s);
        }
    }    

    public static void Exercicio() {
        // Crie um algoritmo para receber os nomes e notas de cada aluno de uma turma e exibir as informações
        // A quantidade de alunos da turma deverá ser informada e não poderá ser maior que 50.
        // As notas serão números fracionários, de 0 a 10.
        int tamanho;
        double nota[];
        String nome[];
        do { 
            System.out.print("Digite a quantidade de alunos na sala: ");
            tamanho = sc.nextInt();
            if (tamanho < 1 || tamanho > 50) {
                System.out.println("Tamanho inválido! Deve ter min. 1 aluno e max. 50.");
            }
        } while (tamanho <= 1 || tamanho >= 50);
        sc.nextLine(); // Limpando buffer
        nome =  new String[tamanho];
        nota =  new double[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o nome do aluno: ");
            nome[i] = sc.nextLine();
            System.out.print("Digite a nota do aluno: ");
            nota[i] = sc.nextDouble();
            sc.nextLine(); // Limpando buffer
        }
        System.out.println("--- EXIBINDO INFORMAÇÕES ---");
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Nome: %2s\n", nome[i]);
            System.out.printf("Nota: %2.2f\n\n", nota[i]);
        }
    }
}