// Só transcrevendo código, pois eu já usava comentários antes dessa aula XD

//Inclui a biblioteca padrão de entrada e saída
#include <stdio.h>
//Inclui a biblioteca de "localização" a qual permite usar config de idioma
#include <locale.h>

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