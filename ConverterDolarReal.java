package aula01;

import java.util.Scanner;

public class ConverterDolarReal {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		System.out.println("Digite o valor em dolar que quer converter para Real");
		double valreal = leitor.nextFloat();
		double cotreal;
		double valdolar;
		valdolar = 5.15;
		cotreal = valdolar * valreal;
		System.out.println("a cotação do dolar é: " + cotreal);
		
		
				

	}

}
