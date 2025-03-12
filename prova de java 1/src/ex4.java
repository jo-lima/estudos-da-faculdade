import java.util.Scanner;

public class ex4 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número:");

        double numero = scan.nextDouble();
        scan.close();

        System.out.println(numero + " ao quadrado é: " + String.format("%.2f",Math.pow(numero,2)) + ".");
        System.out.println(numero + " ao cubo é: " + String.format("%.2f",Math.pow(numero,3)) + ".");
    }
}
