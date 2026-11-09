import java.util.Random;
import java.util.Scanner;

public class Eg10bArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número correspondente ao método desejado: ");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1 -> SalaBidimensional();
            case 2 -> SalaTridimensional();
        }
    }

    public static void SalaBidimensional() {
        Random rand = new Random();
        double[][] notas = new double[8][4]; // 8 alunos e 4 notas cada
        // Preenchendo as notas (i é alunos e j é as notas)
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = rand.nextDouble(0,10); // Dado aluno i e nota j (segundo o loop) gere uma nota aleatoria
            }
        }
        // Calcular média e exibir
        for (int i = 0; i < notas.length; i++) { // Percorrendo alunos
            System.out.printf("Aluno %d: ", (i + 1)); // +1 pois indice começa no 0
            double media = 0;
            for (int j = 0; j < notas[i].length; j++) { // Percorrendo notas
                media += notas[i][j]; // Soma nota x na média mas não fazemos a divisão ainda (pois não pegamos todas as notas e tbm não vamos exibir media ainda)
                System.out.printf("| %4.1f ", notas[i][j]);
            }
            media /= notas[i].length; // Divisão aqui pela quantidade de notas (notas(i).length)
            System.out.printf("| Média: %4.1f%n", media);
        }       
    }

    public static void SalaTridimensional() {
        Random rand = new Random();
        double[][][] notas = new double[5][8][4]; // 5 salas com 8 alunos e 4 notas cada
        // Preenchendo as notas (geração com peso, e usando for-each pois aqui não precisamos dos indices)
        for (double[][] aluno : notas) { // Percorrendo salas
            for (double[] nota : aluno) {
                for (int k = 0; k < nota.length; k++) {
                    int chance = rand.nextInt(100);
                    if (chance < 10) { // 10% de chance da nota ser abaixo de 4
                        nota[k] = rand.nextDouble(0, 4);
                    } else if (chance < 30) { // 20% de chance da nota ser entre 4 e 7
                        nota[k] = rand.nextDouble(4, 7);
                    } else { // 70% de chance da nota ser maior que de 7
                        nota[k] = rand.nextDouble(7, 10);
                    }
                }
            }
        }
        // Calcular média e exibir
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%n----- SALA %d -----%n", i + 1);
            for (int j = 0; j < notas[i].length; j++) {
                System.out.printf("Aluno %d: ", j + 1);
                double media = 0;
                for (int k = 0; k < notas[i][j].length; k++) {
                    media += notas[i][j][k];
                    System.out.printf("| %4.1f ", notas[i][j][k]);
                }
                media /= notas[i][j].length;
                System.out.printf("| Média: %4.1f%n", media);
            }
        }
    }
}