#include <stdio.h>
#include <locale.h>

// 7. Faça um programa que calcule o tempo que um livro será lido por uma pessoa a partir do nome do livro, do total de páginas e do tempo em segundos de leitura por página.
int main() {
    setlocale(LC_ALL, "");

    char nomeLivro[100];
    int paginas;
    int segundosPorPagina;
    int tempoTotal;

    printf("--- Tempo de Leitura ---\n");
    printf("Digite o nome do livro: ");
    fgets(nomeLivro, sizeof(nomeLivro), stdin);

    printf("Digite o total de páginas: ");
    scanf("%d", &paginas);

    printf("Digite o tempo em segundos para ler cada página: ");
    scanf("%d", &segundosPorPagina);

    tempoTotal = paginas * segundosPorPagina; // Calculando o tempo total de leitura
    
    printf("\n--- Resultado ---\n");
    printf("Livro: %s", nomeLivro);
    printf("Total de páginas: %d\n", paginas);
    printf("Tempo por página: %d segundos\n", segundosPorPagina);
    printf("Tempo total de leitura: %d segundos\n", tempoTotal);

    return 0;
}