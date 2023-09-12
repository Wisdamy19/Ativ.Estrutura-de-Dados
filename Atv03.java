import java.util.Scanner;

public class Atv03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float nota1 = scan.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota2 = scan.nextFloat();
        scan.close();
        float media = (nota1 + nota2)/2;
        if (media > 0 && media <= 4.0){
            String conceito = "E";
            System.out.println("Média de Aproveitamento " + media + " com Conceito " + conceito);
        }
        else if (media > 4.0 && media <= 6.0){
            String conceito2 = "D";
            System.out.println("Média de Aproveitamento " + media + " com Conceito " + conceito2);
        }
        else if (media > 6.0 && media <= 7.5){
            String conceito3 = "C";
            System.out.println("Média de Aproveitamento " + media +" com Conceito " + conceito3 );

        }
        else if (media > 7.5 && media <= 9.0){
            String conceito4 = "B";
            System.out.println("Média de Aproveitamento " + media + " com Conceito " + conceito4);
        }
        else if (media > 9.0 && media <= 10.0){
            String conceito5 = "A";
            System.out.println("Média de Aproveitamento " + media + " com Conceito " + conceito5);

        }
        else System.out.println("Sua média não tem conceito.");

    }

}
