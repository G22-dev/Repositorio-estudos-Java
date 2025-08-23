// ====================================================================================================================
// Criar um algoritomo que o usuário solicite um valor de Emprésimo ao banco, 
// que calcule 20% de juros e que permita a possibilidade de parcelar o valor. 
// Ao final do programa deve-se mostrar a quantidade do valor solicitado com jusros incluso e valor total das parcelas.
// ====================================================================================================================

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        double valorSolicitadoEmprestimo;

        int quantidadeDeParcela;
        
        try {
            
            System.out.println("Informar valor do empréstimo: ");
            valorSolicitadoEmprestimo = scanner.nextDouble();
            
            System.out.println("Informar valor da pacelar que deseja pagar o empréstimo(Litmitado até 10x): ");
            quantidadeDeParcela = scanner.nextInt();
            
        } catch (Exception e) {
            System.out.println("Por gentileza informar o valor do empréstimo correto. ");
            scanner.close();
            return;
        }
        
        double valorJurosEmprestimo = (20 * valorSolicitadoEmprestimo) / 100;

        double valorEmprestimoComJuros = valorJurosEmprestimo + valorSolicitadoEmprestimo;

        double valorTotalDasParcelas = valorEmprestimoComJuros / quantidadeDeParcela;

        if(quantidadeDeParcela <= 10){

            System.out.println("==========================Bem vindo ao Banco=========================");
            System.out.printf("Valor solicitado do empréstimo: R$ %.2f%n", valorSolicitadoEmprestimo );
            System.out.printf("O juros calculado em cima do emprestimo solicitado ficou com o valor total de: R$ %.2f%n",valorEmprestimoComJuros);
            System.out.printf("Quantidade de parcelas escolhidas: " + quantidadeDeParcela + "x, Valor total das parcelas: R$ %.2f%n", valorTotalDasParcelas);
        }else{
            System.out.println("Por gentileza informar quantidade de parcelas até 10x. ");
        }

        scanner.close();
    }
}
