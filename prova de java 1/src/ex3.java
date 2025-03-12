import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira seu peso (em kg):");
        double peso = scan.nextDouble();

        System.out.println("Insira sua altura (em metros):");
        double altura = scan.nextDouble();

        scan.close();

        double imc = (peso) / (Math.pow(altura, 2));
        System.out.println("Seu IMC é de: " + String.format("%.2f", imc));
    }
}
