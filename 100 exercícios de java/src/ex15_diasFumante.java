import java.util.Scanner;

public class ex15_diasFumante {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Em média, quantos cigarros você fuma por dia?:");
        int diario = scan.nextInt();

        System.out.println("A quantos anos você fuma?:");
        int anos = scan.nextInt();

        int cigarrosFumados = ((diario * 365) * anos);
        int tempoPerdido = ((cigarrosFumados * 10)/ 60)/ 24;

        scan.close();
        System.out.println("Você perdeu aproximadamente " + tempoPerdido + " dias de vida.");
    }
}
