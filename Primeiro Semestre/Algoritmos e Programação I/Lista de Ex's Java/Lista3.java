import java.text.Normalizer;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
// Salve professor! Essa lista eu quis fazer bem mais completinha pois eu queria treinar mais, então será
// possível notar coisas não aplicadas nas aulas mas que pesquisei a parte pra aprender a usar (como o uso do Runnable).
// Código feito sem IA generativa!
public class Lista3 {
    // Váriaveis Globais
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    // ---------- MÉTODO PRINCIPAL (MENU) ----------
    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("========== LISTA DE EXERCÍCIOS 3 ==========");
            System.out.println("Digite o número do exercício desejado (1 a 23) ou 0 para sair:");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1 -> loopEx(Lista3::ex01);
                case 2 -> loopEx(Lista3::ex02);
                case 3 -> loopEx(Lista3::ex03);
                case 4 -> loopEx(Lista3::ex04);
                case 5 -> loopEx(Lista3::ex05);
                case 6 -> loopEx(Lista3::ex06);
                case 7 -> loopEx(Lista3::ex07);
                case 8 -> loopEx(Lista3::ex08);
                case 9 -> loopEx(Lista3::ex09);
                case 10 -> loopEx(Lista3::ex10);
                case 11 -> loopEx(Lista3::ex11);
                case 12 -> loopEx(Lista3::ex12);
                case 13 -> loopEx(Lista3::ex13);
                case 14 -> loopEx(Lista3::ex14);
                case 15 -> loopEx(Lista3::ex15);
                case 16 -> loopEx(Lista3::ex16);
                case 17 -> loopEx(Lista3::ex17);
                case 18 -> loopEx(Lista3::ex18);
                case 19 -> loopEx(Lista3::ex19);
                case 20 -> loopEx(Lista3::ex20);
                case 21 -> loopEx(Lista3::ex21);
                case 22 -> loopEx(Lista3::ex22);
                case 23 -> loopEx(Lista3::ex23);
                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.print("Opção inválida!");
            }
        } while (opcao != 0);
    }

    // ---------- MÉTODOS AUXILIARES ----------
    // Método auxiliar para repetir os exercícios
    // para não precisar fazer essa lógica de repetição em CADA metódo/exercício
    public static void loopEx(Runnable ex) {
        int opcao;
        do {
            ex.run(); // Executa o exercício em questão, depois mostra a messagem abaixo:
            System.out.println("\n---------- FIM DO EXERCÍCIO ----------");
            System.out.println("O que deseja fazer agora?");
            System.out.println("1 - Repetir o último exercício escolhido");
            System.out.println("2 - Escolher outro exercício para testar"); // Redundante pois qualquer número sem ser 1 ou 3 vai fazer isso mas ok
            System.out.println("3 - Encerrar o programa");
            // Seria loucura colocar uma quarta opção pra crashar o pc?
            System.out.print("Resposta: ");
            opcao = sc.nextInt();
            if (opcao == 3) {
                System.out.println("Encerrando o programa...");
                System.exit(0); // Para o programa todo normalmente
            }
        } while (opcao == 1); // Se for 1, começa tudo de novo.
    }

    // ---------- QUESTÕES ----------
    // Peça ao usuário para digitar caracteres um a um. 
    // Quando ele digitar um ponto final (.), pare a leitura e informe quantos caracteres foram digitados.
    public static void ex01() {
        char caractere;
        int contador = 0;
        System.out.println("---------- EXERCÍCIO 01 ----------");
        System.out.println("Digite caracteres mas apenas um por vez.");
        System.out.println("Ou digite apenas \".\" para parar e contar quantos caracteres foram digitados): ");
        do { 
            caractere = sc.next().charAt(0);
            contador++;
        } while (caractere != '.');
        System.out.printf("Foram digitados %d caracteres\n", --contador);
    }

    // Peça uma palavra e conte quantas vogais ela contém (sem usar array, apenas com repetição e charAt).
    public static void ex02 () {
        sc.nextLine(); // Limpando buffer do menu (sempre que pedir String primeiro no ex. precisa disso...)
        System.out.println("---------- EXERCÍCIO 02 ----------");
        System.out.print("Digite uma palavra para contar suas vogais: ");
        String palavra = sc.nextLine().toLowerCase();
        palavra = Normalizer.normalize(palavra, Normalizer.Form.NFD).replaceAll("\\p{M}", ""); // Para tranformar letras com acentos em normais
        int qtdVogais = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                qtdVogais++;
            } 
        }
        System.out.printf("Quantidade de vogais na palavra \"%s\": %d\n", palavra, qtdVogais);
    }

    // Peça uma palavra e um número n. Mostre a palavra repetida n vezes, uma por linha.
    public static void ex03 () {
        sc.nextLine(); // Limpando buffer do menu
        System.out.println("---------- EXERCÍCIO 03 ----------");
        System.out.print("Digite uma palavra para ser repetida: ");
        String palavra = sc.nextLine();
        System.out.print("Digite a quantidade desejada de repetições: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(palavra);
        } 
    }

    // Leia frases do usuário em loop. Quando ele digitar "sair", o programa termina.   
    public static void ex04 () {
        sc.nextLine(); // Limpando buffer do menu
        System.out.println("---------- EXERCÍCIO 04 ----------");
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        while (!frase.equalsIgnoreCase("sair")) { 
            System.out.printf("Você disse: \"%s\"\n", frase);
            System.out.print("Digite outra frase (ou \"sair\" para parar o ex.): ");
            frase = sc.nextLine();
        }
        System.out.println("Você digitou \"sair\", até logo!");
    }

    // Continue pedindo um nome até que o usuário digite algo com pelo menos 3 letras.  
    public static void ex05 () {
        sc.nextLine(); // Limpando buffer do menu
        System.out.println("---------- EXERCÍCIO 05 ----------");
        System.out.print("Digite um nome: ");
        String nome = sc.nextLine();
        int tamanho = nome.length();
        while (tamanho < 3) { 
            System.out.print("O nome precisa ter pelo menos 3 letras, digite novamente: ");
            nome = sc.nextLine();
            tamanho = nome.length();
        }
        System.out.printf("O nome digitado foi: \"%s\"\n", nome);
    }

    // Solicite uma senha e peça confirmação até que ambas coincidam.
    public static void ex06 () {
        sc.nextLine(); // Limpando buffer do menu
        System.out.println("---------- EXERCÍCIO 06 ----------");
        System.out.print("Digite uma senha: ");
        String senha = sc.nextLine();
        System.out.printf("Confirme a senha: ");
        String confirmarSenha = sc.nextLine();
        while (!confirmarSenha.equals(senha)) { 
            System.out.println("Acesso negado!");
            System.out.print("Confirme a senha novamente: ");
            confirmarSenha = sc.nextLine();
        }
        System.out.println("Acesso liberado!");
    }

    // Número fixo oculto. O usuário tem até 5 tentativas para adivinhar.
    public static void ex07() {
    System.out.println("---------- EXERCÍCIO 07 ----------");
    int numero = rand.nextInt(1, 21);
    int palpite;
    boolean acertou = false;
    System.out.println("Há um número oculto de 1 a 20. Tente adivinhar qual é em até 5 tentativas.");
    for (int tentativas = 1; tentativas <= 5; tentativas++) {
        System.out.print("Diga seu palpite: ");
        palpite = sc.nextInt();
        if (numero == palpite) {
            System.out.printf("Parabéns! Você acertou na %dª tentativa!\n", tentativas);
            acertou = true;
            break;
        } else if (tentativas < 5) {
            String dica = numero > palpite ? "MAIOR" : "MENOR";
            System.out.printf("Você errou! Restam %d tentativa(s).\n", 5 - tentativas);
            System.out.printf("Dica: o número é %s que seu palpite anterior.\n", dica);
        }
    }
    if (!acertou) {
        System.out.println("Infelizmente, suas tentativas acabaram...");
        System.out.printf("O número era \"%d\".\n", numero);
    }
}


    // Permita votar em três candidatos até que a palavra "fim" seja digitada. Conte os votos.
    public static void ex08 () {
        sc.nextLine(); // Limpando buffer do menu
        System.out.println("---------- EXERCÍCIO 08 ----------");
        int fulano = 0, ciclano = 0, deltrano = 0, nulo = 0;
        String voto;
        System.out.println("Temos 3 candidatos competindo, sendo: ");
        System.out.println("Fulano = 12");
        System.out.println("Ciclano = 23");
        System.out.println("Deltrano = 67");
        do {
            System.out.print("Digite o número desejado (ou digite \"fim\" para parar): ");
            voto = sc.next();
            switch (voto) {
                case "12" -> fulano++;
                case "23" -> ciclano++;
                case "67" -> deltrano++;
                default -> nulo++;
            }
        } while (!voto.equalsIgnoreCase("fim"));
        System.out.println("Contando votos...");
        System.out.printf("Fulano = %d\n", fulano);
        System.out.printf("Ciclano = %d\n", ciclano);
        System.out.printf("Deltrano = %d\n", deltrano);
        if (nulo > 0) {
            nulo--; // o Enter do scanner estava contando pra nulos
        }
        System.out.printf("Votos nulos = %d\n", nulo);
        System.out.println("VOTAÇÃO ENCERRADA!");
    }

    // Simule um caixa eletrônico que permite vários saques até o saldo acabar ou o usuário sair.
    public static void ex09 () {
        System.out.println("---------- EXERCÍCIO 09 ----------");
        double saldo = 2500, bolso = 0, saque;
        System.out.println("Bem vindo(a) ao CruBank!");
        try {
            do {
                System.out.printf("Você têm R$%.2f de saldo disponível.\n", saldo);
                System.out.println("Digite o valor do saque (ou qualquer letra para sair): ");
                saque = sc.nextDouble();
                while (saque <=0) {
                    System.out.print("Digite um valor válido: ");
                    saque = sc.nextDouble();
                }
                if (saldo > saque) {
                    saldo -= saque;
                    bolso += saque;
                    System.out.printf("Saque realizado com sucesso, você agora tem R$%.2f no bolso.\n\n", bolso);
                } else {
                    System.out.println("Seu saldo é insuficiente para este saque, sentímos muito!");
                    System.out.printf("Você ficou com R$%.2f no bolso.\n", bolso);
                    System.out.println("Fechando caixa eletrônico...");
                return;
                }
            } while (saldo > 0);
        } catch (InputMismatchException e) { // Usando "try-catch" pra sair do programa só pra não ter que receber tipo String no mesmo XD
            sc.nextLine();
            System.out.println("Você saiu, até logo!");
        }
    }

    // Faça uma pergunta (ex: "Qual a capital do Brasil?") até que o usuário acerte.
    public static void ex10 () {
        sc.nextLine(); // Limpando buffer do menu
        System.out.println("---------- EXERCÍCIO 10 ----------");
        System.out.println("Pergunta valendo 1 MILHÃO DE REAIS!!!");
        System.out.println("Qual a capital do Brasil?");
        System.out.print("Resposta: ");
        String resposta = sc.nextLine();
        while (!resposta.equalsIgnoreCase("brasil")) { 
            System.out.println("ERRADO!!!!");
            System.out.print("Responda de novo: ");
            resposta = sc.nextLine();
        }
        System.out.println("PARABÉNS!! VOCÊ AGORA É MILIONÁRIO!");
    }

    // Peça CPF até que seja digitado com exatamente 11 dígitos.
    public static void ex11 () {
        sc.nextLine(); // Limpando buffer do menu
        System.out.println("---------- EXERCÍCIO 11 ----------");
        String cpf = "";
        while (cpf.length() != 11) { 
            System.out.println("Digite um CPF:");
            cpf = sc.nextLine();
        }
        System.out.printf("Você digitou: %s.\n", cpf);
    }

    // Faça 5 perguntas em sequência. Conte quantas foram respondidas corretamente.
    public static void ex12 () {
        System.out.println("---------- EXERCÍCIO 12 ----------");
        int acertos = 0;
        System.out.println("MEGA-SENA DAS 5 PERGUNTAS");
        System.out.println("Pergunta 01");
        System.out.println("Quanto é 1 + 1? ");
        System.out.print("Reposta: ");
        int num1 = sc.nextInt();
        sc.nextLine(); // Limpando buffer
        if (num1 == 2) {
            acertos++;
        }
        System.out.println("Pergunta 02");
        System.out.println("Qual a capital do São Paulo? ");
        System.out.print("Reposta: ");
        String capital1 = sc.nextLine().toLowerCase(); // Eu esqueço que dá pra deixar lowercase no próprio Scanner...
        // Tratamento para tranformar letras com acentos em normais e tirar os espaços:
        capital1 = Normalizer.normalize(capital1, Normalizer.Form.NFD).replaceAll("\\p{M}", "").replace(" ", ""); 
        if (capital1.contains("saopaulo")) { // Só agora pensei em usar o ".contains" :/
            acertos++;
        }
        System.out.println("Pergunta 03");
        System.out.println("Quanto é 1 - 1? ");
        System.out.print("Reposta: ");
        int num2 = sc.nextInt();
        if (num2 == 0) {
            acertos++;
        }
        System.out.println("Pergunta 04");
        System.out.println("Quanto é 0 x 0? ");
        System.out.print("Reposta: ");
        int num3 = sc.nextInt();
        sc.nextLine(); // Limpando buffer
        if (num3 == 0) {
            acertos++;
        }
        System.out.println("Pergunta 05");
        System.out.println("Qual a capital do Acre? ");
        System.out.print("Reposta: ");
        String capital2 = sc.nextLine().toLowerCase();
        capital2 = Normalizer.normalize(capital2, Normalizer.Form.NFD).replaceAll("\\p{M}", "").replace(" ", ""); 
        if (capital2.contains("riobranco")) { 
            acertos++;
        }
        System.out.printf("Você acertou %d de 5 perguntas.\n", acertos);
        System.out.println("Até logo!");
        // Fiquei sem criatividade para as perguntas
    }

    // Peça uma letra e um número n. Mostre n vezes essa letra em uma mesma linha.
    public static void ex13 () {
        sc.nextLine(); // Limpando buffer do menu
        System.out.println("---------- EXERCÍCIO 13 ----------"); // Mesma coisa do 03 basicamente
        System.out.print("Digite uma letra para ser repetida: ");
        char letra = sc.next().charAt(0); // Só muda aqui 
        System.out.print("Digite a quantidade desejada de repetições: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(letra); // E aqui
        } 
    }

    // Simule o lançamento de um dado 10 vezes, mostrando os resultados (use um gerador de números aleatórios).
    public static void ex14 () {
        System.out.println("---------- EXERCÍCIO 14 ----------");
        System.out.println("Lançando dado 10 vezes:");
        for (int i = 1; i < 11; i++) {
            int dado = rand.nextInt(1,7);
            System.out.printf("Lançamento %d: %d\n", i, dado);
        }
    }

    // Mostre um menu com 3 opções. Repita até o usuário escolher "Sair".
    public static void ex15 () {
        sc.nextLine(); // Limpando buffer do menu
        System.out.println("---------- EXERCÍCIO 15 ----------"); // Mesma coisa do 03 basicamente
        String escolha;
        do { 
            System.out.println("Menu de 3 opções: ");
            System.out.println("1 - Tô sem ideia 01");
            System.out.println("2 - Tô sem ideia 02");
            System.out.println("3 - Tô sem ideia 03");
            System.out.println("Ou digite \"sair\"");
            System.out.print("Digite o número da escolha desejada: ");
            escolha = sc.next().toLowerCase();
            while (!escolha.equals("1") && !escolha.equals("2") && !escolha.equals("3")) {
                if (escolha.contains("sair")) {
                    break;
                }
                System.out.print("Inválido, escolha de novo: ");
                escolha = sc.next();
            }
            System.out.println("Você escolheu: " + escolha);
        } while (!escolha.equalsIgnoreCase("sair"));
        System.out.println("Você saiu. Até logo!");
    }

    // Peça letras uma a uma até que o usuário digite a letra "x". Conte quantas vezes digitou vogais.
    public static void ex16 () {
        System.out.println("---------- EXERCÍCIO 16 ----------");
        char letra;
        int contador = 0;
        System.out.println("Digite letras (sem acentos) mas apenas um por vez."); // Teria que converter pra String pra usar normalizer, quero simplificar aqui
        System.out.println("Ou digite apenas \"x\" para parar e contar quantas vogais foram digitadas): ");
        do { 
            letra = sc.next().charAt(0);
            Character.toLowerCase(letra);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        } while (letra != 'x');
        System.out.printf("Foram digitados %d vogais\n", contador);
    }

    // Permita o cadastro de nome e preço de produtos até que "fim" seja digitado. Calcule o total geral.
    public static void ex17 () {
        sc.nextLine(); // Limpando buffer do menu
        System.out.println("---------- EXERCÍCIO 17 ----------");
        String nome;
        double total = 0, valor;
        do {
            System.out.print("Digite o nome do produto (ou \"fim\" para parar): ");
            nome = sc.next();
            if (!nome.equalsIgnoreCase("fim")) {
                System.out.print("Digite o preço do produto: ");
                valor = sc.nextDouble();
            } else {
                break; // Para o loop sem perguntar o preço e evita ficar travado devido o Scanner
            }
            if (!nome.matches(".*\\d.*") && valor > 0) { // ".matches" para ver se o nome possui números (".*\\d.*")
                total += valor;
                System.out.printf("Produto \"%s\" com valor de \"R$%.2f\" cadastradado com sucesso!\n\n", nome, valor);
            } else {
                System.out.println("Erro ao cadastrar produto, tente novamente...\n");
            }
        } while (true);
        System.out.printf("O total dos produtos foi: R$%.2f", total);
    }

    // Peça uma frase e conte quantas palavras tem (com base nos espaços).
    public static void ex18 () {
        sc.nextLine(); // Limpando buffer do menu
        System.out.println("---------- EXERCÍCIO 18 ----------");
        int contador = 0;
        System.out.print("Digite uma frase qualquer: ");
        String frase = sc.nextLine().trim(); // ".trim" desconsidera os espaços do começo e fim da frase
            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) == ' ') {
                    contador++;
                }   
            }
        System.out.printf("Você digitou %d palavras!", ++contador); // +1 no contador pois se digitar 4 palvras só vai ter (em tese) 3 espaços

        // Do jeito que tá ATÉ funciona mas se tiver múltiplos espaços ENTRE palavras, o contador falha; O jeito abaixo seria eficaz mas tecnicamente é um array
        // no qual não é o conteúdo dessa lista (não consegui pensar numa maneira de resolver os múltiplos espaços do meio sem array):
        // int contador = frase.isEmpty() ? 0 : frase.split("\\s+").length;
        // QUERO AULAS DE ARRAY LOGO (╯°□°)╯︵ ┻━┻
    }

    // Repetir senha até ter maiúscula, número e mínimo de 8 caracteres. Use repetição até uma senha válida ser digitada.
    public static void ex19 () {
        sc.nextLine(); // Limpando buffer do menu
        System.out.println("---------- EXERCÍCIO 19 ----------");
        String senha;
        do { 
            System.out.print("Digite uma senha válida: ");
            senha = sc.next();
            if (senha.length() >= 8 && senha.matches(".*\\d.*") && senha.matches(".*[A-Z].*")) { // ".matches" para verificar os conteúdos desejados
                System.out.println("Senha válida!");
                break;
            } else {
                System.out.println("Não passou nos críterios, tente novamente...");
                System.out.println("Precisa ter alguma letra maiúscula, número e mínimo de 8 caracteres.\n");
            }
        } while (true);
    }

    // Peça uma palavra e um caractere. Conte quantas vezes o caractere aparece.
    public static void ex20 () {
        sc.nextLine(); // Limpando buffer do menu
        System.out.println("---------- EXERCÍCIO 20 ----------");
        int contador = 0;
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine().toLowerCase(); // Recebe minúsculo
        System.out.print("Digite a letra que quer contar quantas tem na frase dita anteriormente: ");
        char letra = Character.toLowerCase(sc.next().charAt(0)); // Recebe minúsculo (descobri só agora que dá pra fazer com char também no Scanner)
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }
        System.out.printf("A letra \"%c\" aparece %d vez(es) na frase \"%s\"\n", letra, contador, frase);
    }

    // Peça um número entre 1 e 100. Repita enquanto estiver fora do intervalo.
    public static void ex21 () {
        System.out.println("---------- EXERCÍCIO 21 ----------");
        int numero;
        do { 
            System.out.print("Digite um número de 1 a 100: ");
            numero = sc.nextInt();
        } while (numero > 100 || numero < 1);
        System.out.printf("Número \"%d\" recebido.", numero);
    }

    // Peça uma String e some os dígitos presentes (ex: "a2c4" → 6).
    public static void ex22 () {
        sc.nextLine(); // Limpando buffer do menu
        System.out.println("---------- EXERCÍCIO 21 ----------");
        int total = 0;
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (Character.isDigit(letra)) { // Se "letra" for um número (pessímo nome de variável, eu sei)
                total += Character.getNumericValue(letra); // Pega esse número e soma na total
            }
        }
        System.out.printf("A soma dos dígitos contidos na frase é: %d\n", total);
    }
    // Peça a digitação de um número inteiro até que seja digitado um valor negativo. 
    // Ao digitar um valor negativo, deverão ser exibidos a média dos números digitados, o menor número, o maior número, 
    // quantidade de números pares e quantidade de números ímpares.
    public static void ex23 () {
        System.out.println("---------- EXERCÍCIO 23 ----------");
        int numero, menor = 0, maior = 0, pares = 0, impares = 0, quantidade = 0;
        double soma = 0;
        while (true) {
            System.out.print("Digite um número inteiro (ou um número negativo para parar): ");
            numero = sc.nextInt();
            if (numero < 0) {
                break;
            }
            if (quantidade == 0) {
                menor = numero;
                maior = numero;
            } else {
                if (numero < menor) {
                    menor = numero;
                }
                if (numero > maior) {
                    maior = numero;
                }
            }
            soma += numero;
            quantidade++;
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.printf("\nMédia: %.2f\n", media);
            System.out.printf("Menor número: %d\n", menor);
            System.out.printf("Maior número: %d\n", maior);
            System.out.printf("Quantidade de pares: %d\n", pares);
            System.out.printf("Quantidade de ímpares: %d\n", impares);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }
    }
    // 500+ linhas de código, uau.
}