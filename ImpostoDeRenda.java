/*
*   Dado determinado valor de salário recebido
*   informar se necessário ou não declaração do imposto de renda.
*   Desafio: informar o valor a ser declarado de acordo com a renda recebida.
*
* */

import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor recebido como salário líquido: ");
        double salary = input.nextDouble();
        double deduction = 0;

        if(salary <= 1903.98D) {
            System.out.println("Você esta isento." +
                    "Dedução: " + deduction);
        }
    }
}
