import java.util.Scanner;
// FINALMENTE ARRAY :D
public class Eg10aArrays {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite o número correspondente ao método desejado: ");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1 -> ArrayInt();
            case 2 -> ForEach();
            case 3 -> ArrayString();
            case 4 -> Exercicio();
            case 5 -> ArrayPredefinido();
        }
    }

    public static void ArrayInt() {
        int media = 0;
        int notas[] = new int[10]; // "[]"" no "int" = todas váriveis aqui são vetores || "[]"" no "notas" = somente notas é vetor
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
    // ------------------------------------------------------------------------
    public static void ArrayPredefinido() {
        // Criando vetores com valores predefinidos
        int[] numeros = {12, 45, 7, 89, 23, 56, 31, 64, 18, 92};
        String[] nomes = {"Lucas", "Mariana", "Pedro", "Beatriz", "Gabriel", "Ana", "Rafael"};
        String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

        System.out.println(ArrayMaior(numeros)); // Passando vetor como parametro para o metodo e o resultado disso sairá no print
        System.out.println(ArrayMenor(numeros));
        System.out.println(ArrayQtdPares(numeros));
        System.out.println(ArrayQtdImpares(numeros)); // Ou "System.out.println((numeros.length - ArrayQtdPares(numeros)));" também funcionaria 
        System.out.println(ArrayBuscarBoolean(nomes, "Ana"));
        System.out.println(ArrayBuscarBoolean(dias, "Quarta"));
        System.out.println(ArrayBuscarPosicao(nomes, "Ana"));
        System.out.println(ArrayBuscarPosicao(dias, "Quarta"));
    }

    public static int ArrayMaior(int[] array) {
        int maior = array[0]; // A variavel precisa ser inicializada, então assume-se que o primeiro valor é o "maior" por hora
        // Percorrendo todo o array
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i]; // Se o numero for maior que o "maior" atual, ele vira o novo "maior"
            }
        }
        return maior;
    }

    public static int ArrayMenor(int[] array) {
        int menor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }

    public static int ArrayQtdPares(int[] array) {
        int qtdPares = 0;
        for (int i = 0; i < array.length; i++) { // for (int numero : array)
            if (array[i] % 2 == 0){ // if (numero % 2 == 0)
                qtdPares++;
            }
        }
        return qtdPares;
    }

    public static int ArrayQtdImpares(int[] array) {
        return array.length - ArrayQtdPares(array); // Reaproveitando o método anterior para verificar a qtd de impares
    }

    public static boolean ArrayBuscarBoolean(String[] array, String alvo) {
        for (String s : array) {
            if (s.equals(alvo)) {
                return true; // Se achar o alvo, retorna verdadeiro
            }
        }
        return false;
    }

    public static int ArrayBuscarPosicao(String[] array, String alvo) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(alvo)) {
                return i; // Retorna a posição
            }
        }
        return -1; // Retorna posição inválida
    }
}