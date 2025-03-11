import java.util.Scanner;

public class ex7_dobroTerco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número:");
        double num = scan.nextDouble();
        System.out.println("O dobro de " + num + " é: " + String.format("%.2f", num * 2));
        System.out.println("Um terço de " + num + " é: " + String.format("%.2f", num / 3));
        scan.close();
    }
}
