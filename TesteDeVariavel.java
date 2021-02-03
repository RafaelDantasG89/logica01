import java.util.Scanner;

public class TesteDeVariavel {
    public static void main(String[] args) {
        /*
        *   Dica:
        *      -> CTRL + D = repete a linha onde o cursor esta parado.
        *      -> PSVM + TAB = Atalho para método principal do java.
        *      -> SOUT + TAB = Atalho para System.out.println();
        *      -> Para imprimir a concatenação de duas variáveis CHAR, abra aspas duplas e concatene antes das variáveis.Ex: ""+ variavelCHAR+variavelCHAR.
        *      -> Boolean = variável que armazena uma condição :: true ou false;
        *      -> CTRL + ALT + L = Reformatação do código (Muito importante).
        * */

        //char character = 'a'; //Char armazena caractere e estas devem ser declaradas com aspas simples.

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o valor da idade: ");
        int idade = input.nextInt();

        if(idade > 18) {
            System.out.println("Adulto");
        }else {
            System.out.println("Ainda não é adulto.");
        }

    }
}
