
// Escreva um programa que carregue dois valores A e B pelo teclado e
// imprima todos os números ímpares entre A e B. 

import java.util.*;

public class  NumerosImparesEntreAB {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 

        int a;
        int b;

        try{
            
            System.out.println("Digite o primeiro valor: ");
            a = scanner.nextInt();

            System.out.println("Digite o segunda valor: ");
            b = scanner.nextInt();

        }catch(InputMismatchException e){
            System.out.println("Entrada invalida. por gentilza, digitar somente números");
            scanner.close();
            return;
            
        }catch(NoSuchElementException w){
            System.out.println("Entrada invalida. por gentilza, digitar somente números");
            scanner.close();
            return;  
        }

        if(a > b) {
            int variavelTemporaria = a;

            a = b;
            b = variavelTemporaria;
        }

        System.out.println("\nNúmeros entre " + a + " e " + b + ":");
        boolean encotrouNumeroImpar = false;
        
        for (int numero = a; numero <= b; numero++){
            if(numero % 2 != 0) {
                System.out.println("NÚmeros Ímpares "+ numero);
                encotrouNumeroImpar = true;
            }
        }

        if (!encotrouNumeroImpar){
            System.out.println("Não houve numeros ímpares no intervalo informados. ");
        }

        scanner.close();
    }
}