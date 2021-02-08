package rafaeldantas.projects.java.swicthcase;
/*
 *   Como gerente eu gostaria que meus usuários pudessem digitar o tipo da conta
 *   e o sistema imprima qual a porcentagem de juros que aquela conta irá oferecer.
 *   Com o intuito de agilizar o acesso as informações.
 *   Os tipos de conta são:
 *   -> CONTA_POUPANCA = 0.25%
 *   -> CONTA_CORRENTE = 0.02%
 *   -> CONTA_INVESTIMENTO = 0.01%
 * */

import java.util.Scanner;

public class TipoDeConta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selecione o tipo da conta desejada: ");
        System.out.println(" 1 - Conta Poupança ");
        System.out.println(" 2 - Conta Corrente ");
        System.out.println(" 3 - Conta Investimento ");
        int accountType = input.nextInt();

        switch (accountType) {
            case 1:
                System.out.println("Conta poupança - 0.25% de juros.");
                break;
            case 2:
                System.out.println("Conta corrente - 0.02% de juros.");
                break;
            case 3:
                System.out.println("Conta investimento - 0.01% de juros");
                break;
            default:
                System.out.println(" Opção inválida.");
        }
        System.out.println("Fim do programa.");
    }
}
