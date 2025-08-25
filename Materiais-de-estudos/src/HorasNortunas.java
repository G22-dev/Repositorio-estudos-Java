// ====================================================================================================================
// Cálculo: 
// (Salário) ÷ (Horas totais no mes) = (valor por hora diurna) 
// (valor por hora diurna) x (20% percentual do adicional noturno) = (valor do adicional noturno)
// (Horas Nortunas no Mês) x (valor do adicional noturno) = (Total de adicional nortuno no mês)
// (Salário) + (Total de adicional nortuno no mês) = (Salário final com adicional norturno)
// 
// Exemplo:
// Cálculo: 1533,01 ÷ 220 = 6,97 
// 6,97 x 0,20(20%) = 1,39
// 180 x 1,39 = 250,86
// 1533,01 + 250,86 = 1783,87
// ====================================================================================================================

import java.util.Scanner;

public class HorasNortunas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario;
        int horasTrabalhadasMes;
        int horasNortunasMes;

        try {

            System.out.println("informar o valor do Salário: ");
            salario = scanner.nextDouble();

            System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
            horasTrabalhadasMes = scanner.nextInt();

            System.out.println("Informe a quantidade de horas noturnas trabalhadas no mês: ");
            horasNortunasMes = scanner.nextInt();
            
        } catch (Exception e) {
            System.out.println("Por gentileza informar o valor correto. ");
            scanner.close();
            return;
        }

        double valorHorasDiurna = salario / horasTrabalhadasMes;
        double valorDaHoraNortuna = valorHorasDiurna * 0.20; 
        double totalExtraNorturno = horasNortunasMes * valorDaHoraNortuna;
        double salarioFinal = salario + totalExtraNorturno;
        
        System.out.println("====================CALCULO HORAS NORTUNAS====================");
        System.out.printf("Valor da hora diurna: R$ %.2f%n",valorHorasDiurna);
        System.out.printf("Valor da hora noturna: R$ %.2f%n",valorDaHoraNortuna);
        System.out.printf("Total de adicional nortuno no mês: R$ %.2f%n",totalExtraNorturno);
        System.out.printf("Salário final com adicional norturno: R$ %.2f%n",salarioFinal);
        System.out.println("==============================================================");

        scanner.close();

    }
}