package nomequalquer;
import java.util.Scanner;

public class AulaPrincipal27022024 {

	public static void main(String[] args) {
		
		String texto;
		int n;
		int idade;
		float f;
		char c;
		
		Scanner teclado = new Scanner (System.in);
		
		/*System.out.println("Digite um texto: ");
		texto= teclado.nextLine();
		System.out.println("O texto digitado foi: " +texto);
		
		System.out.println("Digite um inteiro: ");
		n = teclado.nextInt();
		System.out.println("O inteiro digitado foi: "+n);
		
		System.out.println("Digite um float: ");
		f = teclado.nextFloat();
		System.out.println("O float digitado foi: "+f);
		
		System.out.println("Digite a idade: ");
		idade = teclado.nextInt();
		if(idade>=18)
			System.out.println("Maior de idade.");
		else
			System.out.println("Menor de idade.");
		
		System.out.println("Digite um caractere: ");
		c = teclado.next().charAt(0);
		System.out.println("O caractere digitado foi: "+c);*/
		
		System.out.println("Escolha um número de 1 a 5: ");
		int numero = teclado.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("O numero escolhido foi 1.");
			break;
		case 2:
			System.out.println("O numero escolhido foi 2.");
			break;
		case 3:
			System.out.println("O numero escolhido foi 3.");
			break;
		case 4:
			System.out.println("O numero escolhido foi 4.");
			break;
		case 5:
			System.out.println("O numero escolhido foi 5.");
			break;
		default:
			System.out.println("Opção invalida!");
		}
	}
	
}

