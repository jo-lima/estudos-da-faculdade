import java.util.Scanner;

public class ex13_locadoraCarros {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos quilômetros foram percorridos?:");
        double kilometros = scan.nextDouble();

        System.out.println("Quantos dias o carro foi alugado?:");
        int dias = scan.nextInt();

        double precoTotal = (dias * 90) + (kilometros * 0.2);

        scan.close();
        System.out.println("O preço total foi de: " + String.format("%.2f", precoTotal) + "R$");
    }
}
