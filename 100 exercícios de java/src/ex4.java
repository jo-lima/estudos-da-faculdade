import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nota 1:");
        int num1 = scan.nextInt();
        System.out.println("Nota 2:");
        int num2 = scan.nextInt();
        System.out.println("Sua média é: " + ((num1 + num2) / 2));
    }
}
