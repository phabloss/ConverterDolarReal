package aula01;

import java.util.Scanner;

public class Saudacao {
	
	
	public static void main(String[] args) {
		
				Scanner leitor = new Scanner (System.in);
				String nome = leitor.next();
				System.out.println("Bem vindo"+ nome);
				leitor.close();
	}

}
