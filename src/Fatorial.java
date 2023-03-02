import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();

        int number;
        int fatorial;
        

        boolean verified = false;

        System.out.println("Digite o número que deseja calcular a fatorial: ");
        number = scan.nextInt();
        System.out.println("O número escolhido foi o " +number+ ", segue o fatorial dele a seguir: ");

        fatorial = number;
        int soma = number;
        
        System.out.print(number);

        do {
            fatorial--; 
            if (fatorial >= 1) {
                System.out.print(" x " +fatorial);
                soma = soma * fatorial;
            } else {
                verified = false; break;
            }
        } while (!verified);
        System.out.print(" = " +soma);
    }
}