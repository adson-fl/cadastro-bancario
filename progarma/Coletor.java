package progarma;

import java.util.Locale;
import java.util.Scanner;

import entidade.BaseDeDados;

public class Coletor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BaseDeDados dados;

		System.out.print("digite o numero da conta:");
		int conta = sc.nextInt();
		System.out.printf("digite o  seu nome:");
		sc.nextLine();
		String nome = sc.nextLine();

		System.out.print("ira realisar algum deposito ? se sim digite 's' se não digite 'n' :");
		char vari = sc.next().charAt(0);

		if (vari == ('s')) {
			System.out.print("digite o valor que sera depositado:");
			double depositonovo = sc.nextDouble();
			dados = new BaseDeDados(conta, nome, depositonovo);
		} else {
			dados = new BaseDeDados(conta, nome);
		}

		System.out.println(dados);

		System.out.println("");
		System.out.println("insira o valor que sera depositado");
		double depositonovo = sc.nextDouble();
		dados.deposito(depositonovo);

		System.out.println(dados);

		System.out.println("");
		System.out.println("informe o falor que sera sacado:");
		depositonovo = sc.nextDouble();
		dados.saque(depositonovo);

		System.out.println(dados);

		sc.close();

	}

}
