package conta;

import java.time.LocalDate;
import java.util.Scanner;

public class Pessoa {
	private String nome;
	private String cpf;
	private Endereco endereco;
	private LocalDate dataNascimento;
	
	public Pessoa() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Infome seu nome: ");
		this.nome = scanner.nextLine();
		System.out.println("Infome seu cpf: ");
		this.cpf = scanner.next();
		System.out.println("Infome sua data de nascimento: ");
		//this.dataNascimento = scanner.();
		this.endereco = new Endereco();
		scanner.close();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
