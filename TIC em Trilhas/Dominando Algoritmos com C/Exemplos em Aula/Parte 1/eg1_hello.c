#include <stdio.h> // Biblioteca necessária para prints (e outas funções) no terminal
#include <locale.h> // Biblioteca para reconhecer caracteres estrangeiros (acentos)

// Função principal
int main(){ 
    setlocale(LC_ALL, "");        // Configuração para os caracteres estrangeiros serem mostrados corretamente no terminal
    printf("Olá, Mundo do Prof. Josué\n"); // Texto a ser imprimido ("\n" para pular linha, não tem um print diferente pra isso em C)
    return 0;                              
}

// Comando para compilar o programa (criar o .exe):
// gcc hello.c -o hello
// Depois execute com "hello" (em Linux, use "./hello")
// Ou use a extensão "Code Runner" e esqueça todos esses comandos XD