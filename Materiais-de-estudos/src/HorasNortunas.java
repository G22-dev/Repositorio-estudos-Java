// ====================================================================================================================
// Cálculo: (SALARIO) ÷ (Horas totais no mes) = (valor por hora diurna) 
// (valor por hora diurna) x (20% percentual do adicional noturno) = (valor do adicional noturno)
// 

// Exemplo:

// Cálculo: 1533,01 ÷ 220 = 6,96 
// 6,96 x 0,20(20%) = 1,39
// 
// ====================================================================================================================

import java.util.Scanner;

public class HorasNortunas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double salario;

        int horasTrabadasMes;

        try {

            System.out.println("informar valor do Salário: ");
            salario = scanner.nextDouble();

            System.out.println("Informar horas trabalhadas: ");
            horasTrabadasMes = scanner.nextInt();
            
        } catch (Exception e) {
            System.out.println("Por gentileza informar o valor do empréstimo correto. ");
            scanner.close();
            return;
        }

        Double valorHorasDiurna = salario / horasTrabadasMes;
        Double valorDoNortuna = valorHorasDiurna * 0.20; 

        System.out.println(valorHorasDiurna);
        System.out.println(valorDoNortuna);

    }
}
