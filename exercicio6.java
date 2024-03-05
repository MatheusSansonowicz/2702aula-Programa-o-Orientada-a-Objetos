package nomequalquer;
import java.util.Scanner;

public class exercicio6 {
    
    public static void main(String[] args) {
        

		Scanner teclado = new Scanner(System.in);
        
        // 6 - Escreva um algoritmo que leia 3 valores pelo teclado e então informe qual o maior deles.
        // 7 - Ajuste o exercício 6 de maneira que mostre os valores informados em ordem crescente.
        
        int n1, n2, n3, menor, medio, maior;
        
        System.out.println("Digite o 1 valor: ");
        n1 = teclado.nextInt();
        
        System.out.println("Digite o 2 valor: ");
        n2 = teclado.nextInt();            
        
        System.out.println("Digite o 3 valor: ");
        n3 = teclado.nextInt();
        
        // Encontrando o maior valor
        maior = n1;
        if (n2 > maior)
            maior = n2;
        if (n3 > maior)
            maior = n3;
        
        System.out.println("O maior valor é: " + maior);
        
        // Ordenando os valores em ordem crescente
        if (n1 <= n2 && n1 <= n3) {
            menor = n1;
            if (n2 <= n3) {
                medio = n2;
                maior = n3;
            } else {
                medio = n3;
                maior = n2;
            }
        } else if (n2 <= n1 && n2 <= n3) {
            menor = n2;
            if (n1 <= n3) {
                medio = n1;
                maior = n3;
            } else {
                medio = n3;
                maior = n1;
            }
        } else {
            menor = n3;
            if (n1 <= n2) {
                medio = n1;
                maior = n2;
            } else {
                medio = n2;
                maior = n1;
            }
        }
        
        System.out.println("Valores em ordem crescente: " + menor + ", " + medio + ", " + maior);
        
    }
}

