import java.time.LocalDate;
import java.util.Scanner;

public class VerificaIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate now = LocalDate.now();


        System.out.print("Informe o ano de nascimento:");
        int ano = input.nextInt();
        int idade = 2021 - ano;

        if(idade >= 18) {
            System.out.println("Sua idade: " + idade + ", maior de idade.");
        }else {
            System.out.println("Sua idade: " + idade + ", menor de idade.");
        }
    }
}
