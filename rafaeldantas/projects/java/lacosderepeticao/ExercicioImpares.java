package rafaeldantas.projects.java.lacosderepeticao;
/*
*   Eu como usuário gostaria de imprimir todos os número ímpares de 0 até o valor digitado.
* */
import java.util.Scanner;
public class ExercicioImpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        int number = input.nextInt();
        int contador = 0;

        while(contador <= number) {
            if (contador % 2 != 0){
                System.out.println("Números ímpares: " + contador);
            }
            contador++;
        }
    }
}
