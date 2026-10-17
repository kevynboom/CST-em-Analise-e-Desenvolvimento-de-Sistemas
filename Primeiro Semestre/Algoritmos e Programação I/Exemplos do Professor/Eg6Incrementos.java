public class Eg6Incrementos {

    public static void main(String[] args) {

        int x = 7;
        int y = ++x; // aqui x = 8 e y = 8

        System.out.println(x--); // aqui primeiro usa x depois decrementa
        System.out.println(++y); // aqui primeiro incrementa depois usa y

        // Exemplo de operadores lógicos
        x = 1;
        y = 10;
        int z = 5;
        String nome = "Carlos";

        // && ao contrário de & ao concluir a expressão lógica,
        // não faz as demais verificações se a primeira for falsa.
        System.out.println(x++ > 1 && y++ < 20);
        System.out.println(x); // exibe o valor de x após o incremento
        System.out.println(y); // exibe y, que não foi incrementado devido ao curto-circuito do &&

        // || não verifica a segunda condição se a primeira for verdadeira.
        System.out.println(x++ > 0 || z-- < 5);
        System.out.println(x); // exibe o valor de x após o incremento
        System.out.println(z); // exibe z, que não foi decrementado devido ao curto-circuito do ||

        // isEmpty() verifica se a String está vazia; ! inverte o resultado.
        System.out.println(!nome.isEmpty()); // exibe true porque "Carlos" não está vazia
    }
}