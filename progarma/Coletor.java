package progarma;

import java.util.Locale;
import java.util.Scanner;

import entidade.BaseDeDados;

public class Coletor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    double depositonovo = 0;  int comando = 0;
		
		System.out.print("digite o numero da conta:"); // tira 
		int conta = sc.nextInt();
		System.out.printf("digite o  seu nome:");
		sc.nextLine();
		String nome = sc.nextLine();
		
		BaseDeDados dados = new BaseDeDados(conta, nome, depositonovo);
		
		while(comando != 4) {
			System.out.println("--------------------------------------BENK-MASTE-PLAST------------------------------------------------");
			
			System.out.println("deposito: digite ............... (1)");
			System.out.println("saque: digite .................. (2)");
			System.out.println("estrato: digite ................ (3)");
			System.out.println("encerra: digite ................ (4)");
			
			System.out.println("------------------------------------------------------------------------------------------------------");
			System.out.print("opssão: ");
			comando = sc.nextInt();
		
		switch (comando) { 
		case 1: // deposito
			System.out.println("deposito: ");
			depositonovo = sc.nextDouble();
			dados.deposito(depositonovo);
			break;
		case 2: // saque
			System.out.println("saque: ");
			depositonovo = sc.nextDouble();
			dados.saque(depositonovo);
			break;
		case 3: // estrato
			System.out.println(dados);
			System.out.println();
			break;
			default:
			System.out.println();
			break;
			}
		}
		sc.close();
	}

}
