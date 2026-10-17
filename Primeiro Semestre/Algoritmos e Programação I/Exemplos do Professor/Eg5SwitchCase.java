import java.util.Scanner;

public class Eg5SwitchCase {

    public static void main(String[] args) {

        int dia;
        String nomeDia = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia");
        dia = sc.nextInt();

        /*
        if (dia == 1) {
            nomeDia = "Domingo";
        } else if (dia == 2) {
            nomeDia = "Segunda-feira";
        } else if (dia == 3) {
            nomeDia = "Terça-feira";
        } else if (dia == 4) {
            nomeDia = "Quarta-feira";
        } else if (dia == 5) {
            nomeDia = "Quinta-feira";
        } else if (dia == 6) {
            nomeDia = "Sexta-feira";
        } else if (dia == 7) {
            nomeDia = "Sábado";
        } else {
            nomeDia = "Dia inválido";
        }
        */

        // switch tradicional
        switch (dia) {
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda-feira";
                break;
            case 3:
                nomeDia = "Terça-feira";
                break;
            case 4:
                nomeDia = "Quarta-feira";
                break;
            case 5:
                nomeDia = "Quinta-feira";
                break;
            case 6:
                nomeDia = "Sexta-feira";
                break;
            case 7:
                nomeDia = "Sábado";
                break;
            default:
                nomeDia = "Dia inválido";
        }

        // switch moderno
        switch (dia) {
            case 1 -> nomeDia = "Domingo";
            case 2 -> nomeDia = "Segunda-feira";
            case 3 -> nomeDia = "Terça-feira";
            case 4 -> nomeDia = "Quarta-feira";
            case 5 -> nomeDia = "Quinta-feira";
            case 6 -> nomeDia = "Sexta-feira";
            case 7 -> nomeDia = "Sábado";
            default -> nomeDia = "Dia inválido";
        }

        System.out.println(nomeDia);
    }
}