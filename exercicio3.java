package nomequalquer;
import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		
		//3 - Faça um algoritmo para ler um número e verificar se ele é par ou ímpar.
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite o valor: ");
		int n = teclado.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("Esse numero é par");}
		else 
			System.out.println("Esse numero é impar");
	}

}
