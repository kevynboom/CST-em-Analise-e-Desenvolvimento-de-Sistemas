#include <stdio.h>
#include <locale.h>

int main() {
    // Garante que o console do Windows lide bem com caracteres (útil em outros contextos)
    // E garante que a formatação de números (como vírgula decimal) siga o padrão local.
    setlocale(LC_ALL, "Portuguese_Brazil.1252");

    int num1, num2;

    printf("--- Mini Calculadora ---\n");
    printf("Digite o primeiro número: ");
    scanf("%d", &num1);
    printf("Digite agora o segundo número: ");
    scanf("%d", &num2);

    printf("Os dois números digitados são %d e %d!", num1, num2);

    return 0;
}