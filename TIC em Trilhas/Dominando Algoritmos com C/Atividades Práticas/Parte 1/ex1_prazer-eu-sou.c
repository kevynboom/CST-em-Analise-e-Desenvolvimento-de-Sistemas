#include <stdio.h>
#include <locale.h>

// 1. Faça um programa que apresente um estudante universitário considerando seu nome, curso que estuda, semestre atual e seu hobby favorito.
int main() {
    setlocale(LC_ALL, "");

    // Variáveis
    char nome[50];
    char curso[50];
    int semestre;
    char hobby[50];

    printf("Digite o seu nome: ");
    fgets(nome, sizeof(nome), stdin);

    printf("Digite qual o curso que você está fazendo: ");
    fgets(curso, sizeof(curso), stdin);

    printf("Digite apenas o número correspondente ao semestre em que você está no momento: ");
    scanf("%d", &semestre);

    while (getchar() != '\n'); // Limpa o '\n' deixado pelo scanf

    printf("Digite o seu hobby favorito: ");
    fgets(hobby, sizeof(hobby), stdin);

    printf("\n--- Dados do Aluno ---\n");
    printf("Nome: %s", nome);
    printf("Curso: %s", curso);
    printf("Semestre atual: %d° Semestre\n", semestre);
    printf("Hobby: %s", hobby);

    return 0;
}
