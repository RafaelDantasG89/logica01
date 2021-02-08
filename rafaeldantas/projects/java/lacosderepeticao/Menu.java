package rafaeldantas.projects.java.lacosderepeticao;
/*
*   Como usuário eu gostaria de ter um menu visual que seja navegável através de números.
*   O menu deve ser exibido da seguinte forma:
*   1 - Calcular imposto.
*   2 - Depositar salário.
*   3 - Sair.
*
*   O menu deve ficar disponível enquanto eu não digitar o numero 3.
*   Dessa forma o sistema ficará em execução, evitando ter que ser reiniciado a cada operação.
* */
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        while(option != 3) {
            System.out.println("Selecione uma das opções: ");
            System.out.println("1 - Calcular imposto.");
            System.out.println("2 - Depositar salário.");
            System.out.println("3 - Sair.");
            option = input.nextInt();
        }
    }
}
