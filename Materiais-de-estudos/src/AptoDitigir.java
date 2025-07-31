// ====================================================================================
// Escreva um programa para verificar se uma pessoa ja pode tirar carteira de motorista
// ====================================================================================

import java.time.Year;
import java.util.Scanner;

public class AptoDitigir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ano = Year.now().getValue();

        int anoNascimento;

        try {

            System.out.println("Informe o ano de nascimento(yyyy): ");
            anoNascimento = scanner.nextInt();
            
        } catch (Exception e) {
            System.out.println("Entrada invalida. por gentilza, digitar ano de nascimento correto.");
            scanner.close();
            return;
        }
        
        int idade = ano - anoNascimento;

        System.out.println("=====================================================");
        System.out.println("==============DEPARTAMENTO DE TRANSITO===============");
        if(idade >= 18){
            System.out.println("=====================STATUS==========================");
            System.out.println("O candidato tem "+ idade +" anos de idade por tanto está apto para tirar habilitção. ");
        }else{
            System.out.println("=====================STATUS==========================");
            System.out.println("O candidato tem "+ idade +" anos de idade por tanto está inapto para tirar habilitção. ");
        }        
        System.out.println("=====================================================");

        scanner.close();
    }
}
