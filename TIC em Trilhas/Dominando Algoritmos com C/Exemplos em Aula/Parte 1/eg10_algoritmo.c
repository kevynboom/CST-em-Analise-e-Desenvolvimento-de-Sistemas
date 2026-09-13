#include <stdio.h>
#include <locale.h>

int main() {
    setlocal(LC_ALL, "");

    // 1 - Entrada de Dados
    float valorTotalConta;
    int totalPessoas;
    
    printf("--- Divisor de Contas ---\n");
    printf("Qual o valor total da conta? ");
    scanf("%f", &valorTotalConta);
    
    printf("A conta será dividida por quantas pessoas? ");
    scanf("%f", &totalPessoas);
    
    // 2 - Processamento dos Dados
    // O cérebro do programa. Realizamos os cálculos aqui
    float valorPorPessoa = valorTotalConta / totalPessoas;

    // 3 - Sáida de Dados
    // Apenas exibimos o resultado final para o usuário
    printf("\n--- Resultado ---\n");
    printf("Cada pessoa deve pagar: R$%.2f\n", valorPorPessoa);
    
}