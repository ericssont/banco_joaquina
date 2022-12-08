package conta;

import java.util.Scanner;

public class BancoJoaquinaMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println(
					"---- Bem Vindo(a) ao Banco Joaquina ---- \nDigite: \n\n1 - Abrir conta \n2 - Depósito \n3 - Saque \n4 - Transferência \n5 - Consultar saldo \n6 - Encerrar");
			int opcaoSelecionada = scanner.nextInt();

			switch (opcaoSelecionada) {
			case 1:
				Pessoa pessoa = new Pessoa();
				/*
				 * Pessoa: Nome,cpf,endereco,data de nascimento
				 * Conta: numero da conta,agencia,saldo, (Pessoa) titular
				 */
				System.out.println("Abrir conta selecionado");
				break;
			case 2:
				System.out.println("Depósito selecionado");
				break;
			case 3:
				System.out.println("Saque selecionado");
				break;
			case 4:
				System.out.println("Transferência selecionada");
				break;
			case 5:
				System.out.println("Consultar saldo selecionado.");
				break;
			case 6:
				System.out.println("Obrigado pela preferência!");
				System.exit(0);
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}
	}
}
