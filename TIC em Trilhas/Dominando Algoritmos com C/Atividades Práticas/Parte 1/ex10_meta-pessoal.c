#include <stdio.h>
#include <locale.h>

// 10. Faça um programa que calcule em quanto tempo será possível alcançar uma meta pessoal e qual valor deverá ser poupado mensalmente para isso. 
// O usuário deverá informar a descrição da meta, o valor necessário para atingi-la, seu salário mensal e o total das despesas mensais. 
// Considere que, após descontar as despesas, o programa deve reservar automaticamente 30% do valor restante como economia fixa, e que o valor que 
// sobrar após essa reserva poderá ser destinado mensalmente para alcançar a meta.
int main() {
    setlocale(LC_ALL, "");

    char descricaoMeta[100];

    float valorMeta;
    float salario;
    float despesas;
    float valorRestante;
    float economiaFixa;
    float valorMensal;
    float tempo;

    printf("--- Meta Pessoal ---\n");
    printf("Digite a descrição da meta: ");
    fgets(descricaoMeta, sizeof(descricaoMeta), stdin);

    printf("Digite o valor necessário para atingir a meta: R$");
    scanf("%f", &valorMeta);

    printf("Digite o seu salário mensal: R$");
    scanf("%f", &salario);

    printf("Digite o total das despesas mensais: R$");
    scanf("%f", &despesas);

    valorRestante = salario - despesas; // Calculando o valor restante após as despesas
    economiaFixa = valorRestante * 30 / 100; // Reservando 30% do valor restante como economia fixa
    valorMensal = valorRestante - economiaFixa; // O restante poderá ser destinado à meta
    tempo = valorMeta / valorMensal; // Calculando o tempo necessário para alcançar a meta

    printf("\n--- Resultado ---\n");
    printf("Meta: %s", descricaoMeta);
    printf("Valor da meta: R$%.2f\n", valorMeta);
    printf("Valor reservado para economia: R$%.2f\n", economiaFixa);
    printf("Valor destinado à meta por mês: R$%.2f\n", valorMensal);
    printf("Tempo para alcançar a meta: %.2f meses\n", tempo);

    return 0;
}