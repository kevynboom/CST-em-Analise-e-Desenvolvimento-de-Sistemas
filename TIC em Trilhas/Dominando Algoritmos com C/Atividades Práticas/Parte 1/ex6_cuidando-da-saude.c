#include <stdio.h>
#include <locale.h>

// 6. Faça um programa para calcular o IMC de uma pessoa, a partir de sua altura e peso. A fórmula para calcular o IMC é: peso / altura².
int main() {
    setlocale(LC_ALL, "");

    float peso;
    float altura;
    float imc;

    printf("--- Calculadora de IMC ---\n");
    printf("Digite o seu peso em kg: ");
    scanf("%f", &peso);

    printf("Digite a sua altura em metros: ");
    scanf("%f", &altura);

    imc = peso / (altura * altura); // Calculando o IMC

    printf("\n--- Resultado ---\n");
    printf("Peso: %.2f kg\n", peso);
    printf("Altura: %.2f m\n", altura);
    printf("IMC: %.2f\n", imc);

    return 0;
}