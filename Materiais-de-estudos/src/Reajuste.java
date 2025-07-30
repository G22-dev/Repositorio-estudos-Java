import java.util.Scanner;

public class Reajuste {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double a;

        double reajuste = 0.01;

        try {

            System.out.println("Informe o valor do reajuste: ");
            a = scanner.nextDouble();

        } catch (Exception e) {
            System.out.println("Entrada invalida. por gentilza, informar valor correto.");
            scanner.close();
            return;
        }

        double valorAjustado = a * (1 + reajuste);

        System.out.println("================================");
        System.out.println("Valor original: " + a);
        System.out.println("================================");
        System.out.println("Valor Ajustado: " + valorAjustado);
        System.out.println("================================");

        scanner.close();
    }
}
