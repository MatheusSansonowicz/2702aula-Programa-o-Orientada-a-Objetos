package nomequalquer;

import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

     //9 – Escreva um algoritmo para ler a idade de uma pessoa e mostrar qual sua situação de eleitor, conforme as seguintes condições:·
     //Se a idade for menor que 16 anos, informar que a pessoa não está apta a votar.·
     //Se a idade for maior ou igual a 16 anos e menor que 18 anos ou superior a 70 anos, informar que o voto é facultativo.·
     //Caso contrário, informar que o voto é obrigatório.

     System.out.println("Digite suaa idade: ");
        int idade = teclado.nextInt();
        
        if (idade < 16) {
            System.out.println("A pessoa não está apta a votar.");
        } else if ((idade >= 16 && idade < 18) || idade > 70) {
            System.out.println("O voto é facultativo.");
        } else {
            System.out.println("O voto é obrigatório.");
        }
        
    }
}