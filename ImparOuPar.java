/*
*   Dado um determinado numero inteiro
*   imprima se ele é ímpar ou par.
* */

import java.util.Scanner;
public class ImparOuPar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um numero inteiro: ");
        int number = input.nextInt();
        int operator = number % 2;

        if(operator == 0) {
            System.out.println("O numero " + number + " é par.");
        }else {
            System.out.println("O numero " + number + " é ímpar.");
        }
    }
}
