import java.util.Scanner;

public class ex16_salarioAumento {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o salário do funcionário:");
        double salario = scan.nextDouble();
        
        double salarioAumento = salario + (salario * 15/100);

        scan.close();
        System.out.println("O salário após o aumento é de: " + String.format("%.2f", salarioAumento) + "R$!");
    }
}
