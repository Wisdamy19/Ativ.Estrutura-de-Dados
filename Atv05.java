import java.util.Scanner;

public class Atv05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Telefonou para vítima?");
        String pergunta1 = scan.nextLine();
        System.out.println("Esteve no local do crime?");
        String pergunta2 = scan.nextLine();
        System.out.println("Mora perto da Vítima?");
        String pergunta3 = scan.nextLine();
        System.out.println("Devia para vítima?");
        String pergunta4 = scan.nextLine();
        System.out.println("Já trabalhou para vítima?");
        String pergunta5 = scan.nextLine();
        if (pergunta1.equals("sim") && pergunta2.equals("sim") && pergunta3.equals("sim") && pergunta4.equals("sim") && pergunta5.equals("sim")){
            System.out.println("Assasino.");

        }
        else if (pergunta1.equals("não") && pergunta2.equals("não") && pergunta3.equals("não") && pergunta4.equals("não") && pergunta5.equals("não")){
            System.out.println("Inocente.");
        }
        else System.out.println("Suspeito.");
    }
}
