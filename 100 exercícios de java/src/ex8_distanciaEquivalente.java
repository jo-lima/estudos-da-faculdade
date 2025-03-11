import java.util.Scanner;

public class ex8_distanciaEquivalente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma distância em metros: ");
        double num = scan.nextDouble();
        System.out.println("A distância de " + num + "m é equivalente a:");

        System.out.println((num / 1000) + "Km");
        System.out.println((num / 100) + "Hm");
        System.out.println((num / 10) + "Dam");

        System.out.println((num * 10) + "dm");
        System.out.println((num * 100) + "cm");
        System.out.println((num * 1000) + "mm");

        scan.close();

    }
}
