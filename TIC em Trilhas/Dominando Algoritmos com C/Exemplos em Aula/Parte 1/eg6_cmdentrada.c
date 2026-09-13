#include <stdio.h>
#include <string.h> // Biblioteca para o "fgets" (aparentemente)
#include <locale.h>

int main(){
    setlocale(LC_ALL, "");

    char nomeDoPersonagem[50];

    printf("Por favor, digite o seu nome: ");

    //Usar "scanf" para ouvir o teclado e guardar na variável
    // scanf("%s", nomeDoPersonagem); // Não lê espaços

    fgets(nomeDoPersonagem, sizeof(nomeDoPersonagem), stdin); // Agora lê espaços, mas também lê o Enter XD

    printf("Nosso personagem se chama %s!", nomeDoPersonagem);

    return 0;
}