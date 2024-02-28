package nomequalquer;

import java.util.Scanner;

public class exercicio5 {
	
	public static void main(String[] args) {
		

//5 - Escreva um algoritmo que leia um ponto (x,y)
//pelo teclado e informe em qual quadrante o ponto 
//se encontra no plano cartesiano ou se o ponto está sobre um dos eixos.

		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite a coordenada x do ponto: ");
		int x = teclado.nextInt();
		System.out.println("Digite a coordenada y do ponto: ");
		int y = teclado.nextInt();
		
		if (y==0 && x==0)
			System.out.println("O ponto esta sobre a origem dos eixos.");
		else if (y==0 && x>0)
			System.out.println("O ponto esta sobre o eixo y entre o 1 e o 4 quadrante.");
		else if (y==0 && x<0)
			System.out.println("O ponto esta sobre o eixo y entre o 2 e o 3 quadrante.");
		else if (y>0 && x==0)
			System.out.println("O ponto esta sobre o eixo x entre o 1 e o 2 quadrante.");
		else if (y<0 && x==0)
			System.out.println("O ponto esta sobre o eixo x entre o 3 e o 4 quadrante.");
		else if (y>0 && x>0)
			System.out.println("O ponto esta no 1 quadrante.");
		else if (y>0 && x<0)
			System.out.println("O ponto esta no 2 quadrante.");
		else if (y<0 && x<0)
			System.out.println("O ponto esta no 3 quadrante.");
		else if (y<0 && x>0)
			System.out.println("O ponto esta no 4 quadrante.");
				
	}

}
