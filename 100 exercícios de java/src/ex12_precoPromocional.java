import java.util.Scanner;

public class ex12_precoPromocional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o preço do produto:");

        double preco = scan.nextDouble();
        double precoPromocional = preco - (preco * 5/100);

        scan.close();
        System.out.println("O preço promocional é de: " + String.format("%.2f", precoPromocional) +"R$!");
    }
}
