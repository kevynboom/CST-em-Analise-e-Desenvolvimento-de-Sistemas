// Básico de variáveis - 24/08/26
public class ExemploVariaveis {
    public static void main(String[] args) {
        // Declaração de variáveis
        int idade = 20; // Numeros inteiros
        String turma = "Turma A"; // Textos
        double preco = 9.99; // Numeros reais
        char letra = 'a'; // Caractere simples/unico digito
        char letra2 = 66; // Caractere pelo código ASCII
        char letra3 = '\uA78D'; // Caractere pelo código Unicode
        // Utilização das variáveis
        System.out.println("Variáveis" + '\u30C4'); // Concatenação de argumentos (String + char) para saída no terminal
        System.out.println(idade);
        System.out.println(turma);
        System.out.println(preco);
        System.out.println(letra);
        System.out.println(letra2);
        System.out.println(letra3);
    }
}