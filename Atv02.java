import java.util.Scanner;

public class Atv02 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int num = scan.nextInt();
       if (num % 5 == 0 && num <= 100){
           System.out.println("O número é múltiplo de 5.");
       }
       else if (num > 100){
           System.out.println("Erro. Digite um número menor que 100.");
       }
       else System.out.println("O número não é multiplo de 5.");
    }



}
