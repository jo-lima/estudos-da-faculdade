import java.util.Scanner;

public class ex4_soma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número:");
        int num1 = scan.nextInt();
        System.out.println("Insira outro número:");
        int num2 = scan.nextInt();
        System.out.println("A soma dos números é: " + num1 + num2);
        scan.close();
    }
}
