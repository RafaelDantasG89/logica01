import java.util.Scanner;

/*
*   Crie uma variável que irá guardar o valor de um salário
*   Calcule a porcentagem desse salário, sendo os valores da porcentagem:
*       -> 30%
*       -> 15%
*       -> 5%
*   A cada vez que você calcular guarde o resultado em uma variável
*   imprima o resultado e reutilize a variável que guarda o resultado para o novo calculo.
*
*/
public class Calculadora {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o salário desejado: ");
        double salario = input.nextDouble();
        double porcentSalario = (salario * 30) / 100;
        System.out.println("30% de " + salario + " é: " + porcentSalario);

        porcentSalario = (salario * 15)/ 100;
        System.out.println("15% de " + salario + " é: " + porcentSalario);

        porcentSalario = (salario * 5)/ 100;
        System.out.println("5% de " + salario + " é: " + porcentSalario);
    }
}
