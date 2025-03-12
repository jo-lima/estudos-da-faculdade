import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a temperatura em Fahrenheit:");

        double fahrenheit = scan.nextDouble();
        scan.close();

        double celsius = ((fahrenheit - 32) * 5) / 9;
        System.out.println("A temperatura em Celsius é: " + String.format("%.2f", celsius) + "Cª");
    }
}
