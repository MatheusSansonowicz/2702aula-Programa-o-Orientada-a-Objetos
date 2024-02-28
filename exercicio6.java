package nomequalquer;
import java.util.Scanner;

public class exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		//6 - Escreva um algoritmo que leia 3 valores pelo teclado e então informe qual o maior deles.
		
		int maior;
		
		System.out.println("Digite o 1 valor: ");
		int n1 = teclado.nextInt();
		
		System.out.println("Digite o 2 valor: ");
		int n2 = teclado.nextInt();
		
		if (n1>n2)
			maior = n1;
		else if (n1<n2)
			maior = n2;
		else
			maior= n2;
			
		
		System.out.println("Digite o 3 valor: ");
		int n3 = teclado.nextInt();
		
		if (n3==n2 && n3==n1)
			System.out.println("os valores são iguais");
		else if (maior>n3)
			System.out.println("O maior valor é: "+maior);
		else if (n3>maior)
			System.out.println("O maior valor é: "+n3);
		
	}

}
