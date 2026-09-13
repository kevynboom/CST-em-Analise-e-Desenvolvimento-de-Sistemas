#include <stdio.h>
#include <locale.h>
#include <string.h>

int main(){
    setlocale(LC_ALL, "");

    char s1[] = "Falaê ";
    char s2[] = "galera ";
    char s3[] = "da Trilha \"Pensamento Computacional\"";
    
    // Concatenando através da função strcat -> s2 é concatenado à s1
    strcat(s1, s2);
    strcat(s1, s3);

    printf("%s\n", s1);

    return 0;
}