#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "");

    char nomeDoPersonagem[50];
    int idadeDoPersonagem;    // Tipo inteiro
    float alturaDoPersonagem; // Tipo decimal

    printf("Por favor, digite o seu nome: ");
    scanf("%s", nomeDoPersonagem); // Não precisa do "&" pois é uma variável com vetor, arrays já fornecem o "endereço de localização" na memória
    
    printf("Agora, digite a sua idade: ");
    scanf(" %d", &idadeDoPersonagem); // Precisa do "&" pois o scanf precisa saber onde guardar a informação na memória
                                    
    printf("Agora, digite a sua altura: ");
    scanf(" %f", &alturaDoPersonagem); 

    printf("Nosso personagem se chama %s e tem %d anos de idade!\nEle tem %.2f metros de altura!\n", nomeDoPersonagem, idadeDoPersonagem, alturaDoPersonagem);

    return 0;
}