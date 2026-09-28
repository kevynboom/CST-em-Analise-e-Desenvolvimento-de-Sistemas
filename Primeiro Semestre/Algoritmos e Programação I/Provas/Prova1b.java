import java.util.Scanner;

public class Prova1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Criação do scanner

        // DECLARANDO VARIÁVEIS
        String nome; // Variável normal
        int idade; // Variável normal
        double altura, desconto, acrescimo, promocao, valor; // Variáveis normais
        int deficiencia, semana, estudante, periodo; // Variaveis para tratamento de dados em estruturas condicionais
        String radical, direito; // Variáveis para formatação final
        int descontoF, promocaoF; // Variáveis para formatação final
        double acrescimoF; // Variável para formatação final

        // Para o tratamento de dados eu adoraria colocar um try/catch em tudo pra evitar do programa crashar em determinados momentos mas não vai dar tempo.

        // --- COLETANDO DADOS ---
        System.out.println("--- SISTEMA DE VENDA DE INGRESSOS ---");

        System.out.println("Digite o primeiro nome do visitante: ");
        nome = sc.nextLine();

        System.out.println("Digite a idade do visitante: ");
        idade = sc.nextInt();
        while (idade <= 0 || idade > 130) { 
            System.out.println("Idade inválida! Digite a idade novamente: ");
            idade = sc.nextInt();
        }

        System.out.println("Digite altura (em metros) do visitante: ");
        altura = sc.nextDouble();
        while (altura <= 0 || altura >= 3.0) { 
            System.out.println("Altura inválida! Digite a altura novamente: ");
            altura = sc.nextDouble();
        }

        System.out.println("O visitante possui algum tipo de deficiência? (1 = SIM / 2 = NÃO)");
        deficiencia = sc.nextInt();
        while (deficiencia != 1 && deficiencia != 2) { 
            System.out.println("Opção inválida! Digite '1' para SIM ou '2' para NÃO");
            deficiencia = sc.nextInt();
        }

        System.out.println("O visitante é estudante? (1 = SIM / 2 = NÃO)");
        estudante = sc.nextInt();
        while (estudante != 1 && estudante != 2) { 
            System.out.println("Opção inválida! Digite '1' para SIM ou '2' para NÃO");
            estudante = sc.nextInt();
        }

        System.out.println("Em que dia da semana o visitante irá marcar presença? (1 = Domingo, 2 = Segunda ... 7 = Sábado)");
        semana = sc.nextInt();
        while (semana < 1 || semana > 7) { 
            System.out.println("Opção inválida! Digite o dia da semana novamente lembrando que: 1 = Domingo, 2 = Segunda ... 7 = Sábado");
            semana = sc.nextInt();
        }

        System.out.println("O visitante virá de manhã ou a tarde? (1 = MANHÃ / 2 = TARDE)");
        periodo = sc.nextInt();
        while (periodo != 1 && periodo != 2) { 
            System.out.println("Opção inválida! Digite '1' para MANHÃ ou '2' para TARDE");
            periodo = sc.nextInt();
        }

        // --- PROCESSANDO DADOS ---
        System.out.println("\n--- PROCESSANDO DADOS ---");
        // Acesso dos brinquedos radicais
        System.out.println("--- ACESSO AOS BRIQUEDOS RADICAIS ---");
        if (idade > 12 && altura > 1.50) {
            radical = "APROVADO!";
        } else {
            radical = "NEGADO!";
        }
        System.out.printf("Seu acesso será: %s\n\n", radical);

        // Descontos
        System.out.println("--- DESCONTOS ---");
        if (deficiencia == 1) {
            desconto = 0.5; // 50% de desconto
            System.out.println("Por possuir uma deficiência, você ganhou 50% de desconto no valor do ingresso!\n");
            descontoF = 50; 
        } else if (idade <= 10) {
            desconto = 0.6; // 40% de desconto
            System.out.println("Por possuir 10 anos de idade ou menos, você ganhou 40% de desconto no valor do ingresso!\n");
            descontoF = 40; 
        } else if (idade >= 60) {
            desconto = 0.65; // 35% de desconto
            System.out.println("Por possuir 60 anos de idade ou mais, você ganhou 35% de desconto no valor do ingresso!\n");
            descontoF = 35; 
        } else if (estudante == 1) {
            desconto = 0.65; // 35% de desconto
            System.out.println("Por ser estudante, você ganhou 35% de desconto no valor do ingresso!\n");
            descontoF = 35; 
        } else {
            desconto = 1; // Sem desconto
            System.out.println("Infelizmente, você não atende a nenhum de nosso critérios para desconto no valor do ingresso...\n");
            descontoF = 0; 
        }

        // Acréscimos
        System.out.println("--- ACRÉSCIMOS ---");
        if (semana == 1 || semana == 7) {
            if (periodo == 1) {
                acrescimo = 1.4375; // Acréscimo do fim de semana + período da manhã (25% + 15%)
                System.out.println("Por visitar em um fim de semana e no período da manhã, você terá um acréscimo de 43,75% no valor do ingresso...\n");
                acrescimoF = 43.75;
            } else {
                acrescimo = 1.25; // Acréscimo só do fim de semana (25%)
                System.out.println("Por visitar em um fim de semana, você terá um acréscimo de 25% no valor do ingresso...\n");
                acrescimoF = 25;
            }
        } else if (periodo == 1) {
            acrescimo = 1.15; // Acréscimo só do período da manhã (15%)
            System.out.println("Por visitar no período da manhã, você terá um acréscimo de 15% no valor do ingresso...\n");
            acrescimoF = 15;
        } else {
            acrescimo = 1; // Sem acréscimo
            System.out.println("Você não terá nenhum acréscimo no valor do ingresso.\n");
            acrescimoF = 0;
        }

        // Promoção especial
        System.out.println("--- PROMOÇÃO ESPECIAL ---");
            System.out.println("Critérios do desconto especial:\nSer estudante, ter idade entre 14 e 17 anos e realizar visita no período da tarde durante a semana.\n");
        if (estudante == 1 && idade >= 14 && idade <= 17 && semana > 1 && semana < 7 && periodo == 2) { // Provavelmente tem um jeito melhor de fazer isso mas tô sem tempo pra pensar demais
            promocao = 0.93;
            direito = "teve";
            System.out.println("PARABÉNS! Você atende aos critérios do desconto especial e ganhou 7% de desconto no valor do seu ingresso!\n");
            promocaoF = 7;
        } else {
            promocao = 1;
            direito = "não teve";
            System.out.println("Sentimos muito! Infelizmente você não atende aos critérios do desconto especial e, portanto, não ganhou o desconto da promoção especial...\n");
            promocaoF = 0;
        }

        // SAÍDA DE DADOS
        System.out.println("--- PROCESSAMENTO CONCLUÍDO | RESUMO GERAL --- ");
        System.out.printf("Nome do visitante: %s.\n", nome);
        System.out.printf("Com base nos critérios mencionados anteriormente, você teve:\n%d%% de desconto.\n", descontoF);
        System.out.printf("Com base nos critérios mencionados anteriormente, você teve:\n%.2f%% de acréscimo.\n", acrescimoF);
        System.out.printf("Quanto a promoção especial, você %s direito e, portanto, obteve:\n%d%% de desconto adicional.\n", direito, promocaoF);
        System.out.printf("Por último, quanto aos brinquedos radicais, seu acesso foi:\n%s\n\n", radical);

        System.out.println("--- VALOR FINAL DO INGRESSO --- ");
        System.out.println("O valor final do seu ingresso será de:");
        // Calculando valor final
        valor = ((100 * desconto) * acrescimo) * promocao; 
        System.out.printf("R$%.2f", valor);

        sc.close(); // Fechando scanner
    }
}