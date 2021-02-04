/*
 *   Um determinado salário
 *   se o salário for maior que R$4500 imprima 30% do valor
 *   senão imprima 15% do valor.
 *
 *   DESAFIO: Utilize apenas uma variável para guardar o resultado e imprimir no final.
 *
 *   DICA: CTRL + ALT + L -> Formata o código deixando o mesmo concatenado.
 * */

import java.util.Scanner;

public class DiferencaSalario {
    public static void main(String[] args) {
        //instanciando objeto Scanner
        Scanner input = new Scanner(System.in);

        //entrando com dados:
        System.out.print("Informe seu salário: ");
        double salario = input.nextDouble();
        double porcentSalario = 0;

        if (salario > 4500) {
            porcentSalario = salario * 0.3;
            System.out.println("30% do seu salário é: R$" + porcentSalario);
        } else {
                porcentSalario = (salario * 15) / 100;
            System.out.println("15% do seu salário é: R$" + porcentSalario);
        }
    }
}
