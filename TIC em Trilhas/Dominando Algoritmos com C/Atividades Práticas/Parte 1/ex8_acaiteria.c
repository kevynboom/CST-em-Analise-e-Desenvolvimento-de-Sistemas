#include <stdio.h>
#include <locale.h>

// 8. Faça um programa para calcular o total de uma venda de açaí a partir das quantidades compradas para cada tamanho: pequeno, médio e grande, 
// sabendo que o valor do açaí é R$ 13,50, R$ 15,00 e R$ 17,50 respectivamente. O programa também deve receber o valor do cupom de desconto em porcentagem.
int main() {
    setlocale(LC_ALL, "");

    int pequeno;
    int medio;
    int grande;

    float desconto;
    float valorTotal;
    float valorDesconto;
    float valorFinal;

    printf("--- Venda de Açaí ---\n");
    printf("Digite a quantidade de açaí pequeno: ");
    scanf("%d", &pequeno);

    printf("Digite a quantidade de açaí médio: ");
    scanf("%d", &medio);

    printf("Digite a quantidade de açaí grande: ");
    scanf("%d", &grande);

    printf("Digite a porcentagem de desconto: ");
    scanf("%f", &desconto);

    valorTotal = (pequeno * 13.50) + (medio * 15.00) + (grande * 17.50); // Calculando o valor total da venda
    valorDesconto = valorTotal * desconto / 100; // Calculando o valor do desconto
    valorFinal = valorTotal - valorDesconto; // Calculando o valor final

    printf("\n--- Resultado ---\n");
    printf("Açaí pequeno: %d\n", pequeno);
    printf("Açaí médio: %d\n", medio);
    printf("Açaí grande: %d\n", grande);
    printf("Valor total: R$%.2f\n", valorTotal);
    printf("Desconto: %.2f%%\n", desconto);
    printf("Valor final: R$%.2f\n", valorFinal);

    return 0;
}