import java.util.Scanner;

public class ex6_antecessorSucessor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um número:");
        int num = scan.nextInt();
        System.out.println((num -1) + " " + num + " " + (num + 1));
        scan.close();
    }
}

