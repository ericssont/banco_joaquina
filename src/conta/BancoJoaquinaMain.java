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
				System.out.println("Informe a conta para depósito: ");
				String numeroConta = scanner.next();
				contaUsuario.setNumeroConta(numeroConta);
				
				for (Conta contaUsuario1 : contas) {
					if (contaUsuario1.getNumeroConta().equals(numeroConta)) {
				    	System.out.print("Informe o valor do Depósito: ");
				        double valorDeposito = scanner.nextDouble();
				        contaUsuario1.setSaldo((contaUsuario1.getSaldo() + valorDeposito));
					
						
						System.out.println("Valor atual da conta: " + contaUsuario1.getSaldo());
				} else {
					System.out.println("O número dessa conta não é válido.");
				}
				}
				
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
