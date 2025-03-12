import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a base do triângulo:");
        double base = scan.nextDouble();

        System.out.println("Insira a altura do triângulo:");
        double altura = scan.nextDouble();

        scan.close();

        double area = (base * altura) / 2;
        System.out.println("A altura do triângulo é de " + String.format("%.2f", area));
    }
}
