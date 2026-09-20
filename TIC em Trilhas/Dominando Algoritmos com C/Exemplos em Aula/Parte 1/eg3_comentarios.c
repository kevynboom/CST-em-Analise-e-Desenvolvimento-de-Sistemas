// Só transcrevendo código, pois eu já usava comentários antes dessa aula XD

#include <stdio.h> //Inclui a biblioteca padrão de entrada
#include <locale.h> //Inclui a biblioteca de "localização" a qual permite usar config de idioma

// Função principal: Ponto de entrada do programa
int main(){
    setlocale(LC_ALL, "");
    // Imprime a mensagem na tela.
    printf("Olá, Mundo do Prof. Josué\n");
    
    /*
    printf("Hello, World!\n");
    */

    return 0;
}