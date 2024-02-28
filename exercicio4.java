package nomequalquer;

import java.util.Scanner;

public class exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		//4 - Escrever um algoritmo para ler quatro valores inteiros,
		//calcular a sua média, e escrever na tela os que são superiores à média.
		
		System.out.println("Digite o 1 valor: ");
		int n1 = teclado.nextInt();
		
		System.out.println("Digite o 2 valor: ");
		int n2 = teclado.nextInt();
		
		System.out.println("Digite o 3 valor: ");
		int n3 = teclado.nextInt();
		
		System.out.println("Digite o 4 valor: ");
		int n4 = teclado.nextInt();
		
		int media = (n1+n2+n3+n4)/4;
		
		System.out.println("A media eh: "+media);
		if (n1>media)
			System.out.println(" é maior que a media: "+n1);
		if (n2>media)
			System.out.println("é maior que a media: "+n2);
		if (n3>media)
			System.out.println(" é maior que a media: "+n3);
		if (n4>media)
			System.out.println(" é maior que a media: "+n4);
		
		
		
	}

}
