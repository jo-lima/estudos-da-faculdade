import java.util.Scanner;

public class ex14_calcularSalario {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos dias foram trabalhados esse mês?");
        double diasTrabalhados = scan.nextDouble();
        double salario = diasTrabalhados * (8 * 25);

        scan.close();
        System.out.println("O seu salário é de: " + String.format("%.2f", salario) + "R$.");
    }
}
