package rafaeldantas.projects.java.lacosderepeticao;
/*
 *   Apresentar ao usuário uma tela solicitando o login e depois uma senha, o usuário e senha corretos devem estar
 *   armazenados em constantes no seu programa. Se o usuário acertar o usuário e a senha, exibir a mensagem
 *   ACESSO CONCEDIDO, caso contrário exibir a mensagem ACESSO NEGADO e voltar a pedir usuário e senha.
 *   Essa condição deve se repetir até que o usuário acerte a combinação.
 */

import java.util.Scanner;

import static com.sun.tools.javac.util.StringUtils.toUpperCase;

public class TelaLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Cadastre seu usuário: ");
        final String username = toUpperCase(input.nextLine());
        System.out.print("Informe a senha: ");
        final String password = toUpperCase(input.nextLine());

        while (true) {
            System.out.print("Informe seu usuário: ");
            String user = toUpperCase(input.nextLine());
            System.out.print("Informe sua senha: ");
            String pass = toUpperCase(input.nextLine());

            if (username.equalsIgnoreCase(user) && password.equalsIgnoreCase(pass)) {
                System.out.println("Acesso concedido!");
            }else{
                System.out.println("Acesso negado.");
            }
            break;
        }
    }
}

