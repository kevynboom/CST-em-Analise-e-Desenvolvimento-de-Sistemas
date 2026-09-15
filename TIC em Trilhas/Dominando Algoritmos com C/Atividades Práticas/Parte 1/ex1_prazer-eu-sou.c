#include <stdio.h>   // Para entrada e saída de dados
#include <stdlib.h>  // Para usar o atoi (conversão de String para int)
#include <locale.h>  // Suporte à localização do sistema

int main() {
    setlocale(LC_ALL, ""); // Config para linguagem estrangeira
    // Variaveis
    char nome[50];
    char curso[50];
    char semestreString[10]; // String usada para receber o semestre antes da coversão
    int semestre; // Após conversão ficará aqui
    char hobby[50];

    printf("Digite o seu nome: ");
    fgets(nome, sizeof(nome), stdin);

    printf("Digite qual o curso que você está fazendo: ");
    fgets(curso, sizeof(curso), stdin);

    printf("Digite apenas o número correspondente ao semestre em que você está no momento: ");
    fgets(semestreString, sizeof(semestreString), stdin);
    semestre = atoi(semestreString); // Converte o texto para int

    printf("Digite o seu hobby favorito: ");
    fgets(hobby, sizeof(hobby), stdin);

    printf("\n--- Dados do Aluno ---\n");
    printf("Nome: %s", nome);
    printf("Curso: %s", curso);
    printf("Semestre atual: %d° Semestre\n", semestre);
    printf("Hobby: %s", hobby);

    return 0;
}
