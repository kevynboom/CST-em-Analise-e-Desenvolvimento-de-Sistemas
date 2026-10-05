public class ExemploFor2 {
    public static void main(String[] args) {
        int tamanho = 5;
        desenhaQuadradoCheio(tamanho);
        System.out.println("");
        desenhaQuadradoVazio(tamanho);
    }

    public static void desenhaQuadradoCheio(int tamanho) {
        for (int linha = 1; linha <= tamanho; linha++) {
            for (int coluna = 1; coluna <= tamanho; coluna++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void desenhaQuadradoVazio(int tamanho) {
        for (int linha = 1; linha <= tamanho; linha++) {
            for (int coluna = 1; coluna <= tamanho; coluna++) {
                if (linha == 1 || linha == tamanho || coluna == 1 || coluna == tamanho) {
                    System.out.print("*");
                } else {
                    System.out.print("");
                }
            }
            System.out.println("");
        }
    }
}