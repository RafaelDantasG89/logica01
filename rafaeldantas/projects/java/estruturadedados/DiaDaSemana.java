//  Receba um numero inteiro do usuário e imprima o dia da semana correspondente.
package rafaeldantas.projects.java.estruturadedados;

import java.util.Scanner;
public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um numero de 1 a 7: ");
        int number = input.nextInt();

        if(number == 1) {
            System.out.println("Domingo");
        }else if(number == 2) {
            System.out.println("Segunda");
        }else if(number == 3) {
            System.out.println("Terça");
        }else if(number == 4) {
            System.out.println("Quarta");
        }else if(number == 5) {
            System.out.println("Quinta");
        }else if(number == 6) {
            System.out.println("Sexta");
        }else if(number == 7){
            System.out.println("Sábado");
        }else {
            System.out.println("Dia inválido");
        }
    }
}
