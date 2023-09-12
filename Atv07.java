import java.util.Scanner;

public class Atv07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("valor do Cateto Adjacente: ");
        int CA = scan.nextInt();
        System.out.println("Valor do Cateto Oposto: ");
        int CO = scan.nextInt();
        System.out.println("Valor da Hipotenusa: ");
        int HP = scan.nextInt();
        if (CA == CO && CA == HP && HP == CO){
            System.out.println("O triângulo é Equilátero.");
        }
        else if (CA == CO && HP != CA && HP != CO){
            System.out.println("O triângulo é Isosceles");
        }
        else if (CA != CO && CA != HP && HP != CO){
            System.out.println("O triângulo é Escaleno.");
        }
        else System.out.println("");



    }
}
