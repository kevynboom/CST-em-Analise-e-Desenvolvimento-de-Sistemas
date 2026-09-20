#include <stdio.h>
#include <locale.h>

int main() {
    setlocale(LC_ALL, "");

    int resultado = 2 + 3 * 4;
    printf("O resultado de 2 + 3 * 4 eh: %d\n", resultado);

    // Exemplo com mesma prioridade (esquerda para a direita)
    int resultado2 = 10 / 2 * 5; // 10/2 = 5, depois 5*5 = 25
    printf("O resultado de 10 / 2 * 5 eh: %d\n", resultado2);

    // Forçando a soma primeiro com parenteses
    int resultadoComParenteses = (2 + 3) * 4;
    printf("O resultado de (2 + 3) * 4 eh: %d\n", resultadoComParenteses);

    // Exemplo: Calculo de media
    float media = (9.0 + 8.0 + 7.5) / 3; // Parenteses sao essenciais aqui!
    printf("A media eh: %.2f\n", media);

    return 0;
}