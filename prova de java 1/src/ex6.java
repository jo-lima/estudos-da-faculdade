import java.util.Scanner;

public class ex6
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o A:");
        double a = scan.nextDouble();

        System.out.println("Insira o B:");
        double b = scan.nextDouble();

        System.out.println("Insira o C:");
        double c = scan.nextDouble();

        scan.close();

        double delta = Math.pow(b,2) - (4 * a * c);
        System.out.println("O delta é: " + String.format("%.2f", delta));
    }
}
