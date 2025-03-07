import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        System.out.println("Quantos reais você tem?");
        Scanner scan = new Scanner(System.in);
        float num = scan.nextFloat();
        System.out.println("Você tem o equivalente a: " + String.format("%.2f",num / 3.45) + "US$");
    }
}
