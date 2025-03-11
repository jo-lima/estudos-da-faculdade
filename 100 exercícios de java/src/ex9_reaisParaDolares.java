import java.util.Scanner;

public class ex9_reaisParaDolares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos reais você tem?");
        float num = scan.nextFloat();

        scan.close();
        System.out.println("Você tem o equivalente a: " + String.format("%.2f",num / 3.45) + "US$");
    }
}
