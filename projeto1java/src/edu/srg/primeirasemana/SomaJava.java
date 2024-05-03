package edu.srg.primeirasemana;
import java.util.Scanner;

public class SomaJava {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        String BR = " Brasil";

        int numero3 = 5;
        numero3 = 10;

        String nome1 = " Sérgio Bispo Bomfim";

        int soma = numero1 + numero2 + numero3;
        System.out.println("A soma é: " + soma + BR + nome1);
        
        int resultado = multiplicar(numero1, numero2); // Chamada corrigida ao método multiplicar

        System.out.println("O resultado da multiplicação é: " + resultado);

        scanner.close();
    }

    // Método para multiplicar dois números inteiros
    public static int multiplicar(int numero1, int numero2) {
        return (numero1 * numero2);
    }
}
