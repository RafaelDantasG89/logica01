/*
*   Eu, como administrador do sistema, gostaria de permitir que os próprios usuários cadastrassem
*   o nome do usuário (login) no sistema, para agilizar no processo de migração.
*
*    O usuário não pode deixar o login vazio "", ou criar um usuário loin "admin" ou "administrador".
*   Se o valor entrado for válido, o sistema deverá exibir uma mensagem "<nome do usuário > cadastrado com sucesso."
*   Senão o sistema deverá mostrar mensagem de erro "Usuário inválido".
*
*   Dica - no java comparação de Stings são realizadas através do comando .equals() e NÃO por "=="
* */

import java.util.Scanner;
public class MigracaoDoSistema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe aqui seu nome: ");
        String user = input.nextLine();

        if (user.equals("") || user.equalsIgnoreCase("admin") || user.equalsIgnoreCase("administrador")) {
            System.out.println("Usuário inválido.");
        }else {
            System.out.println(user + " cadastrado com sucesso.");
        }
    }
}
