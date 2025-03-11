import java.util.Scanner;

public class ex2_boasVindas {
    public static void main(String[] args) {
        Scanner escaneador = new Scanner(System.in);
        System.out.println("Qual seu nome?");

        String nome = escaneador.nextLine();
        System.out.println("Olá " + nome + ", é um prazer te conhecer!");
        escaneador.close();
    }
}
