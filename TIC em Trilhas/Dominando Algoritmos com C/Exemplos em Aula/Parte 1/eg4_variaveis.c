#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "");
    const char nomeImutavel[] = "GOD"; // Constante

    // printf("Nosso heroi Xaton mora em Votuporanga \n");

    char nomePersonagem[] = "Xaton";   // Varivel
    char cidade[] = "Votuporanga";     // Varivel
    
    printf("Nosso heroi %s mora em %s. \n", nomePersonagem, cidade);
    printf("%s\n", nomePersonagem);
    printf("%s\n", cidade);

    printf("O nome que não muda é %s.\n", nomeImutavel);

    return 0;
}