/*
 *   Dado determinado valor de salário recebido
 *   informar se necessário ou não declaração do imposto de renda.
 *   Desafio: informar o valor a ser declarado de acordo com a renda recebida.
 *
 *   Dica: CTRL + ALT + L -> formata o código alinhando o mesmo.
 * */

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor recebido como salário líquido: ");
        double salary = input.nextDouble();
        double deduction = 0;
        double aliquot = 0;

        if (salary <= 1903.98D) {
            System.out.println("Você esta isento. Alicota: " + aliquot +"% Dedução: R$" + deduction);
        }else if (salary >= 1903.99D && salary <= 2826.65) {
            aliquot = 7.50;
            deduction = (salary * 7.5)/100;
        }else if (salary >= 2826.66 && salary <= 3751.05) {
            aliquot = 15;
            deduction = (salary * 15)/ 100;
        }else if(salary >= 3751.06 && salary <= 4664.68) {
            aliquot = 22.5;
            deduction = (salary * 22.5)/100;
        }else if(salary >= 4664.69) {
            aliquot = 27.5;
            deduction = (salary * 27.5) / 100;
            System.out.println();
        }
        System.out.println("Você não é isento. Alicota: " + aliquot + "% Dedução: R$" + deduction);
    }
}
