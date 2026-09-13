#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL, "");
    printf("Eu estou aprendendo a programar em C.\n");   // "\n" - Pula linha
    printf("Esta é a nossa segunda mensagem.\n");
    printf("Nome:\tJoão\n");                             // "\t" - Tabula algumas coisas, basicamente centraliza
    printf("Idade:\t25\n");
    printf("João disse \"Olá, galera\"\n");
    printf("O caminho do arquivo é: C:\\Users\\Aluno");  // Use uma barra antes de um caracter especial para indicar que ele faz parte da string

    return 0;
}
