/*
 *   Eu como usuário gostaria de ter o nome e a idade de participantes de um torneio de natação
 *   e que o sistema imprimisse da seguinte forma:
 *   > Menor de 10 anos: <Nome> participará da categoria infantil.
 *   > Entre 11 e 15 anos: <Nome> participará da categoria juvenil.
 *   > Entre 16 e 19 anos: <Nome> participará da categoria pré-adulto.
 *   > Acima de 20 anos: <Nome> participará da categoria adulto.
 *
 *   Para que eu possa rapidamente classificar todos os participantes.
 * */

import java.util.Scanner;

public class SistemaTorneioNatacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = "";
        int age = 0;

        System.out.print("Informe seu nome: ");
        name = input.nextLine();
        System.out.print("Informe sua idade: ");
        age = input.nextInt();

        if (age < 10) {
            System.out.println(name + " participará da categoria infantil.");
        } else if (age >= 11 && age <= 15) {
            System.out.println(name + " participará da categoria juvenil.");
        } else if (age >= 16 && age <= 19) {
            System.out.println("nome + participará da caterogia pre-adulto.");
        }else if (age > 20) {
            System.out.println("nome + participará da caterogia adulto.");
        }
    }
}
