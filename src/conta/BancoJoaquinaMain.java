package conta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BancoJoaquinaMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Conta> contas = new ArrayList<>();
		//teste
		while (true) {
			System.out.println(
					"---- Bem Vindo(a) ao Banco Joaquina ---- \nDigite: \n\n1 - Abrir conta \n2 - Depósito \n3 - Saque \n4 - Transferência \n5 - Consultar saldo \n6 - Encerrar");
			int opcaoSelecionada = scanner.nextInt();

			switch (opcaoSelecionada) {
			case 1:
				Conta conta = new Conta();
				if(contas.isEmpty()) {
					conta.setNumeroConta("1");
				} else {
					Integer numeroConta = contas.size() + 1;
					conta.setNumeroConta(numeroConta.toString());
				}
				contas.add(conta);
				break;
			case 2:
				System.out.println("Depósito selecionado");
				break;
			case 3:
				System.out.println("Saque selecionado");
				// Solicitar o número da conta
				System.out.print("Digite o número da conta: ");
				int numeroConta = scanner.nextInt();
				// Solicitar o valor do saque
				System.out.print("Digite o valor do saque: ");

				double valorSaque = scanner.nextDouble();
				// Exibir as informações inseridas pelo usuário
				System.out.println("Número da conta: " + numeroConta);
				System.out.println("Valor do saque: " + valorSaque);
				for (conta.Conta conta : contas) {
					if (conta.getNumero() == numeroConta) {
						if (conta.getSaldo() >= valorSaque) {
							double novoSaldo = conta.getSaldo() - valorSaque;
							conta.setSaldo(novoSaldo);
							boolean saqueRealizado = true;
							if (saqueRealizado) {
								System.out.println("Saque realizado com sucesso!");
							}

							else {
								System.out.println("Não foi possível realizar o saque.");
							}
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
