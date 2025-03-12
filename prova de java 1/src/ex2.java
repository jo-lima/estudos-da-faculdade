import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a temperatura em Celsius:");

        double celsius = scan.nextDouble();
        scan.close();

        double fahrenheit = (celsius * (9.0/5)) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + String.format("%.2f", fahrenheit) + "Fª");
    }
}
