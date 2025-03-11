import java.util.Scanner;

public class ex10_tintaNecessária {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a largura da parede: ");
        double largura = scan.nextDouble();

        System.out.println("Insira a altura da parede: ");
        double altura = scan.nextDouble();

        double area = largura * altura;
        double tintaNecessaria = area / 2;

        scan.close();
        System.out.println("Para pintar a área de " + String.format("%.2f",area) + "m é necessário " + String.format("%.2f",tintaNecessaria) + "l de tinta.");
    }
}

