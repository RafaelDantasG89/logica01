package rafaeldantas.projects.java.swicthcase;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        System.out.print("Informe um numero até 7: ");
        Scanner input = new Scanner(System.in);
        int days = input.nextInt();

        switch (days) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
        System.out.println("Fim do programa.");
    }
}
