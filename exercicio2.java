package nomequalquer;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		
		/*2 - Um motorista de taxi deseja calcular o rendimento de seu carro na praça.
		 *  Sabendo-se que o preço do combustível é deR$4,90,
		 *   escreva um algoritmo para ler a marcação do odômetro
		 *    (marcador de quilometragem) no início do dia, a marcação no final do dia,
		 *     o número de litros de combustível gasto e o valor total (R$) recebido dos passageiros.
		 *      Calcule e escreva a média do consumo em Km/l e o lucro líquido do dia.
		Fórmulas: Total quilometragem = marcação odômetro final do dia - marcação odômetro do dia
		Média do consumo = Total quilometragem/quantidade de combustível gasto
		Lucro do dia = Valor total recebido -(quantidade de combustível gasto * 4,90)*/
		
		Scanner teclado = new Scanner (System.in);
		
		final float gasolina = 4.90f;
		float MInicial, MFinal, TotalKM, LGastos, VRecebido, LucroDia, mediaConsumo;
		
		
		
		System.out.println("Digite a marcação inicial do odometro: ");
		MInicial =  teclado.nextFloat();
		System.out.println("Digite a marcação final do odometro: ");
		MFinal =  teclado.nextFloat();
		
		TotalKM = MFinal - MInicial;
		
		System.out.println("Digite o total de litros de combustivel gasto: ");
		LGastos =  teclado.nextFloat();
		
		System.out.println("Digite O total que recebeu dos passageiros: ");
		VRecebido =  teclado.nextFloat();
		
		mediaConsumo = LGastos/TotalKM;
		
		System.out.println("A media de consumo de hoje foi: "+mediaConsumo);
		
		
		LucroDia = VRecebido - (LGastos*gasolina);
		
		System.out.println("Olucro de hoje foi: "+LucroDia);
		
		

	}

}
