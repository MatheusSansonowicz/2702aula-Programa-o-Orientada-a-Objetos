package nomequalquer;
import java.util.Scanner;

		public class e1 {

			public static void main(String[] args) {
				
				//exercicios 1 e 10

				float v1;
				float v2;
				int op;
				float r;
				
				Scanner teclado = new Scanner (System.in);
				
				System.out.println("Digite o primeiro valor: ");
				v1 = teclado.nextFloat();
				
				System.out.println("Digite o segundo valor: ");
				v2 = teclado.nextFloat();
				
				System.out.println("1 – soma\n 2 – subtração\n 3 – multiplicação\n 4 – divisão\n O que deseja fazer com eles? ");
				op = teclado.nextInt();
				
				switch (op) {
				case 1:
					r = v1 +v2;
					System.out.println("O resultado da soma é: "+r);
					break;
				case 2:
					r = v1 - v2;
					System.out.println("O resultado da subtração é: "+r);
					break;
				case 3:
					r = v1+v2;
					System.out.println("O resultado da multiplicação é: "+r);
					break;
				case 4:
					r = v1/v2;
					System.out.println("O resultado da divisão é: "+r);
					break;
				default:
					System.out.println("Operação invalda!");
				}
				}
			
			
	}
	


