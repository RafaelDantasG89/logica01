/*
*   Como secretario de alistamento militar eu gostaria que o meu sistema aceitasse os seguintes parâmetros
*   para que eu possa agilizar o processo de cadastramento:
*
*   -> Sexo, sendo válido apenas M ou F e idade.
*   -> Se o sexo for masculino e a idade maior ou igual a 18 o sistema deve imprimir, alistamento obrigatório;
*   -> Se o sexo for masculino e a idade foi menor que 18 o sistema deve imprimir, alistamento não permitido;
*   -> Se o sexo for feminino e a idade for maior ou igual a 18 o sistema deve perguntar se a pessoa deseja se alistar;
*   -> Se o sexo for feminino e a idade for menor que 18 o sistema deve imprimir, alistamento não permitido.
* */
import java.util.Scanner;
import java.lang.String;
public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Programa de alistamento militar.");
        System.out.print("Informe M - masculino ou F - feminino: ");
        String sex = input.next();
        System.out.print("Informe sua idade: ");
        int age = input.nextInt();

        if(sex.equalsIgnoreCase("M") && age >= 18){
            System.out.println("Alistamento obrigatório");
        }else if(sex.equalsIgnoreCase("M") && age < 18 ) {
            System.out.println("alistamento não permitido.");
        }else if(sex.equalsIgnoreCase("F") && age>= 18) {
            System.out.println("Você deseja se alistar?");
            String answer = input.nextLine();
            if(answer.equalsIgnoreCase("sim")) {
                System.out.println("Alistamento realizado.");
            } else {
                System.out.println("Alistamento não concluído.");
            }
        }else if(sex.equalsIgnoreCase("F") && age < 18) {
            System.out.println("Alistamento não permitido.");
        }
    }
}
