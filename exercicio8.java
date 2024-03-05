package nomequalquer;

import java.util.Scanner;

public class exercicio8 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // 8 - Escreva um algoritmo que leia dois valores pelo teclado e informe se os mesmos são múltiplos um do outro ou não.
        
        System.out.println("Digite o primeiro valor: ");
        int valor1 = teclado.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        int valor2 = teclado.nextInt();
        
        if (valor1 == 0 || valor2 == 0) {
            System.out.println("Os numeros não podem ser zero!!!");
        } else if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
            System.out.println("Os números são múltiplos um do outro.");
        } else {
            System.out.println("Os números não são múltiplos um do outro.");
        }
        
    }
}
