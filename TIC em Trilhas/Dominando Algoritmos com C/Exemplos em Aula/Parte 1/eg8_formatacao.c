#include <stdio.h>
#include <locale.h>

int main() {
    // Garante o console do Windows lide bem com caracteres (útil em outros contextos)
    // E garante que a formatação de números (com vírgula decimal) siga o padrão local.
    setlocale(LC_ALL, "Portuguese_Brazil.1252");

    // --- ATO I: SEM FORMATAÇÃO ---
    // Aqui, apenas separamos as palavras com um espaço.
    // O resultado é uma tabela desalinhada e de difícil leitura.
    printf("---- 1. Exemplo SEM NENHUMA FORMATAÇÃO ----\n");
    printf("Jogador Pontos\n");
    printf("Ana 1500\n");
    printf("Christiano 80\n"); // Um nome longo quebra qualquer alinhamento
    printf("Leo 2150\n");
    printf("----------------------------------------------\n\n");

    // --- ATO II: USANDO TABULAÇÃO (\t) ---
    // O \t insere uma tabulação. Parece uma boa ideia, mas o alinhamento
    // depende de "paradas de tabulação" fixas no console.
    // Note como a linha "Christiane" ainda fica desalinhada em relação às outras.
    printf("----- 2. Tentativa de formatação com TAB (\\t) -----\n");
    printf("Jogador\tPontos\n");
    printf("Ana\t1500\n");
    printf("Christiane\t800\n");
    printf("Leo\t2150\n");
    printf("----------------------------------------------\n\n");
    
    // --- ATO III: FORMATAÇÃO DE ESPAÇAMENTO PRECISA ---
    // A solução profissional. Usamos especificadores de formato no printf.
    // %s -> para string (texto)
    // %d -> para int (número inteiro)
    // %-15s -> Reserve 15 espaços para a string e alinhe à ESQUERDA (-)
    // %10d -> Reserve 10 espaços para o número e alinhe à DIREITA (padrão)
    // O resultado é uma tabela perfeitamente alinhada.

    printf("--- 3. Formatação PRECISA com espaçamento ---\n");
    // Cabeçalho da tabela
    printf("%-15s %10s\n", "Jogador", "Pontos");
    printf("-----------------------------\n"); // Linha separadora

    // Dados da tabela
    printf("%-20s %10d\n", "Ana", 1500);
    printf("%-20s %10d\n", "Christiane", 800); // Agora funciona perfeitamente!
    printf("%-20s %10d\n", "Leo", 2150);
    printf("%-20s %10d\n", "Josué Oliveira Silva", 5501);

    return 0;
}