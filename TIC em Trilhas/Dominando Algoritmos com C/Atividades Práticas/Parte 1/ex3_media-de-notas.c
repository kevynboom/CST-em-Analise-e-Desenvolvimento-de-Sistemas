#include <stdio.h>
#include <locale.h>

// 3. Faça um programa que calcule a média de um aluno, a partir de três notas informadas pelo usuário.
int main() {
    setlocale(LC_ALL, "");

    float nota1, nota2, nota3;
    float media;

    printf("--- Média do Aluno ---\n");
    printf("Digite a primeira nota: ");
    scanf("%f", &nota1);

    printf("Digite a segunda nota: ");
    scanf("%f", &nota2);

    printf("Digite a terceira nota: ");
    scanf("%f", &nota3);

    media = (nota1 + nota2 + nota3) / 3; // Calculando a média

    printf("\n--- Resultado ---\n");
    printf("Média do aluno: %.2f\n", media);

    return 0;
}