import java.util.Scanner;

public class ex3_mostrarSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Insira seu salário: ");
        String salario = scan.nextLine();

        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário do funcionário: " + salario + "R$");
        scan.close();
    }
}
