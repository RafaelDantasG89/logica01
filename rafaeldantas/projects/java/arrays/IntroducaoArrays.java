package rafaeldantas.projects.java.arrays;
/*
*   Calculando a média de 3 notas.
*/

import java.text.DecimalFormat;
import java.util.Scanner;
public class IntroducaoArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] note = new double[4];
        System.out.print("Informe a nota do trabalho: ");
        note[0] = input.nextDouble();
        System.out.print("Informe a nota do teste: ");
        note[1] = input.nextDouble();
        System.out.print("Informe a nota da prova: ");
        note[2] = input.nextDouble();
        note[3] = (note[0] + note[1] + note[2]) / 3;

        //Adicionando formatação a impressão em tela -> 0,00 :: Necessário importar classe DecimalFormat;
        System.out.println(String.format("Sua média: " + new DecimalFormat("#,##0.00").format(note[3])));

        if(note[3] >= 7) {
            System.out.println("Aprovado!");
        }else {
            System.out.println("Reprovado!");
        }
    }
}
